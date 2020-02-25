package com.mvideo.inventarization.repository.spec;

import com.mvideo.inventarization.model.Inventorization;
import com.mvideo.inventarization.model.InventorizationStatus;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.*;;

public class StatusSpecification implements Specification<Inventorization> {
    private String [] statutes;
    public static final String STATUS_COLUMN = "status";
    public StatusSpecification(String [] statutes) {
        this.statutes = statutes;
    }

    @Override
    public Predicate toPredicate(Root<Inventorization> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if(statutes == null) {
            return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
        }
        CriteriaBuilder.In<InventorizationStatus> in = criteriaBuilder.in(root.get(STATUS_COLUMN));
        for (String status: statutes) {
            in.value(InventorizationStatus.valueOf(status));
        }
        return in;
    }
}
