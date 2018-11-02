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
    boolean showingFirst = true;
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(showingFirst == true){
            imageView.setImageResource(R.drawable.round_view_module_black_18);
                showingFirst = false;
            }else{
                imageView.setImageResource(R.drawable.round_view_list_black_18);
                imageView.setTag(70);
                showingFirst = true;
            }
        }
    };

    public void addList(View view){
        Intent addList = new Intent(this, SecondActivity.class);
        startActivity(addList);
    }
}
