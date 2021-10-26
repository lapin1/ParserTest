package com.tr.task03.entity;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.SAXException;


import java.io.IOException;
import java.util.List;

public class JDOMApplianceParser {
    public static void main(String[] args) throws SAXException, IOException, JDOMException {

        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build("src/main/resources/appliance.xml");

        System.out.println("Root element: " + document.getRootElement().getName());

        Element root = document.getRootElement();

        List<Element> appliances = root.getChildren();

        System.out.print("----------------------------------------------");

        for(int tmp = 0; tmp < appliances.size(); tmp++){
            Element appliance = appliances.get(tmp);
            System.out.println("\nCategory: " + appliance.getName());
            Attribute atr = appliance.getAttribute("id");
            System.out.println("id: " + atr.getValue());
            System.out.println("price: " + appliance.getChild("price").getText());
            System.out.println("batteryCapacity: " + appliance.getChild("battery-capacity").getText());
            System.out.println("os: " + appliance.getChild("os").getText());
            System.out.println("memoryRom: " + appliance.getChild("memory-rom").getText());
            System.out.println("systemMemory: " + appliance.getChild("system-memory").getText());
            System.out.println("cpu: " + appliance.getChild("cpu").getText());
            System.out.println("displayInches: " + appliance.getChild("display-inches").getText());

        }



    }
}
