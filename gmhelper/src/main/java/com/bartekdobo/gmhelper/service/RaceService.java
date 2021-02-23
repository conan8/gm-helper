package com.bartekdobo.gmhelper.service;

import java.util.Arrays;
import java.util.List;

import com.bartekdobo.gmhelper.model.character.Race;

public class RaceService {

    private List<Race> races = Arrays.asList(Race.values());

    public List<Race> getRaces() {
	return races;
    }

}
