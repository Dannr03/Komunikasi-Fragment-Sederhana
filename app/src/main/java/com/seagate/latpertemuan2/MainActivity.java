package com.seagate.latpertemuan2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_a, fragmentA)
                .commit();

        FragmentB fragmentB = new FragmentB();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_b, fragmentB)
                .commit();
    }
}