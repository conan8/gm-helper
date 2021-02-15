package com.bartekdobo.gmhelper.model.character;

public enum Skill {

    ATHLETICS("Atletyka", "Obejmuje wyzwania napotykane podczas wspinaczki, skakania lub pływania."),
    ACROBATICS("Akrobatyka", "bbb"), SLEIGHT_OF_HAND("Zwinne dłonie", "ccc"), STEALTH("Skradanie się", "ddd"),
    ARCANA("Wiedza tajemna", "eee"), HISTORY("Historia", "fff"), INVESTIGATION("Śledztwo", "ggg"),
    NATURE("Przyroda", "iii"), RELIGION("Religia", "jjj"), ANIMAL_HANDLING("Opieka nad zwierzętami", "kkk"),
    INSIGHT("Intuicja", "lll"), MEDICINE("Medycyna", "mmm"), PERCEPTION("Percepcja", "nnn"),
    SURVIVAL("Sztuka przetrwania", "ooo"), DECEPTION("Oszustwo", "ppp"), INTIMIDATION("Zastraszanie", "rrr"),
    PERFORMANCE("Występy", "sss"), PERSUATION("Perswazja", "ttt");

    public final String skillName;
    public final String description;

    private Skill(String skillName, String description) {
	this.skillName = skillName;
	this.description = description;
    }

}
