package com.example.bagusputra.testdicoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailProvinceActivity extends AppCompatActivity {

    TextView provincetext, detailprovincedetail, sourceurl;
    ImageView imagelogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_province);

        provincetext = (TextView) findViewById(R.id.provincetext);
        detailprovincedetail = (TextView) findViewById(R.id.detailprovincetext);
        imagelogo = (ImageView) findViewById(R.id.imagelogo);
        sourceurl = (TextView) findViewById(R.id.sourceurl);

        Toolbar toolbarback = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbarback);

        toolbarback.setLogo(R.drawable.backward);

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(DetailProvinceActivity.this,MainActivity.class);
                startActivity(pindah);
            }
        });

        provincetext.setText(getIntent().getStringExtra("provincename"));
        detailprovincedetail.setText(getIntent().getStringExtra("provincenamedetail"));

        imagelogo.setImageResource(getIntent().getIntExtra("logo", 123456789));
        sourceurl.setText(getIntent().getStringExtra("url"));
    }
}
