package fattyduck.horoscope;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Navigation extends ActionBarActivity {

    Button display;
    Button userSign;
    Button roman;
    Button game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        display=(Button)findViewById(R.id.signinfobutton);
        userSign=(Button)findViewById(R.id.usersignbutton);
        roman=(Button)findViewById(R.id.romanbutton);
        game=(Button)findViewById(R.id.gamebutton);
    }

    public void disbut(View v){
        Intent i = new Intent(this,DisplaySign.class);
        startActivity(i);

    }
    public void userbut(View v){
        Intent i = new Intent(this,UserSign.class);
        startActivity(i);
    }
    public void romanbut(View v){
        Intent i = new Intent(this,RomanticCalc.class);
        startActivity(i);
    }
    public void gamebut(View v){
        Intent i = new Intent(this,Game.class);
        startActivity(i);
    }

}
