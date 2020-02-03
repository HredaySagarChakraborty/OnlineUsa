package hreday.chakr.onlineusa.Jobs;

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


public class JobActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter8 myAdapter;


    int images8[] = {R.drawable.upwork,
            R.drawable.freelancer,
            R.drawable.guru,
            R.drawable.usajobs,
            R.drawable.careerbuilder,

            R.drawable.indeed,
            R.drawable.monster,
            R.drawable.snagajob



    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        recyclerView = findViewById(R.id.recycle);

        // getSupportActionBar().hide();
        this.setTitle("Job");


        country = getResources().getStringArray(R.array.country_job);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter8(this, images8, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);


        GridLayoutManager grid = new GridLayoutManager(JobActivity.this, 2, GridLayoutManager.VERTICAL, true);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(grid);

        myAdapter.setOnItemClickListener(new MyAdapter8.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(JobActivity.this, Upwork.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(JobActivity.this,Freelancer.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(JobActivity.this, Guru.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(JobActivity.this, Usajobs.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(JobActivity.this, Carerbuilder.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(JobActivity.this, Indeed.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(JobActivity.this, Monster.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(JobActivity.this, Snagajob.class);
                    Toast.makeText(JobActivity.this, "Please wait a few second's it's loading", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }





            }
        });

    }

}
