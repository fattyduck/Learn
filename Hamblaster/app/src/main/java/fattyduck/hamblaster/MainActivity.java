package fattyduck.hamblaster;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.launcheMap);
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent cow = new Intent(this, ActivityB.class);
        startActivity(cow);
    }

    public void process(View v){
        Intent intent = null;
        if(v.getId()==R.id.launcheMap){
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.8777"));
            startActivity(intent);
        }
        if(v.getId()==R.id.launcheMap){

        }
        if(v.getId()==R.id.launcheMap){

        }
    }
}


