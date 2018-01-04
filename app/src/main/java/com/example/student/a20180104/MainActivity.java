package com.example.student.a20180104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        /*TextView tv=new TextView(this);//m1
                tv.setText("hello world");*/

         Button btn=new Button(this);//m2
        btn.setText("click me");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"go",Toast.LENGTH_SHORT).show();
            }
        });


        LinearLayout layout=new LinearLayout(this);
        //layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(btn);
       setContentView(layout);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Toast.makeText(MainActivity.this, height + "," + width, Toast.LENGTH_SHORT).show();

    }
}
