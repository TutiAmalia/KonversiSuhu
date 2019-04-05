package com.dicoding.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fahrenheit extends AppCompatActivity {
    public static final String EXTRA_NUMBER="extra_number";
    TextView tvFahrenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);

        tvFahrenheit=findViewById(R.id.tv_fahrenheit);
        Konversi number = getIntent().getParcelableExtra(EXTRA_NUMBER);

        String text = "Hasil Konversi: " + number.getHasilKonversi();
        tvFahrenheit.setText(text);
    }
}
