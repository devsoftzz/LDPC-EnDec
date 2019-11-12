package com.example.ct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class product_en extends AppCompatActivity {

    Button button;
    TextView view;
    EditText message,K;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_en);
        K = findViewById(R.id.K);
        message = findViewById(R.id.message);
        button = findViewById(R.id.button);
        view = findViewById(R.id.view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int k;

                k=Integer.valueOf(K.getText().toString());
                int [] messageArray = new int [k];
                int i,j;
                for(i=0;i<k;i++){
                    messageArray[i]=message.getText().charAt(i)%2;
                }
                int n;
                //n is all bits, n-k parity bits
                int flag;
                String ans=String.valueOf("");

                flag=(int)Math.sqrt(k);

                n = flag + 1 ;
                n = n*n ;
                int[][] generator = new int[n][k];
                for(i=0;i<n;i++) {
                    for (j = 0; j < k; j++) {
                        generator[i][j] = 0;
                    }
                }
                int count=0;
                int count2=0;
                int flag3=0;

                for(i=1;i<n;i++)
                {
                    if(i % (flag+1) !=0 && count<k)
                    {
                        generator[i-1][count]=1;
                        count++;
                    }
                    else
                    {
                        if(i<n-flag)
                        {
                            for(j=count2;j<count;j++)
                                generator[i-1][j]=1;

                            count2+=flag;
                        }
                        else
                        {
                            for(j=flag3;j<k;j+=flag)
                                generator[i-1][j]=1;

                            flag3++;
                        }
                    }
                }
                for(i=0;i<k;i++)
                    generator[n-1][i]=1;

                int sum=0;
                for(i=1;i<=n;i++)
                {
                    for(j=0;j<k;j++)
                    {
                        sum = sum + generator[i-1][j]*messageArray[j];
                    }

                    ans=ans + sum%2 + " ";
                    if(i%(Math.sqrt(k)+1)==0){
                        ans=ans+"\n";
                    }
                    sum=0;
                }

                view.setText(ans);
            }
            });
        }
    }

