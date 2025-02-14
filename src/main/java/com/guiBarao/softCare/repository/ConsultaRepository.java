package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.consulta.Consulta;
import com.guiBarao.softCare.consulta.StatusConsulta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findAllByStatus(StatusConsulta status);
}
