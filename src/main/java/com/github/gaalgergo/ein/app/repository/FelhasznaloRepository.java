package com.github.gaalgergo.ein.app.repository;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FelhasznaloRepository extends JpaRepository<FelhasznaloEntity, Integer> {
    FelhasznaloEntity findByFelhasznaloNev(String felhasznaloNev);
}
