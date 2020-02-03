package hreday.chakr.onlineusa.Baby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;
//package hreday.sagar.hredaymehediusa.Baby;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

//import hreday.sagar.hredaymehediusa.R;

public class BabyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter5 myAdapter;


    int images5[] = {R.drawable.baby_earth,
            R.drawable.childrensplace,
            R.drawable.crateandbarrel,
            R.drawable.disney,
            R.drawable.faoschwarz,
            R.drawable.fatbraintoys,
            R.drawable.gamestop,
            R.drawable.janieandjack,
            R.drawable.lego,
            R.drawable.mattel,
            R.drawable.overstock,
            R.drawable.zulily



    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Baby");


        country = getResources().getStringArray(R.array.country_baby);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter5(this, images5, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(BabyActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter5.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(BabyActivity.this, BabyEarth.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                else if (position == 1) {
                    Intent intent=new Intent(BabyActivity.this,Childrenspace.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 2) {
                    Intent intent=new Intent(BabyActivity.this,Crate.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                else if (position == 3) {
                    Intent intent=new Intent(BabyActivity.this,Disney.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 4) {
                    Intent intent=new Intent(BabyActivity.this,Fao.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 5) {
                    Intent intent=new Intent(BabyActivity.this,Fat.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 6) {
                    Intent intent=new Intent(BabyActivity.this,Gamestop.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 7) {
                    Intent intent=new Intent(BabyActivity.this,Janiandjack.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 8) {
                    Intent intent=new Intent(BabyActivity.this,Lego.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }


                else if (position == 9) {
                    Intent intent=new Intent(BabyActivity.this,Mattel.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 10) {
                    Intent intent=new Intent(BabyActivity.this,Overstock.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 11) {
                    Intent intent=new Intent(BabyActivity.this, Zuily.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 12) {
                    Intent intent=new Intent(BabyActivity.this,BabyEarth.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                else if (position == 13) {
                    Intent intent=new Intent(BabyActivity.this,BabyEarth.class);
                    Toast.makeText(BabyActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }





            }
        });

    }

}
