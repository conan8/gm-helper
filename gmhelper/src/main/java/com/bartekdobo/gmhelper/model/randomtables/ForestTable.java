package com.bartekdobo.gmhelper.model.randomtables;

public enum ForestTable {

    EVENT_1(1, "1k4 - 1 prostaczkowie"), EVENT_2(2, "2k4 wilki"), EVENT_3(3, "1 niedźwiedź"), EVENT_4(4, "2k4 gobliny"),
    EVENT_5(5, "1 sowoniedźwiedź"), EVENT_6(6, "driada"), EVENT_7(7, "1 druid"), EVENT_8(8, "1k4 centaury"),
    EVENT_9(9, "2k4 skrzaty"), EVENT_10(10, "1 jednorożec");

    public final int rollValue;
    public final String description;

    private ForestTable(int rollValue, String description) {
	this.rollValue = rollValue;
	this.description = description;
    }

}
