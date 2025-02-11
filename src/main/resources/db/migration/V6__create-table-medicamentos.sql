USE softcare_db;

    CREATE TABLE medicamentos (
        id BIGINT NOT NULL AUTO_INCREMENT,
        nome VARCHAR (150) NOT NULL,
        preco REAL NOT NULL,
        descricao TEXT NOT NULL,
        quantEstoque BIGINT,
        ativo TINYINT NOT NULL,

        PRIMARY KEY (id)
    );