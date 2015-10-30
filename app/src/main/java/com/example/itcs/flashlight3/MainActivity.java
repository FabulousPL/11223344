package com.example.itcs.flashlight3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Redbutton:
                LinearLayout l1 = (LinearLayout) findViewById(R.id.layout_id);
                l1.setBackgroundColor(Color.RED);
                break;
            case R.id.Bluebutton:
                LinearLayout l2 = (LinearLayout) findViewById(R.id.layout_id);
                l2.setBackgroundColor(Color.BLUE);
                break;
            case R.id.Whitebutton:
                LinearLayout l3 = (LinearLayout) findViewById(R.id.layout_id);
                l3.setBackgroundColor(Color.WHITE);
                break;
            case R.id.Graybutton:
                LinearLayout l4 = (LinearLayout) findViewById(R.id.layout_id);
                l4.setBackgroundColor(Color.GRAY);
                break;
            case R.id.Yellowbutton:
                LinearLayout l5 = (LinearLayout) findViewById(R.id.layout_id);
                l5.setBackgroundColor(Color.YELLOW);
                break;
            default:
                break;




        }
    }
}
