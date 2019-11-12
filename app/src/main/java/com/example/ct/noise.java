package com.example.ct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class noise extends AppCompatActivity {
    Button enter;
    RadioGroup cha;
    RadioButton bsc;
    SeekBar seekBar;
    TextView seek;
    EditText message,s1,s2,s3,s4,s5;
    float p=0;
    int bec=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noise);
        enter = findViewById(R.id.gen);
        cha = findViewById(R.id.cha);
        seekBar = findViewById(R.id.seekBar);
        seek = findViewById(R.id.seek);
        message = findViewById(R.id.message);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        bsc = findViewById(R.id.BSC);
        final Random rand = new Random();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seek.setText(String.valueOf((float)progress/100));
                p=(float)progress/100;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mess=String.valueOf("");
                String ans=String.valueOf("");
                float noise;
                int length = message.length();
                int [] messageArray = new int [length];
                for(int i=0;i<length;i++){
                    messageArray[i]=message.getText().charAt(i)%2;
                }
                for(int i=0;i<length;i++){
                    mess = mess + messageArray[i];
                }
                message.setText("");
                message.setText(mess);

                if(bsc.isChecked()==true){
                    bec=0;
                }
                else{
                    bec=1;
                }


                for (int loop=1;loop<=5;loop++) {
                    ans="";
                    for (int i = 0; i < length; i++) {
                        noise = (float) (Math.random()%100);
                        switch (bec) {
                            case 0:
                                if (noise < p) {
                                    ans = ans + (messageArray[i] + 1) % 2 ;
                                } else {
                                    ans = ans + messageArray[i] ;
                                }

                                break;
                            case 1:
                                if (noise < p) {
                                    ans = ans + "-1" ;

                                } else {
                                    ans = ans + messageArray[i];
                                }
                                break;
                        }
                    }
                    if(loop==1){
                        s1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ans.length())});
                        s1.setText(ans);
                    }
                    else if(loop==2){
                        s2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ans.length())});
                        s2.setText(ans);
                    }
                    else if(loop==3){
                        s3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ans.length())});
                        s3.setText(ans);
                    }
                    else if(loop==4){
                        s4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ans.length())});
                        s4.setText(ans);
                    }
                    else{
                        s5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ans.length())});
                        s5.setText(ans);
                    }
                }


            }
        });

    }

}
