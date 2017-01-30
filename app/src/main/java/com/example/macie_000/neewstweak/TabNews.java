package com.example.macie_000.neewstweak;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class TabNews extends TabActivity {
    private String sChannelType;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GetFromExtras();
        SetTabContent();
    }

    private void GetFromExtras(){
        Intent oIntent = getIntent();
        Bundle loadInfo = oIntent.getExtras();
        sChannelType = loadInfo.getString("typ");
    }

    private void SetTabContent(){
        Resources res = getResources();
        TabHost host = getTabHost();
        Channel oChannel = new Channel();
        Intent intent1, intent2, intent3;
        TabHost.TabSpec tab1, tab2, tab3;
        Drawable tabIcon = res.getDrawable(R.drawable.ikonka);
        if(sChannelType.equals("Sport") || sChannelType.equals("Wiadomosci"))
        {
                intent1 = new Intent(this, NewsList.class);
                intent1.putExtra("channel",oChannel.getWP().get(sChannelType));
                tab1 = host.newTabSpec("Zak³adka 1")
                        .setIndicator("WP", tabIcon)
                        .setContent(intent1);
                intent2 = new Intent(this,NewsList.class);
                intent2.putExtra("channel",oChannel.getTVN24().get(sChannelType));
                tab2 = host.newTabSpec("Zak³adka 2")
                        .setIndicator("TVN24", tabIcon)
                        .setContent(intent2);
                intent3 = new Intent(this,NewsList.class);
                intent3.putExtra("channel", oChannel.getInteria().get(sChannelType));
                tab3 = host.newTabSpec("Zak³adka 3")
                        .setIndicator("INTERIA", tabIcon)
                        .setContent(intent3);
                host.addTab(tab1);
                host.addTab(tab2);
                host.addTab(tab3);
        }
        else if(sChannelType.equals("Pogoda")){
            intent1 = new Intent(this, NewsList.class);
            intent1.putExtra("channel",oChannel.getWP().get(sChannelType));
            tab1 = host.newTabSpec("Zak³adka 1")
                    .setIndicator("WP", tabIcon)
                    .setContent(intent1);
            intent2 = new Intent(this,NewsList.class);
            intent2.putExtra("channel",oChannel.getTVN24().get(sChannelType));
            tab2 = host.newTabSpec("Zak³adka 2")
                    .setIndicator("TVN24", tabIcon)
                    .setContent(intent2);
            host.addTab(tab1);
            host.addTab(tab2);
        }
        else if(sChannelType.equals("Film") || sChannelType.equals("Gry")){
            intent1 = new Intent(this, NewsList.class);
            intent1.putExtra("channel",oChannel.getWP().get(sChannelType));
            tab1 = host.newTabSpec("Zak³adka 1")
                    .setIndicator("WP", tabIcon)
                    .setContent(intent1);
            intent2 = new Intent(this,NewsList.class);
            intent2.putExtra("channel",oChannel.getInteria().get(sChannelType));
            tab2 = host.newTabSpec("Zak³adka 2")
                    .setIndicator("Interia", tabIcon)
                    .setContent(intent2);
            host.addTab(tab1);
            host.addTab(tab2);
        }
        else if(sChannelType.equals("Praca")){
            intent1 = new Intent(this, NewsList.class);
            intent1.putExtra("channel",oChannel.getWP().get(sChannelType));
            tab1 = host.newTabSpec("Zak³adka 1")
                    .setIndicator("WP", tabIcon)
                    .setContent(intent1);
            host.addTab(tab1);
        }

    }

}


