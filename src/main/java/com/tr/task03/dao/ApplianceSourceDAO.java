package com.tr.task03.dao;

import com.tr.task03.bean.Appliance;
import com.tr.task03.bean.Criteria;

import java.util.List;

public interface ApplianceSourceDAO {

    List<Appliance> find(Criteria criteria);
    boolean add(Appliance newAppliance);

}
