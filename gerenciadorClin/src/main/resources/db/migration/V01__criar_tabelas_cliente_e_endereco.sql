CREATE TABLE endereco (
    idEndereco BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    rua VARCHAR(80) NOT NULL,
    bairro VARCHAR(80) NOT NULL,
    numero INT(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cliente (
    idCliente BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    numProntuario VARCHAR(50) NOT NULL,
    nome VARCHAR(80) NOT NULL,
    nunCIC VARCHAR (12) NOT NULL,
    CPF VARCHAR (18) NOT NULL,
    nomMae VARCHAR (80) NOT NULL,
    nomPai VARCHAR (80) NOT NULL,
    id_endereco BIGINT(20) NOT NULL,
    FOREIGN KEY (id_endereco) REFERENCES endereco(idEndereco)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;