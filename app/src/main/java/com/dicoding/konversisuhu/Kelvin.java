package com.dicoding.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Kelvin extends AppCompatActivity {
    public static final String EXTRA_NUMBER="extra_number";
    TextView tvKelvin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);

        tvKelvin=findViewById(R.id.tv_kelvin);
        Konversi number = getIntent().getParcelableExtra(EXTRA_NUMBER);

        String text = "Hasil Konversi: " + number.getHasilKonversi();
        tvKelvin.setText(text);
    }
}
