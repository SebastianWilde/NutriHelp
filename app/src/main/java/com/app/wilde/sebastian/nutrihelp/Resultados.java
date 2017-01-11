package com.app.wilde.sebastian.nutrihelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    TextView sum6pli,mgrasacarter,mresidual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        sum6pli=(TextView)findViewById(R.id.sum6pli);
        mgrasacarter=(TextView)findViewById(R.id.mgrasacarter);
        mresidual=(TextView)findViewById(R.id.mresidual);
        Bundle b=this.getIntent().getExtras();
        sum6pli.setText(b.getString("sum6pli"));
        mgrasacarter.setText(b.getString("mgrasacarter"));
        mresidual.setText(b.getString("mresidual"));
    }
}
