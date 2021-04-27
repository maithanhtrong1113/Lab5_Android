package com.example.lab5_maithanhtrong_18064861;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DonutCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_category);

        Donut[] donuts = Donut.donuts;

        RecyclerView donutRecycler = (RecyclerView) findViewById(R.id.donut_recycler);

        DonutAdapter adapter = new DonutAdapter(donuts);

        donutRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        donutRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new DonutAdapter.Listener() {
            @Override
            public void onClick(int position) {
                sendId(position);
            }
        });
    }

    public void sendId(int position) {
        Intent intent = new Intent(this, com.hfad.mobile_lab05.DonutDetailActivity.class);
        intent.putExtra( com.hfad.mobile_lab05.DonutDetailActivity.EXTRA_DONUT_ID, position);
        startActivity(intent);
    }
}