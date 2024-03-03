CREATE TABLE fretes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    peso DOUBLE NOT NULL,
    altura DOUBLE NOT NULL,
    largura DOUBLE NOT NULL,
    comprimento DOUBLE NOT NULL,
    cep VARCHAR(12),
    logradouro VARCHAR(100),
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    localidade VARCHAR(100),
    uf VARCHAR(5),
    numero INT,
    cpf VARCHAR(12) NOT NULL,
    nome VARCHAR(100) NOT NULL
);
