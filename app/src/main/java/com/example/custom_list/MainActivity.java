package com.example.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv;
        String[] Title = {"Item1", "Item2", "Item3", "Item4"};
        String[] subtitle = {"Item12", "Item23", "Item33", "Item43"};
        int[] drawableIds = {R.drawable.straw, R.drawable.straw, R.drawable.straw, R.drawable.straw};

        CustomAdapter adapter = new CustomAdapter(this,Title,subtitle,drawableIds);

        lv = findViewById(R.id.menuList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Toast.makeText(MainActivity.this, "dsvvs", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}