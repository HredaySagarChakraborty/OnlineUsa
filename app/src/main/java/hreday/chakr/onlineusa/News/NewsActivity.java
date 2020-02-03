package hreday.chakr.onlineusa.News;

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


public class NewsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter10 myAdapter;


    int images10[] = {R.drawable.bbc,
            R.drawable.cnn,
            R.drawable.forbes,
            R.drawable.foxnews,
            R.drawable.espn,
            R.drawable.nytimes,
            R.drawable.usatoday,
            R.drawable.britannica,
            R.drawable.abcnews,
            R.drawable.aol,
            R.drawable.medicalnewstoday,
            R.drawable.weather


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("News");


        country = getResources().getStringArray(R.array.country_news);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter10(this, images10, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid=new GridLayoutManager(NewsActivity.this,2, GridLayoutManager.VERTICAL,true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter10.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(NewsActivity.this, Bbc.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(NewsActivity.this, Cnn.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(NewsActivity.this, Fobes.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(NewsActivity.this,Fox.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(NewsActivity.this, Espn.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(NewsActivity.this,Newwork.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(NewsActivity.this, Usatoday.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(NewsActivity.this, Britannica.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(NewsActivity.this,Medicalnews.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(NewsActivity.this,Abc .class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(NewsActivity.this, Aoi.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(NewsActivity.this, Weather.class);
                    Toast.makeText(NewsActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }


            }
        });

    }

}
