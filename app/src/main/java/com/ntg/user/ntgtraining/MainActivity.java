package com.ntg.user.ntgtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////////////////////////
        Toast.makeText(this, "message", Toast.LENGTH_LONG).show();
        Log.i("tag", "tag");
        TextView tv = findViewById(R.id.tvTxtView);
        tv.setText("Hello There");

    }
}
