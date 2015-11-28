package com.sneha.example2;

import com.sneha.example2.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

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
