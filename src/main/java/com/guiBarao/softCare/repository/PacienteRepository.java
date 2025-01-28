package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
     List<Paciente> findAllByAtivoTrue();
}
