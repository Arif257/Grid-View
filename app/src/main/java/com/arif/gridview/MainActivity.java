package com.arif.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] countryName;
    private GridView gridView;
    private int[] flags = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.q};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName = getResources().getStringArray(R.array.country_names);
        gridView = findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this, countryName, flags);
                gridView.setAdapter(adapter);

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value = countryName[position];
                        Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                    }
                });



    }
}