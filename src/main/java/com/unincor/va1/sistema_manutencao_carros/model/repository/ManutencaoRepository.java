package com.unincor.va1.sistema_manutencao_carros.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.unincor.va1.sistema_manutencao_carros.model.domain.Manutencao;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {

    @Query("select manut from Manutencao manut "
            + "join fetch manut.comentarios where manut.id = :id")
    public Optional<Manutencao> buscarManutencaoComComentario(@Param("id") Long idManut);

}
