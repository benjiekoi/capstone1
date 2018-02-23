package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Menu extends AppCompatActivity {

    public static final String EXTRAS_DEVICE_NAME = "DEVICE_NAME";
    public static final String EXTRAS_DEVICE_ADDRESS = "DEVICE_ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
    }
    public void buttonBP(View view)
    {
        Intent intent = new Intent(this,record.class);
        startActivity(intent);
        finish();
    }
    public void buttonRecord(View view)
    {
        Intent intent = new Intent(this,Resultrecord.class);
        startActivity(intent);
    }
    public void buttonProf(View view)
    {
        Intent i = new Intent(this,Profile.class);
        startActivity(i);
    }
    public void buttonHelp(View view)
    {
        Intent i = new Intent(this,Help.class);
        startActivity(i);
    }
    public void buttonLocate(View view)
    {
        Intent i = new Intent(this,ListOnline.class);
        startActivity(i);
    }
}
