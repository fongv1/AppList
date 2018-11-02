package com.applist.applist;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.applist.applist.Utilities.Utilities;

import static com.applist.applist.R.id.addList;

public class RegisterItem extends AppCompatActivity {

    EditText fieldTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fieldTitle = (EditText) findViewById(R.id.fieldTitle);
    }

    // Create a function to add items
    public void onClick(View view) {

        addItem();
    }


    //Storage items in database
    private void addItem() {
        //Create an instance
        ConnectionSQL connection = new ConnectionSQL(this, "dbItems", null, 1);

        //open the database to modify it
        SQLiteDatabase db = connection.getWritableDatabase();

        //register data
        ContentValues values = new ContentValues();
        values.put(Utilities.FIELD_TITLE,fieldTitle.getText().toString());

        //insert data
        long itemResult = db.insert(Utilities.TABLE_ITEM,Utilities.FIELD_TITLE,values);

        Toast.makeText(getApplicationContext(),"Item Register: "+itemResult,Toast.LENGTH_SHORT).show();

        db.close();

    }


}
