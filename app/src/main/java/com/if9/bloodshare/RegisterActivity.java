package com.if9.bloodshare;
/*Nama : Khoerul Ageng Oktaviana
NIM  : 10116384
KELAS : AKB-IF9
Tanggal Pengerjaan : 18 April 2019*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void almostthere(View view){
        Intent intent = new Intent(RegisterActivity.this,AlmostActivity.class);
        startActivity(intent);
    }
}
