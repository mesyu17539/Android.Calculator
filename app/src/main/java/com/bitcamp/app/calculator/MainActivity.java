package com.bitcamp.app.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputNum1 = findViewById(R.id.input_num1);
        final EditText inputNum2 = findViewById(R.id.input_num2);
        final TextView result=findViewById(R.id.result);
        final Context context=MainActivity.this;


        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Command.changeint(inputNum1,inputNum2,"+"));
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Command.changeint(inputNum1,inputNum2,"-"));
            }
        });
        findViewById(R.id.aster).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Command.changeint(inputNum1,inputNum2,"*"));
            }
        });
        findViewById(R.id.slash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Command.changeint(inputNum1,inputNum2,"/"));
//                int num=Command.changeint(inputNum1)/
//                        Command.changeint(inputNum2);
//                Log.d("나눈 값", String.valueOf(num));
//                Toast.makeText(context,"나눈 값 : "+num,Toast.LENGTH_LONG).show();
//                result.setText("계산결과 : "+num);
            }
        });
    }
}
