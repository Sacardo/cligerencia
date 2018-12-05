CREATE TABLE cliente(
    idCliente BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    numCliente VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    nunCIC VARCHAR (12) NOT NULL,
    CPF VARCHAR (18) NOT NULL,
    idade CHAR(2),
    email VARCHAR(100) NOT NULL,
    dataCadastro DATE,
    dataNascimento DATE
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE endereco (
    idEndereco BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    logradouro VARCHAR(150) NOT NULL,
    bairro VARCHAR(150) NOT NULL,
    numero INT(5) NOT NULL,
    complemento VARCHAR (20),
    cep VARCHAR (10),
    cidade VARCHAR (50),
    uf CHAR (2),
    id_Cliente BIGINT(20) NOT NULL,
    FOREIGN KEY (id_Cliente) REFERENCES cliente(idCliente)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
      
CREATE TABLE contato(
   idContato BIGINT (20) PRIMARY KEY AUTO_INCREMENT,
  
   celular VARCHAR(14) NOT NULL,
   telefone VARCHAR(14) NOT NULL,
   id_Cliente BIGINT(20) NOT NULL,
   FOREIGN KEY (id_Cliente) REFERENCES cliente(idCliente)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;




