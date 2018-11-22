package com.github.gaalgergo.ein.app.entity;

import com.github.gaalgergo.ein.app.kozos.AlapEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "jegybeirasok")
public class JegybeirasEntity extends AlapEntity {
    private OktatoEntity oktato;
    private TanuloEntity tanulo;
    private TantargyEntity tantargy;
    private Integer erdemjegy;
    private LocalDateTime idopont;
}
