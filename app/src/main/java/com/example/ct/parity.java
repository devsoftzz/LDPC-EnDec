package com.example.ct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class parity extends AppCompatActivity {

    TextView value;
    EditText N;
    Button answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parity);

        value =(TextView) findViewById(R.id.val1);
        N =  findViewById(R.id.N);
        answer =(Button) findViewById(R.id.answer);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n,k;
                String ans=String.valueOf("");
                n=Integer.valueOf(N.getText().toString());
                k=(int)Math.pow(Math.sqrt(n)-1,2);

                int[][] a= new int[n-k][n];


                for(int i=0;i<n-k;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        a[i][j]=0;
                    }
                }

                int temp1=(int) Math.sqrt(k);
                int temp2=(int) Math.sqrt(n);
                int count=0;

                for(int i=0;i<temp1;i++)
                {
                    for(int j=count;j<count+temp2;j++)
                    {
                        a[i][j]=1;
                    }
                    count+=temp2;
                }


                count=0;

                for(int i=temp1;i<n-k;i++)
                {
                    for(int j=count;j<n;j+=temp1+1)
                    {
                        a[i][j]=1;
                    }
                    count++;
                }

                for(int i=0;i<n-k;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        //cout<<a[i][j]<<" ";
                        ans = ans + String.valueOf(a[i][j]);
                    }
                   // cout<<endl;
                    ans=ans + "\n";
                }
                value.setText(ans);
            }
        });
    }
}
