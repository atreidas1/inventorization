package com.mvideo.inventarization.repository.spec;

import com.mvideo.inventarization.model.Inventorization;
import com.mvideo.inventarization.model.InventorizationStatus;
import com.mvideo.inventarization.model.InventorizationType;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

;

public class TypeSpecification implements Specification<Inventorization> {
    private String [] types;
    public static final String TYPE_COLUMN = "type";
    public TypeSpecification(String [] types) {
        this.types = types;
    }

    @Override
    public Predicate toPredicate(Root<Inventorization> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if(types == null) {
            return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
        }
        CriteriaBuilder.In<InventorizationType> in = criteriaBuilder.in(root.get(TYPE_COLUMN));
        for (String type: types) {
            in.value(InventorizationType.valueOf(type));
        }
        return in;
    }
}
