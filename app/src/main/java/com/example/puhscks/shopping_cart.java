package com.example.puhscks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import static com.example.puhscks.scanner.total;

public class shopping_cart extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<list_Item> listItems;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        recyclerView=findViewById(R.id.rc1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final Intent intent=getIntent();

        ArrayList<String>  mStringList= intent.getExtras().getStringArrayList("value");
        Object[] mStringArray = mStringList.toArray();
        ArrayList<String>  pStringList= intent.getExtras().getStringArrayList("price");
        Object[] pStringArray = pStringList.toArray();
        ArrayList<String>  qStringList= intent.getExtras().getStringArrayList("qan");
        Object[] qStringArray = qStringList.toArray();
        listItems=new ArrayList<>();
        /*for (int i=0;i<=10;i++){
            list_Item listItem=new list_Item("heading"+(i+1),
                    "hello");
            listItems.add(listItem);

        }*/
        for(int i = 0; i < mStringArray.length ; i++){
           // Log.d("string is",(String)mStringArray[i]);
            list_Item listItem=new list_Item((String)mStringArray[i], (String) pStringArray[i], (String) qStringArray[i]);
            listItems.add(listItem);
        }
        adapter=new myAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(shopping_cart.this,payment.class);
               startActivity(intent);
            }
        });

    }

}
