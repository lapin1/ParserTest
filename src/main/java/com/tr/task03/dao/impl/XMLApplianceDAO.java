package com.tr.task03.dao.impl;

import com.tr.task03.bean.Appliance;
import com.tr.task03.bean.Criteria;

import java.util.List;

public class XMLApplianceDAO {

    private Searcher searcher;

    {
        searcher = new Searcher();
    }



    public List<Appliance> find(Criteria criteria) {

        return searcher.find(criteria);
    }

    public boolean add(Appliance newAppliance) {
        // TODO Auto-generated method stub
        return false;
    }


}
