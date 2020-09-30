package com.example.score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView show1;
    TextView show2;
    TextView show3;
    TextView show4;
    TextView show6;
    int counter11=0;
    int counter22=0;
    int counter33=0;
    int counter44=0;
    int counter66=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show1=(TextView) findViewById(R.id.counter1);
        show2=(TextView) findViewById(R.id.counter2);
        show3=(TextView) findViewById(R.id.counter3);
        show4=(TextView) findViewById(R.id.counter4);
        show6=(TextView) findViewById(R.id.counter6);
    }
    public void count1 (View view){
    counter11++;
    show1.setText(Integer.toString(counter11));

    }

    public void count2 (View view){


            counter22++;

            show2.setText(Integer.toString(counter22));



    }
    public void count3 (View view) {
        counter33++;
        counter22=0;
        show3.setText(Integer.toString(counter33));
        show2.setText(Integer.toString(counter22));

    }

    public void count4 (View view){


        counter44++;

        show4.setText(Integer.toString(counter44));
    }

    public void count6 (View view){
        counter66++;
        show6.setText(Integer.toString(counter66));

    }

    public void count5 (View view) {
        counter33=0;
        counter22=0;
        counter11=0;
        counter44=0;
        counter66=0;
        show3.setText(Integer.toString(counter33));
        show2.setText(Integer.toString(counter22));
        show1.setText(Integer.toString(counter11));
        show4.setText(Integer.toString(counter44));
        show6.setText(Integer.toString(counter66));
    }



}

