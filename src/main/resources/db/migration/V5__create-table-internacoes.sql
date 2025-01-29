USE softcare_db;

    CREATE TABLE INTERNACOES (
        id BIGINT AUTO_INCREMENT NOT NULL,
        idPaciente BIGINT NOT NULL,
        dataInicio DATE NOT NULL,
        dataAlta DATE,
        prontuario TEXT,

        PRIMARY KEY (id),
        FOREIGN KEY (idPaciente) REFERENCES pacientes (id)
    );