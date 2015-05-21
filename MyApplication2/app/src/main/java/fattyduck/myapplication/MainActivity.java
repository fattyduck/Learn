package fattyduck.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ac = (Button)findViewById(R.id.ac);   Button leftparan = (Button)findViewById(R.id.leftParan);   Button rightparen = (Button)findViewById(R.id.rightParan);
        Button percent = (Button)findViewById(R.id.percent);   Button one = (Button)findViewById(R.id.one);   Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);   Button four = (Button)findViewById(R.id.four);   Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);   Button seven = (Button)findViewById(R.id.seven);   Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);   Button zero = (Button)findViewById(R.id.zero);   Button period = (Button)findViewById(R.id.period);
        Button multiply = (Button)findViewById(R.id.multiply);Button divide = (Button)findViewById(R.id.divide);Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);

        ac.setOnClickListener(this);leftparan.setOnClickListener(this);rightparen.setOnClickListener(this);percent.setOnClickListener(this);
        two.setOnClickListener(this);three.setOnClickListener(this);four.setOnClickListener(this);five.setOnClickListener(this);
         six.setOnClickListener(this);seven.setOnClickListener(this);eight.setOnClickListener(this);nine.setOnClickListener(this);
         zero.setOnClickListener(this);period.setOnClickListener(this);one.setOnClickListener(this);plus.setOnClickListener(this);
         minus.setOnClickListener(this);multiply.setOnClickListener(this);divide.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String express = "";
        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText(express);

        switch (v.getId()){
            case R.id.ac:
                express="";
                break;
            case R.id.leftParan:
                express+="(";
                break;
            case R.id.rightParan:
                express+="(";
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
            case R.id.equal:
                break;
        }
    }
}
