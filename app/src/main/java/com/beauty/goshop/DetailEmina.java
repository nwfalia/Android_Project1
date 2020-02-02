package com.beauty.goshop;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.beauty.goshop.model.Emina;
import com.beauty.goshop.model.EminaData;

import java.util.ArrayList;

public class DetailEmina extends AppCompatActivity {
    public static final String EXTRA_INDEX = "extra_index";
    private ArrayList<Emina> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_emina);
        int index = getIntent().getIntExtra(EXTRA_INDEX, 0);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        list.addAll(EminaData.getListData());

        ImageView imgDetailEmina = findViewById(R.id.img_detail_emina);
        TextView detailSpesifikasiHarga = findViewById(R.id.detail_spesifikasi_harga);
        TextView detailEminaProduk = findViewById(R.id.detail_emina_produk);
        TextView detailSpesifikasiKategori = findViewById(R.id.detail_spesifikasi_kategori);
        TextView detailSpesifikasiStok = findViewById(R.id.detail_spesifikasi_stok);
        TextView detailDeskripsi = findViewById(R.id.detail_deskripsi);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getImage() == index) {
                imgDetailEmina.setImageResource(list.get(i).getImage());
                detailSpesifikasiHarga.setText("Rp " + list.get(i).getSpesifikasiHarga());
                detailEminaProduk.setText(list.get(i).getProduct());
                detailSpesifikasiKategori.setText(list.get(i).getSpesifikasiKategori());
                detailSpesifikasiStok.setText(Integer.toString(list.get(i).getSpesifikasiStok()));
                detailDeskripsi.setText(list.get(i).getDetail());


            }
        }

    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
