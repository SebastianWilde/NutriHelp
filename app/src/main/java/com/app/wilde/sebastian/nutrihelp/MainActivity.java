package com.app.wilde.sebastian.nutrihelp;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.app.wilde.sebastian.nutrihelp.R.id.calcular;
import static com.app.wilde.sebastian.nutrihelp.R.id.limpiar;
import static com.app.wilde.sebastian.nutrihelp.R.id.mgrasakg;

public class MainActivity extends AppCompatActivity {
    //Entradas
    EditText  peso,talla,brazoRelajado,brazoFlexionado,cintura,
    caderas,pantorrilaMax,triceps,subescapular,biceps,
    crestalliaca,supraespinal,abdominal,musloFrontal,pantorrila,
    humeral,femoral,dm;
    //Entradas tipo double
    double pesodb , talladb,brazoRelajadodb,brazoFlexionadodb,cinturadb,
            caderasdb,pantorrilaMaxdb,tricepsdb,subescapulardb,bicepsdb,crestalliacadb,
            supraespinaldb,abdominaldb,musloFrontaldb,pantorriladb,humeraldb,femoraldb,dmdb;
    //Salidas
    double  sum6plidb, mgrasacarterdb,mresidualdb,mgrasakgdb,mmuscularkgdb,mmusculardb,mresidualkgdb,
    moseakgdb,moseadb;
    /////
    Button btncalcular,btnlimpiar;
    RadioButton rbHombre,rbMujer;

    //Funciones
    /*@Override
    public int fun1(EditText a, EditText b, EditText c){
        a.getText().toNumber;
    }*/

    private boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() == 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables de entrada
        peso=(EditText)findViewById(R.id.peso);
        talla=(EditText)findViewById(R.id.talla);
        brazoRelajado=(EditText)findViewById(R.id.brazoRelajado);
        brazoFlexionado=(EditText)findViewById(R.id.brazoFlexionado);
        cintura=(EditText)findViewById(R.id.cintura);
        caderas=(EditText)findViewById(R.id.caderaMax);
        pantorrilaMax=(EditText)findViewById(R.id.pantorrillaMax);
        triceps=(EditText)findViewById(R.id.triceps);
        subescapular=(EditText)findViewById(R.id.subescapular);
        biceps=(EditText)findViewById(R.id.biceps);
        crestalliaca=(EditText)findViewById(R.id.crestalliaca);
        supraespinal=(EditText)findViewById(R.id.supraespinal);
        abdominal=(EditText)findViewById(R.id.abdominal);
        musloFrontal=(EditText)findViewById(R.id.muslofron);
        pantorrila=(EditText)findViewById(R.id.pantorrilla);
        humeral=(EditText)findViewById(R.id.humeral);
        femoral=(EditText)findViewById(R.id.femoral);
        dm=(EditText)findViewById(R.id.dm);
        //boton calcular
        btncalcular=(Button)findViewById(calcular);
        btnlimpiar=(Button)findViewById(limpiar);
        //radio buttons
        rbHombre=(RadioButton)findViewById(R.id.rbHombre);
        rbMujer=(RadioButton)findViewById(R.id.rbMujer);
        ////funcion del boton
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pesodb = talladb = brazoRelajadodb = brazoFlexionadodb = cinturadb =
                        caderasdb = pantorrilaMaxdb = tricepsdb = subescapulardb = bicepsdb = crestalliacadb =
                        supraespinaldb = abdominaldb = musloFrontaldb = pantorriladb = humeraldb = femoraldb = dmdb = 0.0;
                //Trasformando a double y captura de datos
                if (!isEmpty(peso)) pesodb = Double.parseDouble(peso.getText().toString());
                if (!isEmpty(talla)) talladb=Double.parseDouble(talla.getText().toString());
                if (!isEmpty(brazoRelajado)) brazoRelajadodb=Double.parseDouble(brazoRelajado.getText().toString());
                if (!isEmpty(brazoFlexionado)) brazoFlexionadodb=Double.parseDouble(brazoFlexionado.getText().toString());
                if (!isEmpty(cintura)) cinturadb=Double.parseDouble(cintura.getText().toString());
                if (!isEmpty(caderas)) caderasdb=Double.parseDouble( caderas.getText().toString());
                if (!isEmpty(pantorrilaMax)) pantorrilaMaxdb=Double.parseDouble(pantorrilaMax.getText().toString());
                if (!isEmpty(triceps)) tricepsdb=Double.parseDouble( triceps.getText().toString());
                if (!isEmpty(subescapular)) subescapulardb=Double.parseDouble(subescapular.getText().toString());
                if (!isEmpty(biceps)) bicepsdb=Double.parseDouble(biceps.getText().toString());
                if (!isEmpty(crestalliaca)) crestalliacadb=Double.parseDouble(crestalliaca.getText().toString());
                if (!isEmpty(supraespinal)) supraespinaldb=Double.parseDouble(supraespinal.getText().toString());
                if (!isEmpty(abdominal)) abdominaldb=Double.parseDouble(abdominal.getText().toString());
                if (!isEmpty(musloFrontal)) musloFrontaldb=Double.parseDouble(musloFrontal.getText().toString());
                if (!isEmpty(pantorrila)) pantorriladb=Double.parseDouble(pantorrila.getText().toString());
                if (!isEmpty(humeral)) humeraldb=Double.parseDouble(humeral.getText().toString());
                if (!isEmpty(femoral)) femoraldb=Double.parseDouble(femoral.getText().toString());
                if (!isEmpty(dm)) dmdb=Double.parseDouble(dm.getText().toString());
                //
                sum6plidb=mgrasacarterdb=mresidualdb=mgrasakgdb=mmuscularkgdb=mmusculardb=mresidualkgdb=
                        moseakgdb=moseadb=0.0;
                //Operaciones
                sum6plidb = tricepsdb + subescapulardb + supraespinaldb + abdominaldb + musloFrontaldb + pantorriladb;
                if (rbHombre.isChecked()==true) {
                    //System.out.println(sum6plidb);
                    mgrasacarterdb=(0.1051*sum6plidb)+2.585;
                    mresidualkgdb=0.241*pesodb;
                }
                else
                {
                    mgrasacarterdb=(0.1548*sum6plidb)+3.58;
                    mresidualkgdb=0.209*pesodb;
                }
                mresidualdb=(mresidualkgdb*100.0)/pesodb;
                mgrasakgdb=(pesodb*mgrasacarterdb)/100.0;
                moseakgdb=3.02*Math.pow((Math.pow(talladb/100.0,2)*(dmdb/100.0)*(femoraldb/100.0)*400.0),0.712);
                mmuscularkgdb = pesodb - (mgrasakgdb + mresidualkgdb + moseakgdb);
                mmusculardb = (mmuscularkgdb * 100.0)/pesodb;
                moseadb = (moseakgdb * 100.0)/pesodb;
                ///Redondeando resultados a dos decimales

                sum6plidb=Math.round(sum6plidb * 100.0) / 100.0;
                mgrasacarterdb= Math.round(mgrasacarterdb * 100.0) / 100.0;
                mresidualdb=Math.round(mresidualdb * 100.0) / 100.0;
                mgrasakgdb=Math.round(mgrasakgdb * 100.0) / 100.0;
                mmuscularkgdb=Math.round(mmuscularkgdb * 100.0) / 100.0;
                mmusculardb=Math.round(mmusculardb * 100.0) / 100.0;
                mresidualkgdb=Math.round(mresidualkgdb * 100.0) / 100.0;
                moseakgdb=Math.round(moseakgdb * 100.0) / 100.0;
                moseadb=Math.round(moseadb * 100.0) / 100.0;
                //Creación de intent
                Intent intent = new Intent(MainActivity.this,Resultados.class);
                //Para pasar informacion
                /*opcion1
                Bundle sum6,mgrasa;
                sum6=mgrasa= new Bundle();
                sum6.putString("sum6pli",Double.toString(sum6plidb));
                mgrasa.putString("mgrasacarter",Double.toString(mgrasacarterdb));
                intent.putExtras(sum6);
                intent.putExtras(mgrasa);
                */
                /*Opcion 2*/
                intent.putExtra("sum6pli",Double.toString(sum6plidb));
                intent.putExtra("mgrasacarter",Double.toString(mgrasacarterdb));
                intent.putExtra("mresidual",Double.toString(mresidualdb));
                intent.putExtra("mgrasakg",Double.toString(mgrasakgdb));
                intent.putExtra("mmuscularkg",Double.toString(mmuscularkgdb));
                intent.putExtra("mmuscular",Double.toString(mmusculardb));
                intent.putExtra("mresidualkg",Double.toString(mresidualkgdb));
                intent.putExtra("moseakg",Double.toString(moseakgdb));
                intent.putExtra("mosea",Double.toString(moseadb));
                startActivity(intent);
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peso.setText("");
                talla.setText("");
                brazoRelajado.setText("");
                brazoFlexionado.setText("");
                cintura.setText("");
                caderas.setText("");
                pantorrilaMax.setText("");
                triceps.setText("");
                subescapular.setText("");
                biceps.setText("");
                crestalliaca.setText("");
                supraespinal.setText("");
                abdominal.setText("");
                musloFrontal.setText("");
                pantorrila.setText("");
                humeral.setText("");
                femoral.setText("");
                dm.setText("");
            }
        });

    }
}
