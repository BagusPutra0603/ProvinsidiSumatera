package com.example.bagusputra.testdicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Toolbar toolbarback = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbarback);

        toolbarback.setLogo(R.drawable.backward);

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(AccountActivity.this,MainActivity.class);
                startActivity(pindah);
            }
        });

    }
}
