package com.example.elevnthdayonsensor;

import android.os.Bundle;

import java.util.List;

//import android.app.Activity;
import android.app.ListActivity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.Menu;
import android.widget.ArrayAdapter;
//import android.widget.ListView;

public class MainActivity extends ListActivity {
	SensorManager sm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sm=(SensorManager) getSystemService(SENSOR_SERVICE);
		List<Sensor> s=sm.getSensorList(Sensor.TYPE_ALL);
		ArrayAdapter<Sensor> adapter=new ArrayAdapter<Sensor>(MainActivity.this, android.R.layout.simple_list_item_1,s);
		setListAdapter(adapter);
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
