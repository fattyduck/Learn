package fattyduck.droidcalc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button ac; Button leftparan; Button rightparen; Button percent; Button one; Button two;
    Button three; Button four; Button five;  Button six; Button seven; Button eight; Button nine;
    Button zero;  Button period;  Button multiply; Button divide; Button plus; Button minus; Button equal;
    Button about; Button rad; Button abs; Button inv; Button sin; Button ln; Button pi; Button cos;
    Button log; Button e; Button tan; Button sqrt; Button notinv; Button exp; Button xy;
    String express = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac = (Button)findViewById(R.id.ac);   leftparan = (Button)findViewById(R.id.leftParan);   rightparen = (Button)findViewById(R.id.rightParan);
        percent = (Button)findViewById(R.id.percent);  one = (Button)findViewById(R.id.one);   two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);   four = (Button)findViewById(R.id.four);    five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);   seven = (Button)findViewById(R.id.seven);  eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);   zero = (Button)findViewById(R.id.zero);   period = (Button)findViewById(R.id.period);
        multiply = (Button)findViewById(R.id.multiply);divide = (Button)findViewById(R.id.divide); plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus); equal = (Button) findViewById(R.id.equal); about = (Button)findViewById(R.id.about);
        rad = (Button)findViewById(R.id.rad); abs= (Button)findViewById(R.id.abs); inv = (Button)findViewById(R.id.inv); sin= (Button)findViewById(R.id.sin);
        ln = (Button)findViewById(R.id.ln); pi= (Button)findViewById(R.id.pi); cos= (Button)findViewById(R.id.cos); log= (Button)findViewById(R.id.log);
        e = (Button)findViewById(R.id.e); tan= (Button)findViewById(R.id.tan); sqrt= (Button)findViewById(R.id.sqrt); xy = (Button)findViewById(R.id.xy);
        notinv = (Button)findViewById(R.id.notinv); exp = (Button)findViewById(R.id.exp);

        ac.setOnClickListener(this);leftparan.setOnClickListener(this);rightparen.setOnClickListener(this);percent.setOnClickListener(this);
        two.setOnClickListener(this);three.setOnClickListener(this);four.setOnClickListener(this);five.setOnClickListener(this);
        six.setOnClickListener(this);seven.setOnClickListener(this);eight.setOnClickListener(this);nine.setOnClickListener(this);
        zero.setOnClickListener(this);period.setOnClickListener(this);one.setOnClickListener(this);plus.setOnClickListener(this);
        minus.setOnClickListener(this);multiply.setOnClickListener(this);divide.setOnClickListener(this);  equal.setOnClickListener(this);

       if(about !=null ) {
           about.setOnClickListener(this);
           rad.setOnClickListener(this);
           inv.setOnClickListener(this);
           sin.setOnClickListener(this);
           ln.setOnClickListener(this);
           pi.setOnClickListener(this);
           cos.setOnClickListener(this);
           log.setOnClickListener(this);
           e.setOnClickListener(this);
           tan.setOnClickListener(this);
           sqrt.setOnClickListener(this);
           notinv.setOnClickListener(this);
           exp.setOnClickListener(this);
           xy.setOnClickListener(this);
           abs.setOnClickListener(this);
       }
    }


    @Override
    public void onClick(View v) {

        TextView tv = (TextView)findViewById(R.id.tv);
        String euler = String.valueOf(Math.E);
        String result="";


        if(v.getId()==R.id.inv) {
            sin.setText("asin");
            cos.setText("acos");
            tan.setText("atan");
            ln.setText("ex");
            log.setText("10x");
            sqrt.setText("x2");
        }

        if(v.getId()==R.id.notinv) {
            sin.setText("sin");
            cos.setText("cos");
            tan.setText("tan");
            ln.setText("ln");
            log.setText("log");
            sqrt.setText("sqrt");
        }
      


        switch (v.getId()){
            case R.id.ac:
                express="";
                break;
            case R.id.leftParan:
                express+="(";
                break;
            case R.id.rightParan:
                express+=")";
                break;
            case R.id.percent:
                express+="%";
                break;
            case R.id.one:
                express+="1";
                break;
            case R.id.two:
                express+="2";
                break;
            case R.id.three:
                express+="3";
                break;
            case R.id.four:
                express+="4";
                break;
            case R.id.five:
                express+="5";
                break;
            case R.id.six:
                express+="6";
                break;
            case R.id.seven:
                express+="7";
                break;
            case R.id.eight:
                express+="8";
                break;
            case R.id.nine:
                express+="9";
                break;
            case R.id.zero:
                express+="0";
                break;
            case R.id.multiply:
                express+="*";
                break;
            case R.id.divide:
                express+="/";
                break;
            case R.id.plus:
                express+="+";
                break;
            case R.id.minus:
                express+="-";
                break;
            case R.id.period:
                express+=".";
                break;
            case R.id.rad:
                express+="RAD(";
                break;

            case R.id.sin:
                if(sin.getText().toString()=="sin"){
                    express+="SIN(";
                }else{
                    express+="ASIN(";
                }
                break;
            case R.id.cos:
                if(cos.getText().toString()=="cos"){
                    express+="COS(";
                }else{
                    express+="ACOS(";
                }
                break;
            case R.id.tan:
                if(tan.getText().toString()=="tan"){
                    express+="TAN(";
                }
                else{
                    express+="ATAN(";
                }
                break;
            case R.id.ln:
                if(ln.getText().toString()=="ln"){
                    express+="LOG(";
                }
                else{
                    express+=euler+"^";
                }
                break;
            case R.id.log:
                if(log.getText().toString()=="log"){
                    express+="LOG10(";
                }
                else{
                    express+="10^";
                }
                break;
            case R.id.sqrt:
                if(sqrt.getText().toString()=="sqrt"){
                    express+="SQRT(";
                }
                else{
                    express+="^2";
                }
                break;
            case R.id.pi:
                express+="PI";
                break;
            case R.id.e:
                express+=euler;
                break;

            case R.id.xy:
                express+="^";
                break;
            case R.id.abs:
                express+="ABS(";
                break;
            case R.id.about:
                Intent i = new Intent(this, About.class);
                startActivity(i);
        }
        tv.setText(express);

        if(v.getId() == R.id.equal){
            try{
                Expression expression = new Expression(express);
                BigDecimal results = expression.eval();
                result = String.valueOf(results.doubleValue());
                tv.setText(result);
            }catch (Exception i){
                tv.setText("Error");
            }
        }


    }
}

