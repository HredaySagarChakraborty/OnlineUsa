package hreday.chakr.onlineusa.Electronics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.Electricity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class ElectricityActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter7 myAdapter;


    int images7[] = {R.drawable.adorama,
            R.drawable.apple,
            R.drawable.craigslist,
            R.drawable.frys,
            R.drawable.rakuten,

            R.drawable.banggood,
            R.drawable.tigerdirect,
            R.drawable.woot


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Electronics");


        country = getResources().getStringArray(R.array.country_electric);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter7(this, images7, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid = new GridLayoutManager(ElectricityActivity.this, 2, GridLayoutManager.VERTICAL, true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter7.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(ElectricityActivity.this, Adorama.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(ElectricityActivity.this, Apple.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(ElectricityActivity.this,Craig.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(ElectricityActivity.this, Frys.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(ElectricityActivity.this, Rakuten.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(ElectricityActivity.this,Sears.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(ElectricityActivity.this, Tiger.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(ElectricityActivity.this,Woot.class);
                    Toast.makeText(ElectricityActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }




            }
        });

    }

}
