package com.example.puhscks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class mall extends AppCompatActivity {
    RadioGroup radio;
    RadioButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        radio = findViewById(R.id.radio);


    }
    public void onclickbuttonMethod(View v)
    {
        int selectedId = radio.getCheckedRadioButtonId();
        b1 = (RadioButton) findViewById(selectedId);
        if (selectedId == -1)
        {
            Toast.makeText(this, "nothing selcted", Toast.LENGTH_SHORT).show();
        } else
        {
            Toast.makeText(this, b1.getText(), Toast.LENGTH_SHORT).show();
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(mall.this,scanner.class);
                startActivity(i);
            }
        });
    }
}
