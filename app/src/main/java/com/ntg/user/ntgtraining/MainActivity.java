package com.ntg.user.ntgtraining;

import android.os.Bundle;
<<<<<<< HEAD
import android.util.Log;
import android.widget.Toast;
=======
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
>>>>>>> nafea

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "message", Toast.LENGTH_LONG).show();
        Log.i("tag", "tag");


        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();

        Log.i("nafea", "hello team");
    }
}
