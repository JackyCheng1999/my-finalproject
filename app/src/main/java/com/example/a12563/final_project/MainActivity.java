package com.example.a12563.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonjia;
    private Button buttonjian;
    private Button buttoncheng;
    private Button buttonchu;
    private Button buttonc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.textView);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(1);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(2);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(3);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(4);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(5);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(6);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(7);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(8);
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(9);
            }
        });

        button0 = (Button) findViewById(R.id.button11);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press(0);
            }
        });

        buttonjia = (Button) findViewById(R.id.button10);
        buttonjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press2(1);
            }
        });

        buttonjian = (Button) findViewById(R.id.button13);
        buttonjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press2(2);
            }
        });

        buttoncheng = (Button) findViewById(R.id.button14);
        buttoncheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press2(3);
            }
        });

        buttonchu = (Button) findViewById(R.id.button15);
        buttonchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press2(4);
            }
        });

        buttonc = (Button) findViewById(R.id.button12);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Press3();
            }
        });
    }
    private int a = 0;
    private int b = 0;
    private int f = 0;
    private String s = "";

    public void Press(int x) {
        if (f == 0) {
            a = a * 10 + x;
            s = String.valueOf(a);
        } else {
            b = b * 10 + x;
            s = String.valueOf(b);
        }
        txt.setText(s);
    }

    public void Press2(int x) {
        if (f == 0) {
            f = x;
            return;
        }
        if (f == 1) {
            a = a + b;
        }
        if (f == 2) {
            a = a - b;
        }
        if (f == 3) {
            a = a * b;
        }
        if (f == 4) {
            a = a / b;
        }
        s = String.valueOf(a);
        txt.setText(s);
        b = 0;
        f = 0;
    }

    public void Press3() {
        a = 0;
        f = 0;
        b = 0;
        txt.setText("0");
    }
}
