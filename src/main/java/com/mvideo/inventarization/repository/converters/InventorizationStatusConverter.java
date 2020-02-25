package com.mvideo.inventarization.repository.converters;

import com.mvideo.inventarization.model.InventorizationStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class InventorizationStatusConverter implements AttributeConverter<InventorizationStatus, String> {
    @Override
    public String convertToDatabaseColumn(InventorizationStatus attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public InventorizationStatus convertToEntityAttribute(String dbData) {
        return InventorizationStatus.valueOf(dbData);
    }
}
