USE softcare_db;

    ALTER TABLE medicos
        ADD COLUMN preco_consulta REAL NOT NULL DEFAULT 0;