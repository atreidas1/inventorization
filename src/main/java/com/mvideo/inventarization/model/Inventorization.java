package com.mvideo.inventarization.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "INVENTORIZATION")
public class Inventorization {
    @Column(unique = true, nullable = false)
    private long sapNumber;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InventorizationType type;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InventorizationStatus status;
    @Column(nullable = false)
    private Date dateCreated;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private int storeId;
    //private Person person;

}
