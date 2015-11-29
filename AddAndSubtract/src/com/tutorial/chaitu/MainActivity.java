package com.tutorial.chaitu;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	int counter;
	 Button add,sub;
	TextView display;
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.addButton);
        sub=(Button)findViewById(R.id.subButton);
        display=(TextView)findViewById(R.id.textdisplay);
        
        add.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			counter++;
			display.setText("your result is>>"+counter);
			}
		});
        
        sub.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			counter--;	
			display.setText("your result is>>"+counter);
			}
		});
        
        
        
        
    }
}
