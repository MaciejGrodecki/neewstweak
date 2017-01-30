package com.example.macie_000.neewstweak;

import android.os.Bundle;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class NewsListBundler {
    public static Bundle newNewsListBundle(String sChannelType){
        Bundle newlist = new Bundle();
        newlist.putString("typ",sChannelType);
        return (newlist);
    }
}
