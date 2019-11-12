package com.example.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ldpc extends AppCompatActivity {
    public static final String MESSAGE = "com.example.ct.example.MESSAGE";
    public static final String FINAL = "com.example.ct.example.FINAL";

    EditText bit,K,message,pa;
    Button enter;
    String mess;
    String finalM= String.valueOf("");
    String parity=String.valueOf("");
    String parity2=String.valueOf("");
    public void open(){
        Intent tab = new Intent(this, ldpctab2.class);
        tab.putExtra(MESSAGE,mess);
        tab.putExtra(FINAL,finalM);
        startActivity(tab);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldpc);
        bit = findViewById(R.id.N);
        K = findViewById(R.id.K);
        message = findViewById(R.id.message);
        pa = findViewById(R.id.parity);
        enter = findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mess = message.getText().toString();
                finalM="";
                //String parity="";
                for (int i = 0; i < pa.getText().length(); i++) {
                    if(pa.getText().charAt(i)=='\n')
                    {
                        i++;
                    }
                    parity = parity + pa.getText().charAt(i);
                }

                int n= Integer.valueOf(bit.getText().toString());
                int k, i, j;
               k = n - Integer.valueOf(K.getText().toString());

                int[] msgbits = new int[n];

                int count=0;
                for (i = 0; i < n; i++) {
                    if(mess.charAt(count)=='-'){
                        msgbits[i]=-1;
                        count++;
                    }
                    else {
                        msgbits[i] = mess.charAt(count);
                        msgbits[i]%=2;
                    }
                    count++;
                    finalM = finalM + msgbits[i];
                }
                finalM=finalM+'\n';
                int[][] paritycheck = new int[k][n];
              /*  paritycheck[0][0]=1;
                paritycheck[0][1]=1;
                paritycheck[0][2]=1;
                paritycheck[0][3]=0;
                paritycheck[0][4]=0;
                paritycheck[0][5]=0;
                paritycheck[0][6]=0;
                paritycheck[0][7]=0;
                paritycheck[0][8]=0;

                paritycheck[1][0]=0;
                paritycheck[1][1]=0;
                paritycheck[1][2]=0;
                paritycheck[1][3]=1;
                paritycheck[1][4]=1;
                paritycheck[1][5]=1;
                paritycheck[1][6]=0;
                paritycheck[1][7]=0;
                paritycheck[1][8]=0;

                paritycheck[2][0]=1;
                paritycheck[2][1]=0;
                paritycheck[2][2]=0;
                paritycheck[2][3]=1;
                paritycheck[2][4]=0;
                paritycheck[2][5]=0;
                paritycheck[2][6]=1;
                paritycheck[2][7]=0;
                paritycheck[2][8]=0;

                paritycheck[3][0]=0;
                paritycheck[3][1]=1;
                paritycheck[3][2]=0;
                paritycheck[3][3]=0;
                paritycheck[3][4]=1;
                paritycheck[3][5]=0;
                paritycheck[3][6]=0;
                paritycheck[3][7]=1;
                paritycheck[3][8]=0;

                paritycheck[4][0]=0;
                paritycheck[4][1]=0;
                paritycheck[4][2]=1;
                paritycheck[4][3]=0;
                paritycheck[4][4]=0;
                paritycheck[4][5]=1;
                paritycheck[4][6]=0;
                paritycheck[4][7]=0;
                paritycheck[4][8]=1;*/
                int z = 0;
                for (i = 0; i < k; i++) {
                    for (j = 0; j < n; j++) {
                        paritycheck[i][j] = parity.charAt(z);
                        z++;
                    }
                }
                for (i = 0; i < k; i++) {
                    for (j = 0; j < n; j++) {

                       paritycheck[i][j]=paritycheck[i][j]%2;
                      // parity2=parity2+paritycheck[i][j];
                    }
                    //parity2=parity2+"\n";
                }

                int[][] check = new int[k][n];
                int[][] check2 = new int[k][n];
               // int count = 0;
                int itteration = 1;
                int change = 0;

                //for checking 1st round.....

                int[] sum = new int[k];
                int[] zeros = new int[n];
                int[] minus = new int[k];
                int[] ones = new int[n];
                int[] cnt = new int[k];
                int[] twos = new int[n];
                int[] msgbits2 = new int[n];
                /*for(j=0;j<n;j++){
                    msgbits2[j]=0;
                }*/
                for (j = 0; j < k; j++) {
                    for (i = 0; i < n; i++) {
                        check[j][i] = 2;
                        check2[j][i] = 2;
                        zeros[i] = 0;
                        ones[i] = 0;
                        twos[i] = 0;
                    }
                    sum[j] = 0;
                    cnt[j] = 0;
                    minus[j] = 0;
                }

                for (j = 0; j < k; j++) {
                    for (i = 0; i < n; i++) {
                        if (paritycheck[j][i] == 1) {
                            check[j][i] = msgbits[i];
                            cnt[j]++;
                        }
                        if (check[j][i] != 2 && check[j][i] != -1) {
                            sum[j] = sum[j] + check[j][i];
                        }
                        if (check[j][i] != 2 && check[j][i] == -1)
                            minus[j]++;
                    }
                }

                for (i = 0; i < n; i++) {
                    for (j = 0; j < k; j++) {
                        if (check[j][i] != 2 && msgbits[i] != -1) {
                            if (minus[j] > 0)
                                check2[j][i] = -1;
                            if (minus[j] == 0)
                                check2[j][i] = (sum[j] - msgbits[i]) % 2;

                        }
                        if (check[j][i] != 2 && msgbits[i] == -1) {
                            if (minus[j] == 1)
                                check2[j][i] = (sum[j]) % 2;
                            if (minus[j] > 1)
                                check2[j][i] = -1;

                        }
                        if (check2[j][i] == 1)
                            ones[i]++;
                        if (check2[j][i] == 0)
                            zeros[i]++;
                        if (check2[j][i] == 2)
                            twos[i]++;
                    }
                    if (msgbits[i] == 0)
                        zeros[i]++;
                    if (msgbits[i] == 1)
                        ones[i]++;
                }

                for (j = 0; j < n; j++) {
                    if (zeros[j] >= ones[j] && twos[j] != k) {
                        msgbits2[j] = 0;
                    }
                    if (ones[j] > zeros[j] && twos[j] != k) {
                        msgbits2[j] = 1;
                    }
                    if (zeros[j] ==0 && ones[j]==0 && twos[j] != k) {
                        msgbits2[j] = msgbits[j];
                    }
                    /*if (ones[j] == zeros[j])
                        msgbits2[j] = msgbits[j];*/
                    if (twos[j] == k)
                        msgbits2[j] = msgbits[j];

                }


                int[] msgbits3 = new int[n];
                /*for(j=0;j<n;j++){
                    msgbits3[j]=0;
                }*/
                do {
                    change = 0;

                    for (j = 0; j < k; j++) {
                        for (i = 0; i < n; i++) {
                            check[j][i] = 2;
                            check2[j][i] = 2;
                            zeros[i] = 0;
                            ones[i] = 0;
                            twos[i] = 0;
                        }
                        sum[j] = 0;
                        cnt[j] = 0;
                        minus[j] = 0;
                    }


                    for (j = 0; j < k; j++) {
                        for (i = 0; i < n; i++) {
                            if (paritycheck[j][i] == 1) {
                                check[j][i] = msgbits2[i];
                                cnt[j]++;
                            }
                            if (check[j][i] != 2 && check[j][i] != -1) {
                                sum[j] = sum[j] + check[j][i];
                            }
                            if (check[j][i] != 2 && check[j][i] == -1)
                                minus[j]++;
                        }
                    }

                    for (i = 0; i < n; i++) {
                        for (j = 0; j < k; j++) {
                            if (check[j][i] != 2 && msgbits2[i] != -1) {
                                if (minus[j] > 0)
                                    check2[j][i] = -1;
                                if (minus[j] == 0)
                                    check2[j][i] = (sum[j] - msgbits2[i]) % 2;
                            }
                            if (check[j][i] != 2 && msgbits2[i] == -1) {
                                if (minus[j] == 1)
                                    check2[j][i] = (sum[j]) % 2;
                                if (minus[j] > 1)
                                    check2[j][i] = -1;
                            }
                            if (check2[j][i] == 1)
                                ones[i]++;
                            if (check2[j][i] == 0)
                                zeros[i]++;
                            if (check2[j][i] == 2)
                                twos[i]++;
                        }
                        if (msgbits[i] == 0)
                            zeros[i]++;
                        if (msgbits[i] == 1)
                            ones[i]++;
                    }

                    for (j = 0; j < n; j++) {
                        if (zeros[j] > ones[j] && twos[j] != k) {
                            msgbits3[j] = 0;
                        }
                        if (ones[j] > zeros[j] && twos[j] != k) {
                            msgbits3[j] = 1;
                        }
                        if (zeros[j] ==0 && ones[j]==0 && twos[j] != k) {
                            msgbits3[j] = msgbits2[j];
                        }
                        if (twos[j] == k)
                            msgbits3[j] = msgbits2[j];

                        if (msgbits3[j] != msgbits2[j]) {
                            msgbits2[j] = msgbits3[j];
                            change++;
                        }

                    }
                    for (j = 0; j < n; j++) {
                        if (msgbits2[j] == -1) {
                            change++;
                            break;
                        }
                    }

                    for (j = 0; j < k; j++) {
                        sum[j] = 0;
                        for (i = 0; i < n; i++) {
                            sum[j] = sum[j] + paritycheck[j][i] * msgbits2[i];
                        }
                        if (sum[j] % 2 != 0) {
                            change++;
                            break;
                        }
                    }
                    for (j = 0; j < n; j++) {
                        finalM = finalM + msgbits2[j];
                    }
                    finalM = finalM + '\n';
                    itteration++;
                } while (change != 0 && itteration < 50);


                if (itteration >= 50) {
                    finalM = finalM + "Unable To Decode";
                }
                else {
                        finalM = finalM + "Decoded";
                    }


                open();
            }
        });

        }
    }

