package com.startitup.phiraphon.mycalculate2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtUser = (EditText)findViewById(R.id.edtUsername);
        final String uname = edtUser.getText().toString();
        final EditText edtPass = (EditText)findViewById(R.id.edtPass);
        final String pass = edtPass.getText().toString();
        final Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent change = new Intent(getApplicationContext(),CalculateActivity.class);
                startActivity(change);

                if (uname.equals("admin") && pass.equals("1234")){
//                    Intent change = new Intent(getApplicationContext(),CalculateActivity.class);
//                    startActivity(change);
                }
            }
        });

    }
}
