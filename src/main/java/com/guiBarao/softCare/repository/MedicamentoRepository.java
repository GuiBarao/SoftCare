package com.guiBarao.softCare.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.guiBarao.softCare.medicamentos.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    Page<Medicamento> findAllByAtivoTrue (Pageable pageable);
}
