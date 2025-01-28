USE softcare_db;

    CREATE TABLE medicos (

        id BIGINT NOT NULL AUTO_INCREMENT,
        crm VARCHAR(15) NOT NULL,
        nome VARCHAR(100) NOT NULL,
        telefone VARCHAR(19) NOT NULL,
        email VARCHAR(100),
        cpf VARCHAR(11) NOT NULL,
        ativo TINYINT NOT NULL,

        PRIMARY KEY (id)
    );