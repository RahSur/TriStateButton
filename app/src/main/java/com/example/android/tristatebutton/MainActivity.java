package com.example.android.tristatebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SegmentedButtonGroup sgb = (SegmentedButtonGroup) findViewById(R.id.segbtn);

        sgb.setOnClickedButtonPosition(new SegmentedButtonGroup.OnClickedButtonPosition() {
            @Override
            public void onClickedButtonPosition(int position) {
                if(position == 0)
                    Toast.makeText(getApplicationContext(),"Normal Mode",Toast.LENGTH_SHORT).show();
                else if(position == 1)
                    Toast.makeText(getApplicationContext(),"Eco Mode",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Normal Mode",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
