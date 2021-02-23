package com.bartekdobo.gmhelper.service;

import java.util.Arrays;
import java.util.List;

import com.bartekdobo.gmhelper.model.character.CharacterClass;

public class CharacterClassService {

    private List<CharacterClass> characterClasses = Arrays.asList(CharacterClass.values());

    public List<CharacterClass> getCharacterClasses() {
	return characterClasses;
    }
}
