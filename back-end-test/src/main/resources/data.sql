/* Category */
INSERT INTO categories VALUES(default, 'Alimentos');
INSERT INTO categories VALUES(default, 'Eletrodomésticos');
INSERT INTO categories VALUES(default, 'Móveis');

/* Product Alimentos */
INSERT INTO products VALUES(default, 'Arroz', (select id from categories where name = 'Alimentos'));
INSERT INTO products VALUES(default, 'Feijão', (select id from categories where name = 'Alimentos'));

/* Product Eletrodomésticos */
INSERT INTO products VALUES(default, 'Aspirador de pó', (select id from categories where name = 'Eletrodomésticos'));
INSERT INTO products VALUES(default, 'Batedeira', (select id from categories where name = 'Eletrodomésticos'));
INSERT INTO products VALUES(default, 'Liquidificador', (select id from categories where name = 'Eletrodomésticos'));

/* Product Móveis */
INSERT INTO products VALUES(default, 'Sofá', (select id from categories where name = 'Móveis'));
INSERT INTO products VALUES(default, 'Mesa', (select id from categories where name = 'Móveis'));
INSERT INTO products VALUES(default, 'Estante', (select id from categories where name = 'Móveis'));