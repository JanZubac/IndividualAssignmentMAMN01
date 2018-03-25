package com.example.jan.individualassignmentmamn01;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AccelerometerActivity extends AppCompatActivity implements SensorEventListener{
    private final SensorManager mSensorManager;
    private final Sensor mAccelerometer;
    private TextView x, y, z;

    public AccelerometerActivity() {
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);
        x = (TextView) findViewById(R.id.x);
        y = (TextView) findViewById(R.id.y);
        z = (TextView) findViewById(R.id.z);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
    x.setText("X: " + Math.round(event.values[0]));
    y.setText("Y: " + Math.round(event.values[1]));
    z.setText(">: " + Math.round(event.values[2]));
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
