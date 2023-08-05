INSERT INTO tb_categoria(descricao) VALUES ('Curso');
INSERT INTO tb_categoria(descricao) VALUES ('Oficina');

INSERT INTO tb_atividades(nome, descricao, preco, categoria_id) VALUES ('Curso HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_atividades(nome, descricao, preco, categoria_id) VALUES ('Oficina Github', 'Controle versões do seus projetos', 50.00, 2);

INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('José Silva', 'jose@gmail.com', 1);
INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('José Silva', 'jose@gmail.com', 2);
INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('Tiago Faria', 'tiago@gmail.com', 1);
INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('Maria do Rosário', 'maria@gmail.com', 1);
INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('Maria do Rosário', 'maria@gmail.com', 2);
INSERT INTO tb_participante(nome, email, atividade_id) VALUES ('Teresa Silva', 'teresa@gmail.com', 2);

INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES ('2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES ('2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES ('2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2);
