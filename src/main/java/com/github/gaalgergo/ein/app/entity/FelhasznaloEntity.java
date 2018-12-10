package com.github.gaalgergo.ein.app.entity;

import com.github.gaalgergo.ein.app.kozos.AlapEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "felhasznalok")
public class FelhasznaloEntity extends AlapEntity {
    private String nev;

    private String felhasznaloNev;

    private String jelszo;

    @Enumerated(EnumType.STRING)
    private FelhasznaloTipus tipus;
}
