package com.example.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ldpc_decoder(View View)
    {
            Intent ldpc_decoder = new Intent(this,ldpc.class);
            startActivity(ldpc_decoder);
    }
    public void product_en(View View)
    {
        Intent product_en = new Intent(this,product_en.class);
        startActivity(product_en);
    }
    public void product_de(View View)
    {
        Intent product_de = new Intent(this,product_de.class);
        startActivity(product_de);
    }
    public void noise(View View)
    {
        Intent noise = new Intent(this,noise.class);
        startActivity(noise);
    }
    public void generator(View View)
    {
        Intent generator = new Intent(this,generator.class);
        startActivity(generator);
    }
    public void parity(View View)
    {
        Intent parity = new Intent(this,parity.class);
        startActivity(parity);
    }
    public void analysis(View View)
    {
        Intent analysis = new Intent(this,analysis.class);
        startActivity(analysis);
    }
}
