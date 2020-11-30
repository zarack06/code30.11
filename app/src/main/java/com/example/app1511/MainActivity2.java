package com.example.app1511;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
                if (intent != null){
                    // string
                   // String message = intent.getStringExtra(Appcontrain.KEY_STRING);
                   // Toast.makeText(this ,message, Toast.LENGTH_LONG).show();
                    // array
                   // String arrayNum = intent.getStringExtra(Appcontrain.KEY_ARRAY);
                    // Toast.makeText(this , arrayNum.length() + " chieu dai", Toast.LENGTH_LONG).show();
                    // object

                      ArrayList<Persion> persions = (ArrayList<Persion>) intent.getSerializableExtra(Appcontrain.KEY_OBJECT);
                    Toast.makeText(this ,  persions.size() + " chieu dai", Toast.LENGTH_LONG).show();
                }

    }
}