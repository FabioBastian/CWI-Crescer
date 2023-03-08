DROP TABLE IF EXISTS usuario CASCADE;
DROP TABLE IF EXISTS permissao CASCADE;


CREATE TABLE usuario (
                         id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
                         nome VARCHAR(255) NOT NULL,
                         email VARCHAR(255) NOT NULL,
                         data_atualizacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                         senha VARCHAR(128) NOT NULL,
                         imagem VARCHAR(512),
                         ativo BOOLEAN NOT NULL
);
ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (id);
ALTER TABLE usuario ADD CONSTRAINT uk_usuario_email UNIQUE (email);


CREATE TABLE permissao (
                           id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
                           funcao VARCHAR(100) NOT NULL,
                           usuario_id BIGINT NOT NULL
);
ALTER TABLE permissao ADD CONSTRAINT pk_permissao PRIMARY KEY (id);
ALTER TABLE permissao ADD CONSTRAINT ck_permissao_funcao CHECK (funcao IN ('ADMIN', 'USUARIO'));
ALTER TABLE permissao ADD CONSTRAINT uk_permissao_usuario_id UNIQUE (funcao, usuario_id);
ALTER TABLE permissao ADD CONSTRAINT fk_permissao_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario;
