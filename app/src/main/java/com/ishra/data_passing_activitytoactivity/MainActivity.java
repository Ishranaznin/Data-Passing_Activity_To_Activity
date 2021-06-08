package com.ishra.data_passing_activitytoactivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       b1=findViewById(R.id.b1) ;
       b1.setOnClickListener(new View.OnClickListener() {
       @Override
           public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,secondactivity.class);
               EditText ev1=(EditText)findViewById(R.id.e3) ;
           EditText ev2=(EditText)findViewById(R.id.e31) ;
           EditText ev3=(EditText)findViewById(R.id.e32) ;

              String k1=ev1.getText().toString();
              String k2=ev2.getText().toString();
              String k3=ev3.getText().toString();

               i.putExtra("v1",k1);
               i.putExtra("v2",k2);
               i.putExtra("v3",k3);
               ev1.setText(" ");
               startActivity(i);
           }
       });

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
