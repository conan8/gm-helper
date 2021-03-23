package com.bartekdobo.gmhelper.service;

import java.util.Arrays;
import java.util.List;

import com.bartekdobo.gmhelper.model.randomtables.CityTable;
import com.bartekdobo.gmhelper.model.randomtables.ForestTable;

public class RandomTablesService {

    private List<ForestTable> forestTable = Arrays.asList(ForestTable.values());
    private List<CityTable> cityTable = Arrays.asList(CityTable.values());

    public List<ForestTable> getForestTable() {
	return forestTable;
    }

    public List<CityTable> getCityTable() {
	return cityTable;
    }
}
