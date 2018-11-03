package com.applist.applist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView listView = (ListView) findViewById(R.id.listv);
        arrayList = new ArrayList<>();

        // ArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects)
        adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.txtitem, arrayList);
        listView.setAdapter(adapter);
        txtInput = (EditText) findViewById(R.id.txtinput);
        Button btAdd = (Button) findViewById(R.id.btaad);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem = txtInput.getText().toString();
                if (!newItem.trim().matches("")) {
                    arrayList.add(newItem);
                    adapter.notifyDataSetChanged();
                }

            }
        });
    }

    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);

    }


}
