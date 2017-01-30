package com.example.macie_000.neewstweak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class Channel {

    private Map<String,String> WP = new HashMap<String, String>();
    private Map<String,String> TVN24 = new HashMap<String,String>();
    private Map<String,String> Interia = new HashMap<String,String>();
    public Channel(){
        fillMap();
    }

    private void fillMap(){

        this.getWP().put("Sport", "http://sport.wp.pl/kat,1726,rss.xml");
        this.getWP().put("Wiadomosci", "http://wiadomosci.wp.pl/kat,1329,ver,rss,rss.xml");
        this.getWP().put("Film", "http://film.wp.pl/rss.xml");
        this.getWP().put("Gry", "http://gry.wp.pl/rss/wiadomosci.xml");
        this.getWP().put("Praca", "http://praca.wp.pl/wiadomosci-rss.xml");

        this.getTVN24().put("Sport", "http://sport.tvn24.pl/sport,81,m.xml");
        this.getTVN24().put("Pogoda", "http://www.tvn24.pl/pogoda,7.xml");
        this.getTVN24().put("Wiadomosci", "http://www.tvn24.pl/najnowsze.xml");

        this.getInteria().put("Wiadomosci", "http://fakty.interia.pl/feed");
        this.getInteria().put("Film", "http://kanaly.rss.interia.pl/film.xml");
        this.getInteria().put("Sport", "http://sport.interia.pl/feed");
        this.getInteria().put("Gry", "http://gry.interia.pl/feed");
    }

    public Map<String, String> getWP() {
        return WP;
    }

    public void setWP(Map<String, String> WP) {
        this.WP = WP;
    }

    public Map<String, String> getTVN24() {
        return TVN24;
    }

    public void setTVN24(Map<String, String> TVN24) {
        this.TVN24 = TVN24;
    }

    public Map<String, String> getInteria() {
        return Interia;
    }

    public void setInteria(Map<String, String> interia) {
        Interia = interia;
    }
}
