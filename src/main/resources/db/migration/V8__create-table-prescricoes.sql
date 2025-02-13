USE softcare_db;
    CREATE TABLE prescricoes (
        id BIGINT NOT NULL AUTO_INCREMENT,
        idReceita BIGINT NOT NULL,
        idMedicamento BIGINT NOT NULL,
        descricao TEXT NOT NULL,
        ativo TINYINT NOT NULL,
        data DATE NOT NULL,

        PRIMARY KEY (id),
        FOREIGN KEY (idReceita) REFERENCES receitas(id),
        FOREIGN KEY (idMedicamento) REFERENCES medicamentos(id)
    );