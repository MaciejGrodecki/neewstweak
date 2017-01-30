package com.example.macie_000.neewstweak;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class Reader {
    private static Reader instance = null;
    private URL oRssURL;

    public Reader() {}
    public Reader GetInstance(){
        if(instance == null){
            instance = new Reader();
        }
        return instance;
    }
    public void setURL(String sRssURL) throws MalformedURLException {
        oRssURL = new URL(sRssURL);
    }

    public ArrayList<News> Read()
    {
        ArrayList<News> l_Result = new ArrayList<News>();
        if(oRssURL != null) {
            try {
                DocumentBuilder oDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document oDoc = oDocumentBuilder.parse(oRssURL.openStream());
                NodeList oNodeList = oDoc.getElementsByTagName("item");




                for (int i = 0; i < oNodeList.getLength(); i++) {
                    Node oNode = oNodeList.item(i);
                    if(oNode.getNodeType() == Node.ELEMENT_NODE)
                    {
                        Element oElement = (Element) oNodeList.item(i);
                        l_Result.add(new News(
                        oElement.getElementsByTagName("title").item(0).getTextContent(),
                        oElement.getElementsByTagName("description").item(0).getTextContent(),
                        oElement.getElementsByTagName("link").item(0).getTextContent()
                        ));
                    }
                }
                return l_Result;

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return l_Result;
    }

    private String GetValue(Element oElement, String sNodeName){
        return oElement.getElementsByTagName(sNodeName).item(0).getFirstChild().getNodeValue();
    }
}
