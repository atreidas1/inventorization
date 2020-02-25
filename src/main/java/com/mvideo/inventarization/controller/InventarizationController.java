package com.mvideo.inventarization.controller;

import com.mvideo.inventarization.model.Inventorization;
import com.mvideo.inventarization.service.InventorizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventorization")
public class InventarizationController {
    @Autowired
    private InventorizationServiceImpl service;

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Inventorization getInventorization() {
        return null;
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Inventorization> getInventorizations(@RequestParam(value="status") Optional<String[]> status,
                                                     @RequestParam Optional<String> dateCreated,
                                                     @RequestParam Optional<String> type,
                                                     @RequestParam Optional<String> dateStart,
                                                     Pageable pageable) {

        return service.getInvetorizations(pageable, status.orElse(null));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getInventorizations() {
        return "Hello World";
    }
}
