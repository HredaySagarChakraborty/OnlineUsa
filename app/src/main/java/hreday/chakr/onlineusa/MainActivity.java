package hreday.chakr.onlineusa;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


import hreday.chakr.onlineusa.Baby.BabyActivity;
import hreday.chakr.onlineusa.Books.BooksActivity;
import hreday.chakr.onlineusa.Electronics.ElectricityActivity;
import hreday.chakr.onlineusa.Fashion.FashionActivity;

import hreday.chakr.onlineusa.Flowers.FlowerActivity;
import hreday.chakr.onlineusa.Food.FoodActivity;
import hreday.chakr.onlineusa.Furniture.FurnitureActivity;
import hreday.chakr.onlineusa.HomeRentals.HomeRentalsActivity;
import hreday.chakr.onlineusa.Jobs.JobActivity;
import hreday.chakr.onlineusa.News.NewsActivity;
import hreday.chakr.onlineusa.Pharmacy.PharmacyActivity;
import hreday.chakr.onlineusa.Shopping.ShoppingActivity;
import hreday.chakr.onlineusa.Travel.TravelActivity;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.action_settings){

            //    Intent intent=new Intent(Intent.ACTION_SEND);
            //    intent.setType("text/plain");

            //   String subject="We have tried to give you the best online services in one app";
            //   String text="It is the best apps for online shopping in USA.";

            //     intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            //  intent.putExtra(Intent.EXTRA_TEXT,text);


            //  startActivity(Intent.createChooser(intent,"Share with"));

            //  Intent intent = new Intent(Intent.ACTION_VIEW);
            // intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=io.kodular.bsdeora55520.germanyonline"));
            //  startActivity(intent);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareSubText = "WhatsApp - The Great Chat App";
            String shareBodyText = "https://play.google.com/store/apps/details?id=com.whatsapp&hl=en";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubText);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(shareIntent, "Share With"));
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Do you wanna exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



    public void BurgerKing(View v) {

        Intent intent = new Intent(MainActivity.this, ShoppingActivity.class);
        startActivity(intent);
    }

    public void Dominos(View v) {

        Intent intent = new Intent(MainActivity.this, FashionActivity.class);
        startActivity(intent);
    }

    public void Pizzahut(View v){

        Intent intent = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);

    }


    public void Kfc(View v){


        Intent intent = new Intent(MainActivity.this, HomeRentalsActivity.class);
        startActivity(intent);


    }


    public void Delivery(View v){


        Intent intent = new Intent(MainActivity.this, BabyActivity.class);
        startActivity(intent);


    }

    public void Chickfill(View v){


        Intent intent = new Intent(MainActivity.this, FurnitureActivity.class);
        startActivity(intent);


    }

    public void Eatingwell(View v){


        Intent intent = new Intent(MainActivity.this, ElectricityActivity.class);
        startActivity(intent);


    }


    public void Foodnetwork(View v){


        Intent intent = new Intent(MainActivity.this, TravelActivity.class);
        startActivity(intent);


    }



    public void Freshdirect(View v){


        Intent intent = new Intent(MainActivity.this, JobActivity.class);
        startActivity(intent);


    }


    public void Grubhub(View v){


        Intent intent = new Intent(MainActivity.this, NewsActivity.class);
        startActivity(intent);


    }



    public void Safeway(View v){


        Intent intent = new Intent(MainActivity.this, PharmacyActivity.class);
        startActivity(intent);


    }

    public void Kroger(View v){


        Intent intent = new Intent(MainActivity.this, BooksActivity.class);
        startActivity(intent);


    }

    public void Hellofresh(View v){



        Intent intent = new Intent(MainActivity.this, FlowerActivity.class);
        startActivity(intent);



    }




}
