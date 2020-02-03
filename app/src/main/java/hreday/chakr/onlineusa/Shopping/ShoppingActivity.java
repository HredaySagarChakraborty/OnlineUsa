package hreday.chakr.onlineusa.Shopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import hreday.chakr.onlineusa.R;

//import hreday.sagar.hredaymehediusa.R;

public class ShoppingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter myAdapter;


    int images[] = {R.drawable.amazon,
            R.drawable.ebay,
            R.drawable.best,
            R.drawable.walmart,
            R.drawable.etsy,
            R.drawable.aliexpress,
            R.drawable.american_eagle,
            R.drawable.banggood,
            R.drawable.groupon,
            R.drawable.walgreens,
            R.drawable.target,
            R.drawable.carters,
            R.drawable.athletta,
            R.drawable.egg,
            R.drawable.homedepot,
            R.drawable.lowes,
            R.drawable.staple,
            R.drawable.zappos,
            R.drawable.petsmart,
            R.drawable.dicks


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Shopping");


        country = getResources().getStringArray(R.array.country_name);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter(this, images, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(ShoppingActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(ShoppingActivity.this, AmazonActivity.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 1) {
                    Intent intent=new Intent(ShoppingActivity.this, Ebay.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(ShoppingActivity.this, BestBuy.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 3) {
                    Intent intent = new Intent(ShoppingActivity.this, Walmart.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(ShoppingActivity.this, Etsy.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 5) {
                    Intent intent = new Intent(ShoppingActivity.this, Aliexpress.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(ShoppingActivity.this, AmericanEagle.class);
                    startActivity(intent);

                }

                else if (position == 7) {
                    Intent intent = new Intent(ShoppingActivity.this, Banggood.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                if (position == 8) {
                    Intent intent = new Intent(ShoppingActivity.this, Groupon.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 9) {
                    Intent intent = new Intent(ShoppingActivity.this, Walgreen.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(ShoppingActivity.this, Target.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 11) {
                    Intent intent = new Intent(ShoppingActivity.this, Carters.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 12) {
                    Intent intent = new Intent(ShoppingActivity.this, Athleta.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 13) {
                    Intent intent = new Intent(ShoppingActivity.this, Newegg.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 14) {
                    Intent intent = new Intent(ShoppingActivity.this, Depot.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 15) {
                    Intent intent = new Intent(ShoppingActivity.this, Lowes.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 16) {
                    Intent intent = new Intent(ShoppingActivity.this, Staples.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 17) {
                    Intent intent = new Intent(ShoppingActivity.this, Za.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 18) {
                    Intent intent = new Intent(ShoppingActivity.this, Petsmart.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 19) {
                    Intent intent = new Intent(ShoppingActivity.this, Dicks.class);
                    Toast.makeText(ShoppingActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }


            }
        });

    }

}

