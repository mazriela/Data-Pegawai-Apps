package com.mazriela.pegawaiapps.detailpegawai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mazriela.pegawaiapps.R;
import com.mazriela.pegawaiapps.tampilpegawai.model.DataItem;

public class DetailPegawaiActivity extends AppCompatActivity {

    //iniisialisasi
    TextView tvDetailNama,tvDetailEmail,tvDetaAlamat,tvDetailNoHp;

    DataItem dataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pegawai);

        //deklarasi
        tvDetailNama = findViewById(R.id.tvDetailNama);
        tvDetailEmail = findViewById(R.id.tvDetailEmail);
        tvDetaAlamat = findViewById(R.id.tvDetailAlamat);
        tvDetailNoHp = findViewById(R.id.tvDetailNoHp);

        dataItem = (DataItem) getIntent().getSerializableExtra("data_pegawai");
        //tampung data di string
//        String nammaPegawai = getIntent().getStringExtra("nama_pegawai");
//        String emailPegawai = getIntent().getStringExtra("email_pegawai");
//        String hpPegawai = getIntent().getStringExtra("no_hp_pegawai");
//        String  alamatPegawai = getIntent().getStringExtra("alamat_pegawai");


        tvDetailNama.setText(dataItem.getNamaPegawai());
//        tvDetailNoHp.setText(hpPegawai);
//        tvDetailEmail.setText(emailPegawai);
//        tvDetaAlamat.setText(alamatPegawai);
    }
}
