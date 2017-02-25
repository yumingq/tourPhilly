package com.yumingqin.walkphilly;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends Activity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    static CharSequence location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                location = (CharSequence) parent.getItemAtPosition(position);
                int numLocs = Integer.parseInt((String) location);
                System.out.println(numLocs);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        MapsActivity.setUpMapIfNeeded();
    }

    public void onLaunchButtonClick(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
