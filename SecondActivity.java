package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.text.NumberFormat;

public class SecondActivity extends Activity {
    Button btnbmi,btnreturn;
    RadioButton rtn1,rtn2;
    EditText edit3,edit4;
    String n1,n2,result3;
    Double weight,height,result2;
    TextView textResult2;
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
    setContentView(R.layout.second);
    setTitle("BMI 지수 계산기");

    btnbmi = (Button) findViewById(R.id.btnbmi);
    btnreturn = (Button) findViewById(R.id.btnreturn);
    rtn1 = (RadioButton) findViewById(R.id.rtn1);
    rtn2 = (RadioButton) findViewById(R.id.rtn2);
    edit3 = (EditText) findViewById(R.id.edit3);
    edit4 = (EditText) findViewById(R.id.edit4);
    textResult2 = (TextView) findViewById(R.id.textResult2);

        Toast.makeText(getApplicationContext(),"BMI지수 계산기입니다.",Toast.LENGTH_SHORT).show();

    btnbmi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n1 = edit3.getText().toString();
            n2 = edit4.getText().toString();
            weight = Double.parseDouble(n2);
            height = Double.parseDouble(n1);
            result2 = weight/height/height*10000;
            result3 = String.format("%.2f",result2);

            if(rtn1.isChecked()==false && rtn2.isChecked()== false) {
                Toast.makeText(getApplicationContext(),"성별을 선택해주시기 바랍니다."
                        ,Toast.LENGTH_SHORT).show();
            }

            else if (rtn1.isChecked()==true || rtn2.isChecked() ==true) {
                if(result2 < 20.0) {
                    Toast.makeText(getApplicationContext(),"저체중입니다.섭취 필요"
                            ,Toast.LENGTH_SHORT).show();
                    textResult2.setText("BMI 지수 : "+result3);
                }
                else if(result2 >= 20.0 && result2 <25.0) {
                    Toast.makeText(getApplicationContext(),"정상입니다."
                            ,Toast.LENGTH_SHORT).show();
                    textResult2.setText("BMI 지수 : "+result3);
                }
                else if(result2 >= 25.0 && result2 <30.0) {
                    Toast.makeText(getApplicationContext(),"과체중입니다.체중조절 필요"
                            ,Toast.LENGTH_SHORT).show();
                    textResult2.setText("BMI 지수 : "+result3);
                }
                else if(result2 >= 30.0) {
                    Toast.makeText(getApplicationContext(),"비만입니다.체중조절 필수"
                            ,Toast.LENGTH_SHORT).show();
                    textResult2.setText("BMI 지수 : "+result3);
                }
            }

        }
    });
    rtn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(rtn1.isChecked()==true)
                rtn2.setChecked(false);
        }
    });
    rtn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(rtn2.isChecked()==true)
                rtn1.setChecked(false);
        }
    });
    btnreturn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            finish();
        }
    });


    }
}
