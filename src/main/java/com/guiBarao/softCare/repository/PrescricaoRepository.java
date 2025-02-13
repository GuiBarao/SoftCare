package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.prescricao.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {

     List<Prescricao> findByIdReceita (Long idReceita);
}
