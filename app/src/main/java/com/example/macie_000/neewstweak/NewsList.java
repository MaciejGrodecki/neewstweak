package com.example.macie_000.neewstweak;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class NewsList extends Activity {
    private ArrayList<News> l_News;
    private Reader oReader = new Reader();
    private ListView oListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newslist);
        oListView = (ListView)findViewById(R.id.listView);
        Intent intent1 = getIntent();
        String sChannel = intent1.getExtras().getString("channel");
        GetData(sChannel);
        oListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent oIntent = new Intent(NewsList.this, DescNews.class);
                oIntent.putExtras(DescNewsBundler.newDescNewsBundler(l_News,position));
                startActivity(oIntent);
            }
        });
    }




    private ArrayList<String> GetSpecifyItem(int iItemIndex)
    {
        ArrayList<String> a_Result = new ArrayList<String>();

        for(int i=0;i<l_News.size();i++){
            a_Result.add(l_News.get(i).getTitle());
        }

        return a_Result;
    }


    private void GetData(String sChannelName) {
        try {
            oReader.setURL(sChannelName);
            l_News = oReader.Read();
            ArrayList<String> resultArray = GetSpecifyItem(0);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                    this,
                    android.R.layout.simple_list_item_1,
                    resultArray);
            oListView.setAdapter(arrayAdapter);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
