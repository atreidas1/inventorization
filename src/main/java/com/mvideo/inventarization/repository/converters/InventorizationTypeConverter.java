package com.mvideo.inventarization.repository.converters;

import com.mvideo.inventarization.model.InventorizationType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class InventorizationTypeConverter implements AttributeConverter<InventorizationType, String> {
    @Override
    public String convertToDatabaseColumn(InventorizationType attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public InventorizationType convertToEntityAttribute(String dbData) {
        return InventorizationType.valueOf(dbData);
    }
}
