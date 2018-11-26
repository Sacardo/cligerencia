CREATE TABLE endereco (
    idEndereco BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    logradouro VARCHAR(150) NOT NULL,
    bairro VARCHAR(150) NOT NULL,
    numero INT(5) NOT NULL
    complemento VARCHAR (20),
    cep VARCHAR (10),
    cidade VARCHAR (50),
    uf VARCHAR CHAR (2)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cliente (
    idCliente BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    numProntuario VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    nunCIC VARCHAR (12) NOT NULL,
    CPF VARCHAR (18) NOT NULL,
    nomMae VARCHAR (100) NOT NULL,
    nomPai VARCHAR (100) NOT NULL,
    dataCadastro DATE;
    horaCadastro TIME;
    dataNascimento DATE;
    idade CHAR (2);
    id_endereco BIGINT(20) NOT NULL,
    id_contato LONG(20) NOT NULL
    FOREIGN KEY (id_endereco) REFERENCES endereco(idEndereco)
    FOREIGN KEY (id_contato) REFERENCES contato(idCoontato)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE contato(
   idContato Long(20) PRIMARY KEY AUTO_INCREMENT,
   email VARCHAR(100) NOT NULL,
   celular VARCHAR(14) NOT NULL,
   telefone VARCHAR(14) NOT NULL,
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE estoque(
   idproduto Long (20) NOT NULL,
   nameProduto  VARCHAR(20)NOT NULL,
   quantidadeProduto INT(15),
   valorProduto DOUBLE(4,2),
)ENGINE=InnoDB DEFAULT CHARSERT=utf8;

CREATE TABLE agenda(
 idAgenda Long,
 data DATE,
 diaSemana VARCHAR(10),
 hora DATE,
 FOREIGN KEY(id_cliente) REFERENCES cliente(idCliente)
)ENGINE=InnoDB DEFAULT CHARSERT=utf8;