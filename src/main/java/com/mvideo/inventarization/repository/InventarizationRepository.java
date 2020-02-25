package com.mvideo.inventarization.repository;

import com.mvideo.inventarization.model.Inventorization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarizationRepository extends JpaRepository<Inventorization, Long>, JpaSpecificationExecutor {
    Page<Inventorization> findAll(Pageable pageable);
}
