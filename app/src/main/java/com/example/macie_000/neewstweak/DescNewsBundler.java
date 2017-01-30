package com.example.macie_000.neewstweak;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class DescNewsBundler {
    public static Bundle newDescNewsBundler(ArrayList<News> newsArrayList, int iPosition){
        Bundle bundle = new Bundle();
        bundle.putSerializable("newsArrayList", newsArrayList);
        bundle.putInt("position", iPosition);
        return (bundle);
    }
}
