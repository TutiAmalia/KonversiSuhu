package com.dicoding.konversisuhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFahrenheit, btnKelvin, btnReamur, btnReset;
    EditText edtCelcius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFahrenheit= findViewById(R.id.btn_fahrenheit);
        btnKelvin=findViewById(R.id.btn_kelvin);
        btnReamur=findViewById(R.id.btn_reamur);
        btnReset=findViewById(R.id.btn_reset);
        edtCelcius=findViewById(R.id.edt_celcius);
        btnFahrenheit.setOnClickListener(this);
        btnKelvin.setOnClickListener(this);
        btnReamur.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Konversi konversi = new Konversi();
        int data = Integer.parseInt(edtCelcius.getText().toString());
        switch (v.getId()){
            case R.id.btn_fahrenheit:
                double dataFahrenheit = data*273.15;
                konversi.setHasilKonversi(String.valueOf(dataFahrenheit));
                Intent moveFahrenheit = new Intent(MainActivity.this,Fahrenheit.class);
                moveFahrenheit.putExtra(Fahrenheit.EXTRA_NUMBER, konversi);
                startActivity(moveFahrenheit);
                break;
            case R.id.btn_kelvin:
                double dataKelvin = data*1.8*32;
                konversi.setHasilKonversi(String.valueOf(dataKelvin));
                Intent moveKelvin = new Intent(MainActivity.this, Kelvin.class);
                moveKelvin.putExtra(Kelvin.EXTRA_NUMBER, konversi);
                startActivity(moveKelvin);
                break;
            case R.id.btn_reamur:
                double dataReamur = data*6.8;
                konversi.setHasilKonversi(String.valueOf(dataReamur));
                Intent moveReamur = new Intent(MainActivity.this,Reamur.class);
                moveReamur.putExtra(Reamur.EXTRA_NUMBER, konversi);
                startActivity(moveReamur);
                break;
            case R.id.btn_reset:
                edtCelcius.setText("");
        }
    }

}
