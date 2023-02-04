package com.example.kalkulatorsederhana;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Kalkulator extends AppCompatActivity {
    //List Widget yg dikenakan aksi
    EditText txtangka1;
    EditText txtangka2;
    Button btbtambah;
    Button btbkurang;
    Button btbkali;
    Button btbbagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulatorku);
        // mengkonekkan semua list widget pada xml yg nantinya akan dijalankan
        txtangka1 = (EditText) findViewById(R.id.txtangka1);
        txtangka2 = (EditText) findViewById(R.id.txtangka2);
        btbtambah = (Button) findViewById(R.id.btntambah);
        btbtambah.setOnClickListener(new View.OnClickListener() {
            //action button
            @Override
            public void onClick(View view) {
                //mengambil data yang diketikkan user

                String angkaText1 = txtangka1.getText().toString();
                String angkaText2 = txtangka2.getText().toString();

                if (angkaText1.isEmpty() || angkaText2.isEmpty()){
                    new AlertDialog.Builder(Kalkulator.this)
                            .setTitle("Ada Kesalahan")
                            .setMessage("Angka 1 dan Angka 2 harus di isi")
//                            .setPositiveButton(android.R.string.yes, (dialog, which) -> startActivity(new Intent(MainActivity.this, Kalkulator.class)))

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else{
                    //convert string to int
                    double angka1 = Double.valueOf(txtangka1.getText().toString());
                    double angka2 = Double.valueOf(txtangka2.getText().toString());

                    double hasil = angka1+angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : "+hasil, Toast.LENGTH_SHORT).show();
//
                }
            }
        });
        btbkurang = (Button) findViewById(R.id.btnkurang);
        btbkurang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // mengambil data / widget dari yg di isikan user
                String angkaText1 = txtangka1.getText().toString();
                String angkaText2 = txtangka2.getText().toString();

                if (angkaText1.isEmpty() || angkaText2.isEmpty()){
                    new AlertDialog.Builder(Kalkulator.this)
                            .setTitle("Ada Kesalahan")
                            .setMessage("Angka harus di isi")
//                            .setPositiveButton(android.R.string.yes, (dialog, which) -> startActivity(new Intent(MainActivity.this, Kalkulator.class)))

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else {
                    int angka1 = Integer.parseInt(txtangka1.getText().toString());
                    int angka2 = Integer.parseInt(txtangka2.getText().toString());

                    int hasil = angka1-angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : "+hasil, Toast.LENGTH_SHORT).show();
                }


            }
        });

        btbkali = (Button) findViewById(R.id.btnkali);
        btbkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angkaText1 = txtangka1.getText().toString();
                String angkaText2 = txtangka2.getText().toString();

                if (angkaText1.isEmpty() || angkaText2.isEmpty()){
                    new AlertDialog.Builder(Kalkulator.this)
                            .setTitle("Ada Kesalahan")
                            .setMessage("Angka harus di isi")
//                            .setPositiveButton(android.R.string.yes, (dialog, which) -> startActivity(new Intent(MainActivity.this, Kalkulator.class)))

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else {
                    int angka1 = Integer.parseInt(txtangka1.getText().toString());
                    int angka2 = Integer.parseInt(txtangka2.getText().toString());

                    int hasil = angka1*angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : "+hasil, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btbbagi = (Button) findViewById(R.id.btnbagi);
        btbbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angkaText1 = txtangka1.getText().toString();
                String angkaText2 = txtangka2.getText().toString();

                if (angkaText1.isEmpty() || angkaText2.isEmpty()){
                    new AlertDialog.Builder(Kalkulator.this)
                            .setTitle("Ada Kesalahan")
                            .setMessage("Angka harus di isi")
//                            .setPositiveButton(android.R.string.yes, (dialog, which) -> startActivity(new Intent(MainActivity.this, Kalkulator.class)))

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else {
                    double angka1 = Integer.parseInt(txtangka1.getText().toString());
                    double angka2 = Integer.parseInt(txtangka2.getText().toString());

                    double hasil = angka1/angka2;


                    Toast.makeText(Kalkulator.this, "Hasil : "+ new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                }

            }
        });




    }

}
