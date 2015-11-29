package com.krishna.tutorial1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Startingpoint extends Activity {
	
	public void onCreate(Bundle b){
			super.onCreate(b);
			setContentView(R.layout.splash);
			Thread t=new Thread(){
				public void run() {
				try{	
				sleep(5000);	
				} catch (InterruptedException e) {
				e.printStackTrace();
				}finally{
					Intent i=new Intent("com.krishna.tutorial1.SPLASH");
					startActivity(i);	
				}
				
			}

		};
	t.start();
			
	}

}
