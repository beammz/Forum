INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');
INSERT INTO USUARIO(nome, email, senha) VALUES('Admin', 'admin@email.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');
INSERT INTO USUARIO(nome, email, senha) VALUES('Beatriz', 'beammz@gmail.com', '$2a$10$GY5TGpaDSqYq1uZ.foRY..2Jr//.s8n27Jj4YW.v13fl6ukO/fn8G');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_ADMIN');
INSERT INTO PERFIL(id, nome) VALUES(3, 'ROLE_ALUNO');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1,1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2,2);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(3,3);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');  -- 1
INSERT INTO CURSO(nome, categoria) VALUES('Python', 'Programação');  -- 2
INSERT INTO CURSO(nome, categoria) VALUES('Java', 'Programação');  -- 3
INSERT INTO CURSO(nome, categoria) VALUES('Kotlin', 'Programação');  -- 4
INSERT INTO CURSO(nome, categoria) VALUES('HTML e CSS', 'Front-end');  -- 5
INSERT INTO CURSO(nome, categoria) VALUES('React', 'Front-end');  -- 6
INSERT INTO CURSO(nome, categoria) VALUES('Angular', 'Front-end');  -- 7
INSERT INTO CURSO(nome, categoria) VALUES('Android','Mobile');  -- 8
INSERT INTO CURSO(nome, categoria) VALUES('Flutter','Mobile');  -- 9

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Erro ao criar projeto', '2021-08-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2021-08-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2021-08-05 20:00:00', 'NAO_RESPONDIDO', 3, 5);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('tag <ul> está dando erro', 'Quando insiro a tag ul no meu VScode ela fica em vermelho e não permite que eu possa fazer adiciona-lá ao CSS.', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 5);

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Try Except não captura request.except_on_400', 'Resultado da rquisição volta 404 mas não estoura excessão quando uso .except_on_400 dentro de um try except!', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 2);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Programa ficando muito pessado', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur reprehenderit quod modi deleniti aut deserunt dolorum incidunt, consectetur delectus porro ex numquam quis officia non, quae ullam? Ab, excepturi inventore.', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 3);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Kotlin é parecido com Java?', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur reprehenderit quod modi deleniti aut deserunt dolorum incidunt, consectetur delectus porro ex numquam quis officia non, quae ullam? Ab, excepturi inventore.', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 4);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Qual a diferença entre props e state em React.js?', 'Qual a diferença entre props e state em react.js, qual as diferenças e como devem ser usados?', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 6);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Angular - Error: Cannot find a differ supporting object "[object Object]" of type "object". NgFor only supports binding to Iterables such as Arrays', 'Tenho esse backend em JavaScript que está rodando na port 3000 e estou tentando fazer a requisição de uma lista de filmes...', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 7);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Quando e como implementar o Parcelable vs Serializable?', 'Após muito tempo utilizando a implementação Serializable nas minhas classes na plataforma Java(Android), descobri o Parcelable, mas fiquei na dúvida em relação as seguintes questões abaixo...', '2021-08-15 17:01:00', 'NAO_RESPONDIDO', 3, 8);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('P: Configuração VSCode + GIT + Flutter ', 'Senhores, Estou a iniciar os estudos em Flutter, fiz a instalação do Flutter, Dart, GIT e VSCode, quando irei iniciar o desenvolvimento o VSCode me retorna o seguinte erro:', '2021-08-15 17:01:00', 'NAORESPONDIDO', 3, 9);