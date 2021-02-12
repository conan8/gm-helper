package com.bartekdobo.gmhelper.service;

import java.util.Arrays;
import java.util.List;

import com.bartekdobo.gmhelper.model.character.Attribute;

public class AttributeService {

    private List<Attribute> attributes = Arrays.asList(Attribute.values());

    public List<Attribute> getAttributes() {
	return attributes;
    }

}
