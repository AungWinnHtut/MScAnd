package com.example.com.engineer4myanmar.rtrs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void funHistory(View v)
    {
    	Intent intent = new Intent(this,HistoryActivity.class);
    	startActivity(intent);
    }
    
    public void funcReservation(View v)
    {
    	Intent intent = new Intent(this,Reservation.class);
    	startActivity(intent);
    }
  
}
