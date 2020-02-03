package hreday.chakr.onlineusa.HomeRentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.HomeRentals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class HomeRentalsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter13 myAdapter;


    int images13[] = {R.drawable.apartmentguide,
            R.drawable.apartmentfinder,
            R.drawable.apartmentlist,
            R.drawable.apartments,
            R.drawable.flipkey,
            R.drawable.forrent,
            R.drawable.homefinder,
            R.drawable.home,
            R.drawable.rent,
            R.drawable.rentals,
            R.drawable.trulia,
            R.drawable.vrbo,
            R.drawable.zillow,
            R.drawable.zumper


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_rentals);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Home Rentals");


        country = getResources().getStringArray(R.array.country_homerentals);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter13(this, images13, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(HomeRentalsActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter13.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Apartmentguide.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Apartmentfinder.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(HomeRentalsActivity.this,Apartmentlist.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Apartments.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Flipkey.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Forrent.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Homefinder.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Homes.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Rent.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Rentals.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Trulia.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Vrbo.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 12) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Zillow.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 13) {
                    Intent intent = new Intent(HomeRentalsActivity.this, Zumper.class);
                    Toast.makeText(HomeRentalsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }




            }
        });

    }

}
