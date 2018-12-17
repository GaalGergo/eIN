package com.github.gaalgergo.ein.app.repository;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.entity.FelhasznaloTipus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FelhasznaloRepository extends JpaRepository<FelhasznaloEntity, Long> {
    FelhasznaloEntity findByFelhasznaloNev(String felhasznaloNev);
    List<FelhasznaloEntity> findByTipus(FelhasznaloTipus tipus);
}
