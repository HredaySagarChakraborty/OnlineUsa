package hreday.chakr.onlineusa.News;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


//package hreday.sagar.usa.Shopping;

import android.graphics.Bitmap;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import hreday.chakr.onlineusa.R;


public class Espn extends AppCompatActivity {
    private WebView webView;


    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espn);


        getSupportActionBar().hide();


        progressBar=findViewById(R.id.progress);


        //   mInterstitialAd = new InterstitialAd(this);
        //     mInterstitialAd.setAdUnitId("ca-app-pub-4248114886151875/2595314880");

        //    mInterstitialAd.loadAd(new AdRequest.Builder().build());


        webView = findViewById(R.id.webviewId);
        webView.loadUrl("https://www.espn.com/");


        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient()
        {

            @Override public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(ProgressBar.VISIBLE);
                webView.setVisibility(View.INVISIBLE);
            }

            @Override public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible(view, url);
                progressBar.setVisibility(ProgressBar.GONE);
                webView.setVisibility(View.VISIBLE);

            }
        });
        webSettings.setJavaScriptEnabled(true);
    }

/*
    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        } else {
            super.onBackPressed();
        }
    }

 */
}

