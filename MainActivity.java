package com.example.myapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAdd,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btngo;
    TextView textResult;
    EditText edit1,edit2;
    String num1, num2;
    Integer result;
    RadioButton radio1,radio2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("건강계산기");

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);

        textResult = (TextView) findViewById(R.id.textResult);

        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);

        btngo = (Button) findViewById(R.id.btngo);

        Toast.makeText(getApplicationContext(),"안녕하십니까. 칼로리계산기입니다."
                ,Toast.LENGTH_SHORT).show();

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                if(radio1.isChecked()==false && radio2.isChecked()== false) {
                    Toast.makeText(getApplicationContext(),"성별을 선택해주시기 바랍니다."
                            ,Toast.LENGTH_SHORT).show();
                }
                else if(radio1.isChecked()==true) {
                    if(result > 2700)
                    {
                        Toast.makeText(getApplicationContext(),"남성기준 1일 권장칼로리를 초과하였습니다.",
                                Toast.LENGTH_SHORT).show();
                        textResult.setText("계산 결과 : "+result.toString());
                    }
                    else{
                        textResult.setText("계산 결과 : "+result.toString());
                    }
                }
                else if(radio2.isChecked()==true) {
                    if(result > 2000)
                    {
                        Toast.makeText(getApplicationContext(),"여성기준 1일 권장칼로리를 초과하였습니다.",
                                Toast.LENGTH_SHORT).show();
                        textResult.setText("계산 결과 : "+result.toString());
                    }
                    else{
                        textResult.setText("계산 결과 : "+result.toString());
                    }
                }
                return false;
            }
        });

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"313kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"505kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"500kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"460kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"768kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"304kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"131kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"1076kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"2128kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"450kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"86kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"368kcal",Toast.LENGTH_SHORT).show();
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"19kcal",Toast.LENGTH_SHORT).show();
            }
        });

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio1.isChecked()==true)
                {
                    radio2.setChecked(false);
                }
            }
        });

        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio2.isChecked()==true)
                {
                    radio1.setChecked(false);
                }
            }
        });
    }

}