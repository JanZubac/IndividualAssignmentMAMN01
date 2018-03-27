package com.example.jan.individualassignmentmamn01;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AccelerometerActivity extends AppCompatActivity implements SensorEventListener{
    private  SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private TextView x, y, z;
    private ConstraintLayout l;
    TextView direc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        l = findViewById(R.id.layout);
        x = (TextView) findViewById(R.id.x);
        y = (TextView) findViewById(R.id.y);
        z = (TextView) findViewById(R.id.z);
        direc = (TextView) findViewById(R.id.direction);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
    x.setText("X: " + Math.round(event.values[0]));
    y.setText("Y: " + Math.round(event.values[1]));
    z.setText("Z: " + Math.round(event.values[2]));

    if(event.values[0] >= 1) {
        l.setBackgroundColor(Color.rgb(255, 0, 0));
        direc.setText("VÄNSTER");
    }
    if(event.values[0] <= -1) {
        l.setBackgroundColor(Color.rgb(0, 255, 0));
        direc.setText("HÖGER");
    }
    if(event.values[0] < 1 && event.values[0] > -1)
        l.setBackgroundColor(Color.rgb(255,0,255));

    }

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener( this, mAccelerometer);
    }

    @Override
    public void onAccuracyChanged(Sensor s, int accuracy) {}

}
