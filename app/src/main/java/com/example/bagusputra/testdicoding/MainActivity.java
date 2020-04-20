package com.example.bagusputra.testdicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProvinces;
    private ArrayList<Province> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbaraccount = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbaraccount);

        toolbaraccount.setLogo(R.drawable.userdata);


        toolbaraccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,AccountActivity.class);
                startActivity(pindah);
            }
        });

        rvProvinces = findViewById(R.id.itemprovince);
        rvProvinces.setHasFixedSize(true);

        list.addAll(ProvinceData.getListData());
        showRecyclerList();

    }


    private void showRecyclerList(){
        rvProvinces.setLayoutManager(new LinearLayoutManager(this));
        ProvinceAdapter provinceAdapter = new ProvinceAdapter(list);
        rvProvinces.setAdapter(provinceAdapter);
    }




}
