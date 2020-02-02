package com.beauty.goshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beauty.goshop.adapter.ListEminaAdapter;
import com.beauty.goshop.model.Emina;
import com.beauty.goshop.model.EminaData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvEmina;
    private ArrayList<Emina> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvEmina = findViewById(R.id.rv_emina_products);
        rvEmina.setHasFixedSize(true);

        list.addAll(EminaData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvEmina.setLayoutManager(new LinearLayoutManager(this));
        ListEminaAdapter listEminaAdapter = new ListEminaAdapter(list);
        rvEmina.setAdapter(listEminaAdapter);
        listEminaAdapter.setOnItemClickCallback(new ListEminaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Emina data) {
                Intent moveWithDataIntent = new Intent(MainActivity.this, DetailEmina.class);
                moveWithDataIntent.putExtra(DetailEmina.EXTRA_INDEX, data.getImage());
                startActivity(moveWithDataIntent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list_about_me:
                Intent intent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);
                break;
        }
    }

}
