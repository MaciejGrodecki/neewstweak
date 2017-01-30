package com.example.macie_000.neewstweak;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.renderscript.Element;
import android.text.Html;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class DescNews extends Activity {
    private WebView mainWebView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        mainWebView = (WebView)findViewById(R.id.mainWebView);
        Intent intent = getIntent();
        Bundle loadInfo = intent.getExtras();
        int iPosition = loadInfo.getInt("position");
        ArrayList<News> newsArrayList = (ArrayList<News>)loadInfo.getSerializable("newsArrayList");
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.loadDataWithBaseURL("", newsArrayList.get(iPosition).getDescription(), "text/html", "UTF-8", "");
    }

}
