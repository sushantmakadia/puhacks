package com.example.puhscks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cod extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cod);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cod.this, "payment sucessful", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(cod.this,mall.class);
                startActivity(intent);
            }
        });
    }
}
