package com.bartekdobo.gmhelper.model.character;

import java.util.Collections;
import java.util.List;

public enum Race {

    HUMAN("Człowiek", "Wartość wszystkich twoich cech wzrasta o 1.", "Średni", "9 metrów",
	    "Potrafisz mówić, czytać i pisać we wspólnym oraz dodatkowym wybranym języku.", Collections.emptyList()),
    ELF_WOOD("Elf leśny", "Wartość twojej Zręczności wzrasta o 2. Wartość twojej Mądrości wzrasta o 1.", "Średni",
	    "10,5 metra", "Potrafisz mówić, czytać i pisać w językach wspólnym i elfim.", Collections.emptyList()),
    ELF_HIGH("Elf wysoki", "Wartość twojej Zręczności wzrasta o 2. Wartość twojej Inteligencji wzrasta o 1.", "Średni",
	    "9 metrów",
	    "Potrafisz mówić, czytać i pisać w językach wspólnym i elfim. Potrafisz mówić, czytać i pisać w dodatkowym wybranym języku.",
	    Collections.emptyList()),
    ELF_DARK("Elf mroczny", "Wartość twojej Zręczności wzrasta o 2. Wartość twojej Charyzmy wzrasta o 1.", "Średni",
	    "9 metrów", "Potrafisz mówić, czytać i pisać w językach wspólnym i elfim.", Collections.emptyList()),
    DWARF_MOUNTAIN("Krasnolud górski", "Wartość twojej Kondycji wzrasta o 2. Wartość twojej Siły wzrasta o 2.",
	    "Średni", "7,5 metra. Nie obniża jej noszenie ciężkiego pancerza. ",
	    "Potrafisz mówić, czytać i pisać w językach wspólnym i krasnoludzkim.", Collections.emptyList()),
    DWARF_HILL("Krasnolud wzgórzowy", "Wartość twojej Kondycji wzrasta o 2. Wartość twojej Mądrości wzrasta o 1.",
	    "Średni", "7,5 metra. Nie obniża jej noszenie ciężkiego pancerza. ",
	    "Potrafisz mówić, czytać i pisać w językach wspólnym i krasnoludzkim.", Collections.emptyList()),
    HALFLING_STOUT("Niziołek hardy", "Wartość twojej Zręczności wzrasta o 2. Wartość twojej Kondycji wzrasta o 1.",
	    "Mały", "7,5 metra", "Potrafisz mówić, czytać i pisać we wspólnym oraz dodatkowym wybranym języku.",
	    Collections.emptyList()),
    HALFLING_LIGHTFOOT("Niziołek lekkostopy",
	    "Wartość twojej Zręczności wzrasta o 2. Wartość twojej Charyzmy wzrasta o 1.", "Mały", "7,5 metra",
	    "Potrafisz mówić, czytać i pisać we wspólnym oraz dodatkowym wybranym języku.", Collections.emptyList());

    public final String raceName;
    public final String attributeIncrease;
    public final String size;
    public final String speed;
    public final String languages;
    public final List<RaceSpecial> specials;

    private Race(String raceName, String attributeIncrease, String size, String speed, String languages,
	    List<RaceSpecial> specials) {
	this.raceName = raceName;
	this.attributeIncrease = attributeIncrease;
	this.size = size;
	this.speed = speed;
	this.languages = languages;
	this.specials = specials;
    }

}
