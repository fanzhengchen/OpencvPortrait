package org.opencv.samples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.opencv.samples.cameracalibration.CameraCalibrationActivity;
import org.opencv.samples.puzzle15.Puzzle15Activity;
import org.opencv.samples.tutorial1.Tutorial1Activity;
import org.opencv.samples.tutorial2.Tutorial2Activity;
import org.opencv.samples.tutorial3.Tutorial3Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.Puzzle15Activity)
    public void onClickPuzzle15Activity(View view) {
        startActivity(new Intent(this, Puzzle15Activity.class));
    }

    @OnClick(R.id.CameraCalibration)
    public void onClickCameraCalibration(View view) {
        startActivity(new Intent(this, CameraCalibrationActivity.class));
    }

    @OnClick(R.id.Tutorial3)
    public void onClickTutorial3(View view) {
        startActivity(new Intent(this, Tutorial3Activity.class));
    }

    @OnClick(R.id.Tutorial2)
    public void onClickTutorial2(View view) {
        startActivity(new Intent(this, Tutorial2Activity.class));
    }

    @OnClick(R.id.Tutorial1)
    public void onClickTutorial1(View view) {
        startActivity(new Intent(this, Tutorial1Activity.class));
    }
}
