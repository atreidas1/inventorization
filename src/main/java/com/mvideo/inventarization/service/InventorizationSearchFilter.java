package com.mvideo.inventarization.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class InventorizationSearchFilter {
    private String [] status;
    private String[] type;
}
