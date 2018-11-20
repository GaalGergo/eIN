package com.github.gaalgergo.ein.app.kozos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AlapEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long azon;
}
