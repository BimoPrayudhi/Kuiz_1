package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Aris Afianto", "Ayah", R.drawable.bpk));
        mahasiswaArrayList.add(new Keluarga("Suharni", "Ibu", R.drawable.mama));
        mahasiswaArrayList.add(new Keluarga("Bimo Prayudhi", "anak pertama", R.drawable.bimo));
        mahasiswaArrayList.add(new Keluarga("Annisa Cahyani", "anak kedua", R.drawable.adik));
    }
}


