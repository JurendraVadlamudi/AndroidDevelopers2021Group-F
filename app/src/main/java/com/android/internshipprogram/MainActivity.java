package com.android.internshipprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.goodiebag.pinview.Pinview;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1= findViewById(R.id.btn);
        Pinview pinview1 = findViewById(R.id.pinview1);
        pinview1.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                int n;
                n= Integer.parseInt(pinview.getValue());
                if(n>=0){
                b1.setEnabled(true);
                }
//                Toast.makeText(MainActivity.this, pinview.getValue(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}