USE softcare_db;

    CREATE TABLE reposicoes (

        id BIGINT NOT NULL AUTO_INCREMENT,
        idMedicamento BIGINT NOT NULL,
        status ENUM('PENDENTE', 'APROVADO', 'REJEITADO', 'FINALIZADO') NOT NULL,
        dataPedido DATE NOT NULL,

        PRIMARY KEY (id),
        FOREIGN KEY (idMedicamento) REFERENCES medicamentos(id)
    );