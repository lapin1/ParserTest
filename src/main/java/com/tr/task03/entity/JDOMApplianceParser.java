package com.tr.task03.entity;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class JDOMApplianceParser {
    public static void main(String[] args) throws  IOException, JDOMException {


        SAXBuilder builder = new SAXBuilder();


        Document document = builder.build("src/main/resources/appliance.xml");


        Element root = document.getRootElement();

        System.out.println("Root element: " + document.getRootElement().getName());
        System.out.println("Number of appliances in xml: " + root.getChildren().size());


        List<Element> appliances = root.getChildren();


        System.out.print("----------------------------------------------");

        Iterator<Element> itr = appliances.iterator();

        while (itr.hasNext()){
            Element appliance = (Element) itr.next();

            System.out.println();

            System.out.println("id: " + appliance.getAttributeValue("id"));
            System.out.println("category: " + appliance.getName());
            System.out.println("price: " + appliance.getChildText("price"));
           //System.out.println("os: " + appliance.getChildText("os"));
           //System.out.println("memory-rom: " + appliance.getChildText("memory-rom"));
           //System.out.println("system-memory: " + appliance.getChildText("system-memory"));
           //System.out.println("cpu: " + appliance.getChildText("cpu"));
           //System.out.println("display-inches: " + appliance.getChildText("display-inches"));


        }




    }
}
