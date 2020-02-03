package hreday.chakr.onlineusa.Travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.Travel;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class TravelActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter4 myAdapter;


    int images4[] = {R.drawable.agoda,
            R.drawable.airbnb,
            R.drawable.booking,
            R.drawable.budget,
            R.drawable.carrentals,
            R.drawable.cheapoair,
            R.drawable.choicehotels,
            R.drawable.emirates,
            R.drawable.enterprise,
            R.drawable.expedia,
            R.drawable.homeaway,
            R.drawable.hotwire,
            R.drawable.travelocity,
            R.drawable.trivago


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Travel");


        country = getResources().getStringArray(R.array.country_travel);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter4(this, images4, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(TravelActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter4.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(TravelActivity.this, Agoda.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 1) {
                    Intent intent=new Intent(TravelActivity.this,Airbnb.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 2) {
                    Intent intent=new Intent(TravelActivity.this,Booking.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                else if (position == 3) {
                    Intent intent=new Intent(TravelActivity.this,Budget.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 4) {
                    Intent intent=new Intent(TravelActivity.this,Carrentals.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 5) {
                    Intent intent=new Intent(TravelActivity.this,Cheoapir.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 6) {
                    Intent intent=new Intent(TravelActivity.this,Choicehotels.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 7) {
                    Intent intent=new Intent(TravelActivity.this,Emirates.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 8) {
                    Intent intent=new Intent(TravelActivity.this,Enterprise.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                else if (position == 9) {
                    Intent intent=new Intent(TravelActivity.this,Expedia.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 10) {
                    Intent intent=new Intent(TravelActivity.this,Homeaway.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 11) {
                    Intent intent=new Intent(TravelActivity.this,Hotwire.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 12) {
                    Intent intent=new Intent(TravelActivity.this, Travelocity.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 13) {
                    Intent intent=new Intent(TravelActivity.this, Trivango.class);
                    Toast.makeText(TravelActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }





            }
        });

    }

}
