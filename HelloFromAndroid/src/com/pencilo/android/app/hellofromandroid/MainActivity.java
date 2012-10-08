package com.pencilo.android.app.hellofromandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void bnb(View v){
    	
    	TextView tv = (TextView)findViewById(R.id.textView1);
    	tv.setText("HELLLOLOLOLOLOO");
    	
    }
}