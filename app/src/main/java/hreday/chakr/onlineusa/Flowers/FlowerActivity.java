package hreday.chakr.onlineusa.Flowers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import hreday.chakr.onlineusa.R;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class FlowerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter9 myAdapter;


    int images9[] = {R.drawable.manyflowers,
            R.drawable.ftd,
            R.drawable.gifts,
            R.drawable.gifttree,
            R.drawable.personalcreations,

            R.drawable.proflowers,
            R.drawable.teleflora,
            R.drawable.basket



    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Flowers");


        country = getResources().getStringArray(R.array.country_flower);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter9(this, images9, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid = new GridLayoutManager(FlowerActivity.this, 2, GridLayoutManager.VERTICAL, true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter9.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(FlowerActivity.this, Flowers1800.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(FlowerActivity.this,Ftd.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(FlowerActivity.this, Gifts.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(FlowerActivity.this,Gifttree.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(FlowerActivity.this, Personal.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(FlowerActivity.this, Proflower.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(FlowerActivity.this, Teleflora.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(FlowerActivity.this,Busket.class);
                    Toast.makeText(FlowerActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }





            }
        });

    }

}
