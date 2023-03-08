DROP ROLE IF EXISTS mypage;
CREATE ROLE mypage WITH LOGIN SUPERUSER PASSWORD 'mypage';


insert into usuario (nome, email, senha, ativo, imagem) values ('Nome Admin Completo', 'admin@cwi.com.br', '$2a$10$VrIbJURwINOR5HOrWFFTNOwSILsioRJSuOGAg8Luvr9qZDSOl5JXG', true, 'https://imgs.search.brave.com/3s16Zf6-jTTWoH3l5U-jU94b8jamNF6HQ6NgHIVLD1c/rs:fit:748:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5M/U3NyRnNLNENUSFpP/WDllUjU1VnBnSGFF/cyZwaWQ9QXBp');

insert into usuario (nome, email, senha, ativo, imagem) values ('Nome Usuario Completo', 'usuario@cwi.com.br', '$2a$10$VrIbJURwINOR5HOrWFFTNOwSILsioRJSuOGAg8Luvr9qZDSOl5JXG', true, 'https://imgs.search.brave.com/Kb61xWMFvwbJJdFhjOpsg77n-LgX_F3iyv-ETNVHDBo/rs:fit:613:225:1/g:ce/aHR0cHM6Ly90c2U0/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC52/RGRwcG1DVkx4bXpu/ZU9VM1doZG5BSGFG/dSZwaWQ9QXBp');

insert into usuario (nome, email, senha, ativo, imagem) values ('Nome Teste Completo', 'teste@cwi.com.br', '$2a$10$VrIbJURwINOR5HOrWFFTNOwSILsioRJSuOGAg8Luvr9qZDSOl5JXG', true, 'https://imgs.search.brave.com/mG0BB_KICFRIim7mz_8prHQC5A2uJDHUIFlkT0qCLD4/rs:fit:473:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5s/U3dWU3F4SGU1TENi/djVVaGt2dGRBSGFI/YiZwaWQ9QXBp');

insert into usuario (nome, email, senha, ativo, imagem) values ('Nome Referencia Completo', 'referencia@cwi.com.br', '$2a$10$VrIbJURwINOR5HOrWFFTNOwSILsioRJSuOGAg8Luvr9qZDSOl5JXG', true, 'https://imgs.search.brave.com/zXFduk-QNzfMCVL4vbnIA5JQpqC5Z81qW01QKQPIU2g/rs:fit:704:225:1/g:ce/aHR0cHM6Ly90c2Ux/LmV4cGxpY2l0LmJp/bmcubmV0L3RoP2lk/PU9JUC5PMjgyaFNm/VThnTEY3YjlaMTc4/dW1RSGFFXyZwaWQ9/QXBp');


insert into permissao (funcao, usuario_id) values ('ADMIN', 1);
insert into permissao (funcao, usuario_id) values ('USUARIO', 1);
insert into permissao (funcao, usuario_id) values ('USUARIO', 2);
insert into permissao (funcao, usuario_id) values ('USUARIO', 3);
insert into permissao (funcao, usuario_id) values ('USUARIO', 4);