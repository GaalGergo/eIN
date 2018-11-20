package com.github.gaalgergo.ein.app.tanulo;

import com.github.gaalgergo.ein.app.kozos.AlapEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tanulok")
public class TanuloEntity extends AlapEntity {
    private String nev;
    private String email;
    private LocalDate szuletesiDatum;
}
