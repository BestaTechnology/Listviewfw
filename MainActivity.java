package com.example.listviewfw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView list;

    String[] valuse = {"Gurwinder","Singh","Anchal", "Besta","Rupali","Rana","Krishan","Gorkha","Komal",
    "Rani" ,"Pratibha","Ratnakar","Jaswinder","Singh","Ramandeep","kaur","Vishvanath"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =(ListView)findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,valuse);


        list.setAdapter(adapter);


    }
}
