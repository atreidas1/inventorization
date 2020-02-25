package com.mvideo.inventarization.service;

import com.mvideo.inventarization.model.Inventorization;
import com.mvideo.inventarization.repository.InventarizationRepository;
import com.mvideo.inventarization.repository.spec.StatusSpecification;
import com.mvideo.inventarization.repository.spec.TypeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventorizationServiceImpl implements  IInventorizationService {
    @Autowired
    private InventarizationRepository repository;
    @Override
    public Inventorization getInvetorization(long id) {
        Optional<Inventorization> inventorization = repository.findById(id);
        return inventorization.isPresent() ? inventorization.get() : null;
    }

    @Override
    public Page<Inventorization> getInvetorizations(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Inventorization> getInvetorizations(Pageable pageable,String [] statuses) {
        Specification<Inventorization> filterSpec = Specification
                .where(new StatusSpecification(statuses));
        return repository.findAll(filterSpec, pageable);
    }

    @Override
    public Inventorization createInvetorization(Inventorization inventorization) {
        return repository.save(inventorization);
    }

    @Override
    public Inventorization updateInvetorization(Inventorization inventorization) {
        return null;
    }
}
