package com.bitcamp.app.calculator;

import android.widget.EditText;


/**
 * Created by 1027 on 2018-02-05.
 */

public class Command {
    public static String changeint(EditText num1,EditText num2,String iter) {
        String result;
        int numA=Integer.parseInt(String.valueOf(num1.getText()));
        int numB=Integer.parseInt(String.valueOf(num2.getText()));
        switch(iter){
            case "+":
                result = "계산결과 : "+(numA+numB);
                break;
            case "-":
                result =  "계산결과 : "+(numA-numB);
                break;
            case "/":
                result =  "계산결과 : "+(numA/numB);
                break;
            case "*":
                result =  "계산결과 : "+(numA*numB);
                break;
            default:
                result = "잘못된 입력";
                break;
        }
        return result;
    }
}
