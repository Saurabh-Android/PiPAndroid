package com.android.mypipmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocalBroadcastManager.getInstance(this)
                .sendBroadcast(Intent(PipActivity.ACTION_FINISH_PIP_MODE))

        findViewById<Button>(R.id.pip_activity_button).setOnClickListener {
            startActivity(Intent(this, MyPipActivity::class.java))
        }
    }
	//Added comment line here, this change will goes under commit m1
	//Added another comment line here, this change will goes under commit m2
}