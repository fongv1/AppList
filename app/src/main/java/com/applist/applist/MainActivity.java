package com.applist.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instance to database
        ConnectionSQL connection = new ConnectionSQL(this, "dbItems", null, 1);

    }

    public void addList(View view){
        Intent addList = new Intent(this, RegisterItem.class);
        startActivity(addList);
    }

}
