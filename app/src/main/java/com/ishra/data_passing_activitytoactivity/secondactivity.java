package com.ishra.data_passing_activitytoactivity;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
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
        EditText e1=(EditText)findViewById(R.id.E1);
        EditText e2 =(EditText)findViewById(R.id.E2);
        EditText e3=(EditText)findViewById(R.id.ed15);


        String value1=getIntent().getExtras().getString("v1");
        String value2=getIntent().getExtras().getString("v2");
        String value3=getIntent().getExtras().getString("v3");
        e1.setText(value1);
        e2.setText(value2);
        e3.setText(value3);

    }

}
