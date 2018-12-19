package com.github.gaalgergo.ein.app.repository;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.entity.TanOraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface TanoraRepository extends JpaRepository<TanOraEntity, Long> {
    TanOraEntity findFirstByOktatoAndIdopontAfterOrderByIdopont(FelhasznaloEntity felhasznaloEntity, LocalDateTime idopont);
}
