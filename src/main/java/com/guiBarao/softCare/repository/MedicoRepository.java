package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.medico.DadosListagemMedico;
import com.guiBarao.softCare.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    List<Medico> findAllByAtivoTrue();
}
