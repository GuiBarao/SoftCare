USE softcare_db;
    ALTER TABLE medicamentos
        ADD COLUMN estoqueMaximo BIGINT NOT NULL DEFAULT 300;