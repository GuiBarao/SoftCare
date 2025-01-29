USE softcare_db;

    CREATE TABLE consultas (

        id BIGINT NOT NULL AUTO_INCREMENT,
        idMedico BIGINT NOT NULL,
        idPaciente BIGINT NOT NULL,
        data DATE NOT NULL,
        horario TIME NOT NULL,
        prontuario TEXT,
        status ENUM('MARCADA', 'REALIZADA', 'CANCELADA') NOT NULL,

        PRIMARY KEY (id),
        FOREIGN KEY (idMedico) REFERENCES medicos (id),
        FOREIGN KEY (idPaciente) REFERENCES pacientes (id)
    );