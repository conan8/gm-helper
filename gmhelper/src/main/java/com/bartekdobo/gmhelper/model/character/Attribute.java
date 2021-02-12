package com.bartekdobo.gmhelper.model.character;

public enum Attribute {

    STR("Siła"), DEX("Zręczność"), CON("Kondycja"), INT("Inteligencja"), WIS("Mądrość"), CHA("Charyzma");

    public final String attributeName;

    private Attribute(String attributeName) {
	this.attributeName = attributeName;
    }

}
