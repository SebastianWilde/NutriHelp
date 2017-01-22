package com.app.wilde.sebastian.nutrihelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    TextView sum6pli,mgrasacarter,mresidual,mgrasakg,mmuscularkg,mmuscular,mresidualkg,
            moseakg,mosea;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        sum6pli=(TextView)findViewById(R.id.sum6pli);
        mgrasacarter=(TextView)findViewById(R.id.mgrasacarter);
        mresidual=(TextView)findViewById(R.id.mresidual);
        mgrasakg=(TextView)findViewById(R.id.mgrasakg);
        mmuscularkg=(TextView)findViewById(R.id.mmuscularkg);
        mmuscular=(TextView)findViewById(R.id.mmuscular);
        mresidualkg=(TextView)findViewById(R.id.mresidualkg);
        moseakg=(TextView)findViewById(R.id.moseakg);
        mosea=(TextView)findViewById(R.id.mosea);
        ///Printeo
        Bundle b=this.getIntent().getExtras();
        sum6pli.setText(b.getString("sum6pli"));
        mgrasacarter.setText(b.getString("mgrasacarter"));
        mresidual.setText(b.getString("mresidual"));
        mgrasakg.setText(b.getString("mgrasakg"));
        mmuscularkg.setText(b.getString("mmuscularkg"));
        mmuscular.setText(b.getString("mmuscular"));
        mresidualkg.setText(b.getString("mresidualkg"));
        moseakg.setText(b.getString("moseakg"));
        mosea.setText(b.getString("mosea"));
    }
}
