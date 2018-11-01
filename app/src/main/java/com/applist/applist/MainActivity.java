package com.applist.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.menu);
        imageView.setOnClickListener(onClickListener);
    }

    // View.OnClickListener is an interface
    // create a OnClickListener object by using anonymous class expression
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            imageView.setImageResource(R.drawable.round_view_module_black_18);
        }
    };

    public void addList(View view){
        Intent addList = new Intent(this, SecondActivity.class);
        startActivity(addList);
    }
}
