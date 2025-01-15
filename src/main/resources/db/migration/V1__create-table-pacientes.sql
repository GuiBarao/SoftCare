use softcare_db;

    CREATE TABLE pacientes (
        id BIGINT NOT NULL AUTO_INCREMENT,
        cpf VARCHAR (11) NOT NULL,
        nome VARCHAR(100) NOT NULL,
        data_nascimento DATE NOT NULL,
        email VARCHAR(100),
        telefone VARCHAR(19) NOT NULL,
        ativo TINYINT NOT NULL,

        PRIMARY KEY(id)
    );