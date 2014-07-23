package com.bycolor.test3;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.DroidGap;

//import android.app.Activity;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    //setContentView(R.layout.activity_main);
		super.init();
		super.clearCache();
		super.loadUrl("file:///android_asset/www/conectare.html");
        super.loadUrl("file:///android_asset/www/detalii_comanda.html");
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
