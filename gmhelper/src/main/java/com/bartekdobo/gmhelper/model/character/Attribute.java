package com.bartekdobo.gmhelper.model.character;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Attribute {

    STR("Siła", Arrays.asList("naturalną muskulaturę", "siłę fizyczną"),
	    Arrays.asList("barbarzyńcy", "paladyna", "wojownika"), Arrays.asList(Skill.ATHLETICS),
	    "Siła jest miarą krzepy, sprawności atletycznej i granic, do jakich możesz oddziaływać czystą tężyzną fizyczną."),
    DEX("Zręczność", Arrays.asList("zwinność fizyczną", "refleks", "zmysł równowagi", "grację"),
	    Arrays.asList("łotra", "łowcy", "mnicha"),
	    Arrays.asList(Skill.ACROBATICS, Skill.SLEIGHT_OF_HAND, Skill.STEALTH),
	    "Zręczność to miara refleksu, zwinności i równowagi."),
    CON("Kondycja", Arrays.asList("zdrowie", "wigor", "siły życiowe"), Arrays.asList("wszystkich"),
	    Collections.emptyList(), "Kondycja jest miarą zdrowia, wigoru i sił witalnych."),
    INT("Inteligencja", Arrays.asList("bystrość umysłu", "pamięć", "zdolność logicznego myślenia"),
	    Arrays.asList("maga"),
	    Arrays.asList(Skill.ARCANA, Skill.HISTORY, Skill.INVESTIGATION, Skill.NATURE, Skill.RELIGION),
	    "Inteligencja jest miarą lotności umysłu, dokładności pamięci i zdolności rozumowania."),
    WIS("Mądrość", Arrays.asList("czujność", "spostrzegawczość", "wyczucie"), Arrays.asList("druida", "kleryka"),
	    Arrays.asList(Skill.ANIMAL_HANDLING, Skill.INSIGHT, Skill.MEDICINE, Skill.PERCEPTION, Skill.SURVIVAL),
	    "Mądrość reprezentuje wyczulenie na otaczającą cię rzeczywistość, a także spostrzegawczość i wyczucie."),
    CHA("Charyzma", Arrays.asList("pewność siebie", "elokwencję", "zdolności przywódcze"),
	    Arrays.asList("barda", "czarownika", "zaklinacza"),
	    Arrays.asList(Skill.DECEPTION, Skill.INTIMIDATION, Skill.PERFORMANCE, Skill.PERSUATION),
	    "Charyzma to miara twojej zdolności do skutecznych interakcji z innymi. Zawierają się w niej pewność siebie i elokwencja, lecz może także odzwierciedlać ujmującą bądź władczą osobowość. ");

    public final String attributeName;
    public final List<String> attributeMeasures;
    public final List<String> importantFor;
    public final List<Skill> skills;
    public final String description;

    private Attribute(String attributeName, List<String> attributeMeasures, List<String> importantFor,
	    List<Skill> skills, String description) {
	this.attributeName = attributeName;
	this.attributeMeasures = attributeMeasures;
	this.importantFor = importantFor;
	this.skills = skills;
	this.description = description;
    }

}
