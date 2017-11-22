package com.startitup.phiraphon.mycalculate2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    int first;
    int secound;
    int output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        final EditText edt01 = (EditText)findViewById(R.id.edtFirst);
        final EditText edt02 = (EditText)findViewById(R.id.edtSecound);
        final TextView txt01 = (TextView)findViewById(R.id.txtValue);
        Button btn01 = (Button)findViewById(R.id.btnPlus);
        Button btn02 = (Button)findViewById(R.id.btnMinus);
        Button btno3 = (Button)findViewById(R.id.btnMultiply);
        Button btn04 = (Button)findViewById(R.id.btnDivid);


        //output = 0;

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.valueOf(edt01.getText().toString());
                secound = Integer.valueOf(edt02.getText().toString());
                output = first + secound;
                txt01.setText(String.valueOf(output));
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.valueOf(edt01.getText().toString());
                secound = Integer.valueOf(edt02.getText().toString());
                output = first - secound;
                txt01.setText(String.valueOf(output));
            }
        });

        btno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.valueOf(edt01.getText().toString());
                secound = Integer.valueOf(edt02.getText().toString());
                output = first * secound;
                txt01.setText(String.valueOf(output));
            }
        });

        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.valueOf(edt01.getText().toString());
                secound = Integer.valueOf(edt02.getText().toString());
                output = first / secound;
                txt01.setText(String.valueOf(output));
            }
        });
    }
}
