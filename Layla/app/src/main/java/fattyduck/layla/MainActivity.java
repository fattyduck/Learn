package fattyduck.layla;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button quackButton = (Button)findViewById(R.id.QuackButton);

        quackButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView quacktext = (TextView) findViewById(R.id.QuackText);
                        quacktext.setText("Good Job!");
                    }
                }
        );

        quackButton.setOnLongClickListener(
          new Button.OnLongClickListener(){
              public boolean onLongClick(View v){
                  TextView tv = (TextView)findViewById(R.id.QuackText);
                  tv.setText("Good Long Job");
                  return false;
              }
          }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
