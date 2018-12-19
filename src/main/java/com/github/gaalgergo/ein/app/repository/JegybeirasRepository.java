package com.github.gaalgergo.ein.app.repository;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.entity.JegybeirasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JegybeirasRepository extends JpaRepository<JegybeirasEntity, Long> {
    List<JegybeirasEntity> findByOktato(FelhasznaloEntity oktato);
}
