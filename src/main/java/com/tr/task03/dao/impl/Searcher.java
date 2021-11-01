package com.tr.task03.dao.impl;

import com.tr.task03.bean.Appliance;
import com.tr.task03.bean.Criteria;

import java.util.List;

public class Searcher {

    private ApplianceRepository repository;
    private List<String> searchData;

    public Searcher() {
        this.repository = ApplianceRepository.getInstance() ;
        searchData = initSearchData();
    }


    public List<Appliance> find(Criteria criteria){

        return null;
    }

    private List<String> initSearchData() {
        List<Appliance> appliances = repository.getInstance().getData();
        return null;
    }

}
