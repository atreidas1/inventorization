package com.mvideo.inventarization.service;

import com.mvideo.inventarization.model.Inventorization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IInventorizationService {
    Inventorization getInvetorization(long id);
    Page<Inventorization> getInvetorizations(Pageable pageable);
    Inventorization createInvetorization(Inventorization inventorization);
    Inventorization updateInvetorization(Inventorization inventorization);
    Page<Inventorization> getInvetorizations(Pageable pageable,String[] statuses);

}
