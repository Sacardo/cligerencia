CREATE TABLE cliente(
    idCliente BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    numCliente VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    nunCIC VARCHAR (12) NOT NULL,
    CPF VARCHAR(18) NOT NULL,
    email VARCHAR(100),
    dataCadastro DATE,
    dataNascimento DATE,
    logradouro VARCHAR(150),
    bairro VARCHAR(150),
    numero MEDIUMINT(5),
    complemento VARCHAR (20),
    cep VARCHAR (10),
    cidade VARCHAR (50),
    uf CHAR (2),
    celular VARCHAR(14),
    telefone VARCHAR(14),
    id_Cliente BIGINT(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;




