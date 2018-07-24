/* Category */
INSERT INTO categories (name) VALUES('Alimentos');
INSERT INTO categories (name) VALUES('Eletrodomésticos');
INSERT INTO categories (name) VALUES('Móveis');

/* Product Alimentos */
INSERT INTO products (name, category_id) VALUES('Arroz', (select id from categories where name = 'Alimentos'));
INSERT INTO products (name, category_id) VALUES('Feijão', (select id from categories where name = 'Alimentos'));

/* Product Eletrodomésticos */
INSERT INTO products (name, category_id) VALUES('Aspirador de pó', (select id from categories where name = 'Eletrodomésticos'));
INSERT INTO products (name, category_id) VALUES('Batedeira', (select id from categories where name = 'Eletrodomésticos'));
INSERT INTO products (name, category_id) VALUES('Liquidificador', (select id from categories where name = 'Eletrodomésticos'));

/* Product Móveis */
INSERT INTO products (name, category_id) VALUES('Sofá', (select id from categories where name = 'Móveis'));
INSERT INTO products (name, category_id) VALUES('Mesa', (select id from categories where name = 'Móveis'));
INSERT INTO products (name, category_id) VALUES('Estante', (select id from categories where name = 'Móveis'));