USE softcare_db;
    CREATE TABLE receitas(
        id BIGINT NOT NULL AUTO_INCREMENT,
        idPaciente BIGINT NOT NULL,
        idMedico BIGINT NOT NULL,
        ativo TINYINT NOT NULL,

        PRIMARY KEY (id),
        FOREIGN KEY (idPaciente) REFERENCES pacientes(id),
        FOREIGN KEY (idMedico) REFERENCES medicos(id)
    );