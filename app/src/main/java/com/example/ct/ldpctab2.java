package com.example.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ldpctab2 extends AppCompatActivity {

    TextView r,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldpctab2);

        r = findViewById(R.id.recieved);
        d = findViewById(R.id.decode);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ldpc.MESSAGE);
        String finalM = intent.getStringExtra(ldpc.FINAL);
        r.setText("");
        r.setText(message);
        d.setText(finalM);
    }
    public void home(View View){
        Intent h=new Intent(this,MainActivity.class);
        startActivity(h);
    }

}
