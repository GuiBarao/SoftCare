package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {}
