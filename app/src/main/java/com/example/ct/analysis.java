package com.example.ct;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class analysis extends AppCompatActivity {
    ImageView pic1;
    ImageView pic2;
    ImageView pic3;
    ImageView pic4;
    ImageView pic5;
    ImageView pic6;
    ImageView pic7;
    ImageView pic8;
    ImageView pic9;
    ImageView pic10;
    ImageView pic11;
    ImageView pic12;
    ImageView pic13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);

        pic1 =findViewById(R.id.img1);
        pic2=findViewById(R.id.img2);
        pic3 =findViewById(R.id.img3);
        pic4=findViewById(R.id.img4);
        pic5 =findViewById(R.id.img5);
        pic6=findViewById(R.id.img6);
        pic7 =findViewById(R.id.img7);
        pic8=findViewById(R.id.img8);
        pic9 =findViewById(R.id.img9);
        pic10=findViewById(R.id.img10);
        pic11 =findViewById(R.id.img11);
        pic12=findViewById(R.id.img12);
        pic13=findViewById(R.id.img13);

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.g);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.f1);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.a);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.b);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.c);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.d);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.e);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.h);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.i);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.j);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.k);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.l);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        pic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(analysis.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_custom_layout,null);
                ImageView photoView = mView.findViewById(R.id.zoom);
                photoView.setImageResource(R.drawable.m);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


    }

}
