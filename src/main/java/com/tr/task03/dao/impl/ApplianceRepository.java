package com.tr.task03.dao.impl;

import com.tr.task03.bean.Appliance;

import java.util.List;

public class ApplianceRepository {
    private static final ApplianceRepository instance = new ApplianceRepository();

    private List<Appliance> data;

    private ApplianceRepository() {
        JDOMApplianceParser parser = new JDOMApplianceParser();
        data = parser.parse();
    }

    public List<Appliance> getData(){
        return data;
    }

    public static ApplianceRepository getInstance() {
        return instance;
    }

}
