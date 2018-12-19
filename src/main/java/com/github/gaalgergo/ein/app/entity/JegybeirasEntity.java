package com.github.gaalgergo.ein.app.entity;

import com.github.gaalgergo.ein.app.kozos.AlapEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "jegybeirasok")
public class JegybeirasEntity extends AlapEntity {

    @ManyToOne
    private FelhasznaloEntity oktato;

    @ManyToOne
    private FelhasznaloEntity tanulo;

    @OneToOne
    private TantargyEntity tantargy;

    private Integer erdemjegy;

    private LocalDateTime idopont;
}
