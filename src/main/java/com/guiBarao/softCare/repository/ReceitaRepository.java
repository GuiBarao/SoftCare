package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.receita.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
    List<Receita> findByIdPaciente(Long idPaciente);
}
