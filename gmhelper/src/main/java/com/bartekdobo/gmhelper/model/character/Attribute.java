package com.bartekdobo.gmhelper.model.character;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Attribute {

    STR("Siła", "aaa", Arrays.asList(Skill.ATHLETICS)),
    DEX("Zręczność", "bbb", Arrays.asList(Skill.ACROBATICS, Skill.SLEIGHT_OF_HAND, Skill.STEALTH)),
    CON("Kondycja", "ccc", Collections.emptyList()),
    INT("Inteligencja", "ddd",
	    Arrays.asList(Skill.ARCANA, Skill.HISTORY, Skill.INVESTIGATION, Skill.NATURE, Skill.RELIGION)),
    WIS("Mądrość", "eee",
	    Arrays.asList(Skill.ANIMAL_HANDLING, Skill.INSIGHT, Skill.MEDICINE, Skill.PERCEPTION, Skill.SURVIVAL)),
    CHA("Charyzma", "fff", Arrays.asList(Skill.DECEPTION, Skill.INTIMIDATION, Skill.PERFORMANCE, Skill.PERSUATION));

    public final String attributeName;
    public final String description;
    public final List<Skill> skills;

    private Attribute(String attributeName, String description, List<Skill> skills) {
	this.attributeName = attributeName;
	this.description = description;
	this.skills = skills;
    }

}
