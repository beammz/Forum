INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');
INSERT INTO USUARIO(nome, email, senha) VALUES('Admin', 'admin@email.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');
INSERT INTO USUARIO(nome, email, senha) VALUES('Beatriz', 'beammz@gmail.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_ADMIN');
INSERT INTO PERFIL(id, nome) VALUES(3, 'ROLE_ALUNO');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1,1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2,2);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(3,3);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('Python', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('Java', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('Kotlin', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML e CSS', 'Front-end');
INSERT INTO CURSO(nome, categoria) VALUES('React', 'Front-end');
INSERT INTO CURSO(nome, categoria) VALUES('Angular', 'Front-end');
INSERT INTO CURSO(nome, categoria) VALUES('Android','Mobile');
INSERT INTO CURSO(nome, categoria) VALUES('Flutter','Mobile');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Erro ao criar projeto', '2021-08-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2021-08-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2021-08-05 20:00:00', 'NAO_RESPONDIDO', 3, 5);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('tag <ul> está dando erro', 'Quando insiro a tag ul no meu VScode ela fica em vermelho e não permite que eu possa fazer adiciona-lá ao CSS.', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 5);