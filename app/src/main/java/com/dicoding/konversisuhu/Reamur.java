package com.dicoding.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Reamur extends AppCompatActivity {
    public static final String EXTRA_NUMBER="extra_number";
    TextView tvReamur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reamur);

        tvReamur=findViewById(R.id.tv_reamur);
        Konversi number = getIntent().getParcelableExtra(EXTRA_NUMBER);

        String text = "Hasil Konversi: " + number.getHasilKonversi();
        tvReamur.setText(text);
    }
}
