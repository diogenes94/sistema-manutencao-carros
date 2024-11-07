package com.unincor.va1.sistema_manutencao_carros.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.unincor.va1.sistema_manutencao_carros.model.domain.Comentario;
import com.unincor.va1.sistema_manutencao_carros.model.domain.Manutencao;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    @Query("from Comentario c where c.manutencao.id = :id order by c.id")
    public List<Comentario> buscarComentarioPorManutencaoId(
            @Param("id") Long idManutencao);

    @Query("from Comentario c where c.manutencao = :manutencao order by c.id")
    public List<Comentario> buscarComentariosPorManutencao(
            @Param("manutencao") Manutencao manutencao);

    public List<Comentario> findByManutencaoOrderById(Manutencao manutencao);
    
    public List<Comentario> findByManutencao_IdOrderById(Long id);

}
