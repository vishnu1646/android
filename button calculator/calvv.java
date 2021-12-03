package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView n1;
    EditText n2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs1, bs2, bm1, bd1,beq,bc;
    Float mvalueone, mvaluetwo;
    boolean gsum, gsub, gmul, gdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (TextView) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bs1 = (Button) findViewById(R.id.bs1);
        bs2 = (Button) findViewById(R.id.bs2);
        bm1 = (Button) findViewById(R.id.bm1);
        bd1 = (Button) findViewById(R.id.bd1);
        beq = (Button) findViewById(R.id.beq);
        bc = (Button) findViewById(R.id.bc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText(n2.getText() + "0");
            }
        });
        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 == null) {
                    n2.setText("");
                } else {
                    mvalueone = Float.parseFloat(n2.getText() + "");
                    gsum = true;
                    n2.setText(null);
                }
            }
        });

        bm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone = Float.parseFloat(n2.getText() + "");
                gmul = true;
                n2.setText(null);

            }
        });

        bd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone = Float.parseFloat(n2.getText() + "");
                gdiv = true;
                n2.setText(null);

            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvaluetwo =Float.parseFloat(n2.getText() + "");
                if (gsum == true) {
                    n2.setText(mvalueone + mvaluetwo + "");
                    gsum = false;
                }
                if (gsub == true) {
                    n2.setText(mvalueone - mvaluetwo + "");
                    gsub = false;
                }
                if (gmul == true) {
                    n2.setText(mvalueone * mvaluetwo + "");
                    gmul = false;
                }
                if (gdiv == true) {
                    n2.setText(mvalueone / mvaluetwo + "");
                    gdiv = false;
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2.setText("");
            }
        });


    }
}