package com.bartekdobo.gmhelper.model.randomtables;

public enum CityTable {

    EVENT_1(1, "1k4 - 1 prostaczkowie"), EVENT_2(2, "2k4 bandyci"), EVENT_3(3, "1 szlachcic"),
    EVENT_4(4, "2k4 handlarze"), EVENT_5(5, "1 złodziej"), EVENT_6(6, "1 mag"), EVENT_7(7, "1 rycerz"),
    EVENT_8(8, "1k4 strażnicy"), EVENT_9(9, "2k4 prostaczkowie"), EVENT_10(10, "1 kapłan");

    public final int rollValue;
    public final String description;

    private CityTable(int rollValue, String description) {
	this.rollValue = rollValue;
	this.description = description;
    }

}
