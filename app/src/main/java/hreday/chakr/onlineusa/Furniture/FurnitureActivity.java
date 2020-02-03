package hreday.chakr.onlineusa.Furniture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.Furniture;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class FurnitureActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter6 myAdapter;


    int images6[] = {R.drawable.allmodern,
            R.drawable.bedbathandbeyond,
            R.drawable.hayneedle,
            R.drawable.ikea,
            R.drawable.jossandmain,

            R.drawable.overstock,
            R.drawable.potterybarn,
            R.drawable.rh,
            R.drawable.wayfair,
            R.drawable.westelm,
            R.drawable.willams,
            R.drawable.worldmarket,


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Furniture");


        country = getResources().getStringArray(R.array.country_furniture);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter6(this, images6, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid = new GridLayoutManager(FurnitureActivity.this, 2, GridLayoutManager.VERTICAL, true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter6.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(FurnitureActivity.this, Allmodern.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(FurnitureActivity.this, Bed.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(FurnitureActivity.this, Hay.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(FurnitureActivity.this, Ikea.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(FurnitureActivity.this, Joss.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(FurnitureActivity.this, OverstockFurnitue.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(FurnitureActivity.this, Pottery.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(FurnitureActivity.this, Rest.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                if (position == 8) {
                    Intent intent = new Intent(FurnitureActivity.this, Way.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 9) {
                    Intent intent = new Intent(FurnitureActivity.this, West.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(FurnitureActivity.this, Wiliam.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 11) {
                    Intent intent = new Intent(FurnitureActivity.this, Walmarket.class);
                    Toast.makeText(FurnitureActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }


            }
        });

    }

}
