package hreday.chakr.onlineusa.Food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import hreday.chakr.onlineusa.R;
import hreday.chakr.onlineusa.Shopping.Walgreen;


public class FoodActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter3 myAdapter;


    int images2[] = {R.drawable.bk,
            R.drawable.dominous,
            R.drawable.wegman,
            R.drawable.kfc,
            R.drawable.delivery,
            R.drawable.chick,
            R.drawable.eatingwell,
            R.drawable.foodnetwork,
            R.drawable.freshdirect,
            R.drawable.allrecipes,
            R.drawable.wholefoodsmarket,
            R.drawable.kroger,
            R.drawable.hellofresh,
            R.drawable.instacart


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Food");


        country = getResources().getStringArray(R.array.country_food);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter3(this, images2, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(FoodActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter3.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(FoodActivity.this, BurgerKing.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(FoodActivity.this, Dominous.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(FoodActivity.this, Walgreen.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(FoodActivity.this, Kfc.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(FoodActivity.this, Delivery.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(FoodActivity.this, Chickfill.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(FoodActivity.this, Eatingwell.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(FoodActivity.this, Foodnetwork.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(FoodActivity.this, Freshdirect.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(FoodActivity.this, Allrecepies.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(FoodActivity.this, Wholefoodmarket.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(FoodActivity.this, Kroger.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 12) {

                    Intent intent =new Intent(FoodActivity.this, HelloFresh.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 13) {
                    Intent intent = new Intent(FoodActivity.this, Instacart.class);
                    Toast.makeText(FoodActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }




            }
        });

    }

}
