package com.example.app1511;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mBtnString , mBtnArray, mBtObject, mBtnGallery, mBtnCamera;
    ImageView mImg ;
    int REQUEST_CODE_CAMERA;
    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnString = findViewById(R.id.buttonString1);
        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, MainActivity2.class);
                intent.putExtra(Appcontrain.KEY_STRING, "Hello");
               startActivity(intent);
            }
        });
         mBtnArray = findViewById(R.id.buttonArray);
         mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] arraynumber = {1,2,3,4,5,6};
                Intent intent = new Intent( MainActivity.this, MainActivity2.class);
                intent.putExtra(Appcontrain.KEY_ARRAY, arraynumber);
                startActivity(intent);
            }
        });
         mBtObject = findViewById(R.id.buttonObject);
         mBtObject.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ArrayList<Persion> persions = new ArrayList<>();
                 persions.add(new Persion("Nguyen Van Nam",23));
                 Intent intent =  new Intent( MainActivity.this, MainActivity2.class);
                 intent.putExtra(Appcontrain.KEY_OBJECT, (Serializable) persions);
                 startActivity(intent);
             }
         });
         // ngày 27
        mBtnGallery = findViewById(R.id.buttonGallery);
        mBtnCamera = findViewById(R.id.buttonCamera);
        mImg = findViewById(R.id.image1test);
        mBtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, REQUEST_CODE_CAMERA);
            }
        });
    }
}