package com.appdev.ankitakarandikar.hello;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {*/


        initDisplayButton();
    }


        public void initDisplayButton()
        {
            Button calculateTip = (Button) findViewById(R.id.Tip_Calculator);
            calculateTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNum = (EditText) findViewById(R.id.Bill_Amount);
                TextView textDisplay = (TextView) findViewById(R.id.Hello);


                double billAmt=Double.parseDouble(editNum.getText().toString());



                double tipCalculate = 0.0;
                if(billAmt<10.0)

                {
                    tipCalculate = 1.0;
                }

                else if(billAmt>10.0 && billAmt<=20.0)

                {
                    tipCalculate = 2.0;
                }

                else if(20.0<billAmt&&billAmt<=30.0)

                {
                    tipCalculate = 3.0;
                }

                else if(30.0<billAmt&&billAmt<=40.0)

                {
                    tipCalculate = 4.0;
                }

                else

                {
                    tipCalculate = 5.0;
                }

                textDisplay.setText("Tip is: "+tipCalculate);

            }
        });
        }



                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/



    }

    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
