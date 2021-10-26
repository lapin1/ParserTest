package com.tr.jdom;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.SAXException;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class JDOMApplianceParser {
    public static void main(String[] args) throws SAXException, IOException, JDOMException {

        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build("src/main/resources/appliance.xml");

        Element root = document.getRootElement();
        List<Element> appliance = root.getChildren();
        Iterator<Element> applianceIterator = appliance.iterator();

        while (applianceIterator.hasNext()){
            Element applianceElement = applianceIterator.next();
            System.out.println(applianceElement.getChildText("name"));
            System.out.println(applianceElement.getChildText("price"));
        }


    }
}
