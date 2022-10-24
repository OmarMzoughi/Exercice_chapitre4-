package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;                   

public class MainActivity extends AppCompatActivity {

    @Override  
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =(Button)findViewById(R.id.btnConvertir);
        b.setonclicklistener(
                new onclicklistener() {
                    public void onclick (view v ) {
                        RadioButto


                        n r1=(new RadioButton findviewbyId(R.id.verspound) ;
                        EditText s = (EditText) findViewById(R.id.poids)).getText();
                        Double poids=new Double(s.toString());
                        Double res1;
                        if (r1.isChecked())
                            res1 = poids * 2.2; Else
                                res1 = poids/2.2;
                        Toast.makeText(getApplicationContext()
                                ,
                                res1.toString(), 1000).show();

                    } } );


                }

    }                              
