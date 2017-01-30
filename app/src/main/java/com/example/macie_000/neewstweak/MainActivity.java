package com.example.macie_000.neewstweak;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }


    public void btnWiadomosci_onClick(View oView){
        Intent oIntent = new Intent(this,TabNews.class);
        oIntent.putExtras(NewsListBundler.newNewsListBundle("Wiadomosci"));
        startActivity(oIntent);
    }

    public void btnSport_onClick(View oView){
        Intent oIntent = new Intent(this,TabNews.class);
        oIntent.putExtras(NewsListBundler.newNewsListBundle("Sport"));
        startActivity(oIntent);
    }

    public void btnPogoda_onClick(View oView){
        Intent oIntent = new Intent(this,TabNews.class);
        oIntent.putExtras(NewsListBundler.newNewsListBundle("Pogoda"));
        startActivity(oIntent);
    }

    public void btnFilm_onClick(View oView){
        Intent oIntent = new Intent(this,TabNews.class);
        oIntent.putExtras(NewsListBundler.newNewsListBundle("Film"));
        startActivity(oIntent);
    }

    public void btnGry_onClick(View oView){
        Intent oIntent = new Intent(this,TabNews.class);
        oIntent.putExtras(NewsListBundler.newNewsListBundle("Gry"));
        startActivity(oIntent);
    }

}
