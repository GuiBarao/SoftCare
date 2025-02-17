package com.guiBarao.softCare.repository;

import com.guiBarao.softCare.reposicaoestoque.ReposicaoEstoque;
import com.guiBarao.softCare.reposicaoestoque.StatusReposicao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReposicaoRepository extends JpaRepository<ReposicaoEstoque, Long> {

    public Page<ReposicaoEstoque> findAllByStatus(StatusReposicao status, Pageable page);

    public Page<ReposicaoEstoque> findAll (Pageable page);
}
