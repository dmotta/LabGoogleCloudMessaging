package com.dmotta.gcm.labuno;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class GCMActivityMain extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcm_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gcm_main, menu);
        return true;
    }
    
    public void onClick(View view) {
		Intent i = new Intent(this, RegisterActivity.class);		
		startActivity(i);
	}
}
