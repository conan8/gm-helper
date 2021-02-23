package com.bartekdobo.gmhelper.model.character;

public enum CharacterClass {

    BARBARIAN("Barbarzyńca", "aaa", "k12", "Siła", "Siła i Kondycja",
	    "lekkie i średnie pancerze, tarcze, bronie proste i żołnierskie"),
    BARD("Bard", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    WARLOCK("Czarownik", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    DRUID("Druid", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    CLERIC("Kleryk", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    ROGUE("Łotr", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    RANGER("Łowca", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    MAGE("Mag", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    MONK("Mnich", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    PALADIN("Paladyn", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    WARRIOR("Wojownik", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier"),
    SORCERER("Zaklinacz", "aaa", "k8", "Charyzma", "Zręczność i Charyzma",
	    "lekkie pancerze, bronie proste, kusza ręczna, miecz długi, miecz krótki, rapier");

    public final String className;
    public final String description;
    public final String kw;
    public final String mainAttribute;
    public final String bro;
    public final String proficiency;

    private CharacterClass(String className, String description, String kw, String mainAttribute, String bro,
	    String proficiency) {
	this.className = className;
	this.description = description;
	this.kw = kw;
	this.mainAttribute = mainAttribute;
	this.bro = bro;
	this.proficiency = proficiency;
    }
}
