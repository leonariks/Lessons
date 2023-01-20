CREATE TABLE IF NOT EXISTS post
(
	id serial NOT NULL PRIMARY KEY,
	title varchar(50) NOT NULL,
	salary decimal(10,2) NOT NULL
);
DROP TABLE post CASCADE;

SELECT * FROM post; 


CREATE TABLE IF NOT EXISTS employee
(
	id serial NOT NULL PRIMARY KEY,
	firstname varchar(50) NOT NULL,
	name varchar(50) NOT NULL,
	patronymic varchar(50) NOT NULL,
	telephone varchar(18) NOT NULL,
	datebirth date NOT NULL,
	post_id integer NOT NULL REFERENCES post(id)
);

SELECT * FROM employee;

CREATE TABLE IF NOT EXISTS "order"
(
	id serial NOT NULL PRIMARY KEY,
	registration timestamp NOT NULL,
	ending timestamp NULL,
	price decimal(10,2) NOT NULL,
	status varchar(50) NOT NULL,
	emp_ID integer NOT NULL REFERENCES employee(id)
);


CREATE TABLE IF NOT EXISTS coffee
(
	id serial NOT NULL PRIMARY KEY,
	title varchar(50) NOT NULL,
	price decimal(10,2) NOT NULL,
	volume integer NOT NULL,
	description text NULL,
	recept text NOT NULL
);

CREATE TABLE IF NOT EXISTS ingridients 
(
	id serial NOT NULL PRIMARY KEY,
	title varchar(50) NOT NULL,
	price decimal(10,2) NOT NULL,
	description text NULL
);


CREATE TABLE IF NOT EXISTS toppings
(
	id serial NOT NULL PRIMARY KEY,
	title varchar(50) NOT NULL,
	price decimal(10,2) NOT NULL,
	description text NULL
);

CREATE TABLE IF NOT EXISTS order_coffee
(
	id serial NOT NULL PRIMARY KEY,
	ord_id integer NOT NULL REFERENCES "order"(id),
	cof_id integer NOT NULL REFERENCES coffee(id),
	count_cof integer NOT NULL,
	UNIQUE(ord_id,cof_id)
);

DROP TABLE order_coffee CASCADE;

CREATE TABLE IF NOT EXISTS ord_cof_top
(
	top_id integer NOT NULL REFERENCES toppings(id) ON DELETE CASCADE,
	ord_cof_id integer NOT NULL REFERENCES order_coffee(id) ON DELETE CASCADE,
	UNIQUE(top_id,ord_cof_id)
);

DROP TABLE ord_cof_top;



CREATE TABLE IF NOT EXISTS ing_cof
(
	volume_ing integer NOT NULL,
	volume_type varchar(10) NOT NULL,
	ing_id integer NOT NULL REFERENCES ingridients(id) ON DELETE CASCADE,
	cof_id integer NOT NULL REFERENCES coffee(id) ON DELETE CASCADE,
	UNIQUE(ing_id,cof_id)
);

DROP TABLE ing_cof;



INSERT INTO post (title, salary) VALUES
('Бариста',40000),
('Менеджер',70000),
('Директор',120000);


INSERT INTO employee (firstname, name, patronymic, telephone, datebirth,post_id) VALUES
('Иванов','Антон','Юрьевич','+7(921)666-23-32','1993-10-24',3),
('Шмалько','Ирина','Генадьевна','+7(911)326-53-35','1999-01-14',2),
('Петров','Андрей','Кириллович','+7(962)645-53-12','2001-08-10',1);

SELECT * FROM employee;

INSERT INTO "order" (registration, price, status, ending, emp_id) VALUES
('2022-12-11 18:35:16',1200,'Завершен','2022-12-11 18:40:12',3),
('2022-12-11 18:44:31',0,'Отменён',NULL,3),
('2022-12-11 18:50:03',820,'Завершен','2022-12-11 18:52:09',3);

INSERT INTO coffee (title, price, volume, description, recept) VALUES
('Капучино',220, 210,
 'кофейный напиток итальянской кухни 
 на основе эспрессо с добавлением в него подогретого вспененного молока.',
'В чашку с объемом 150-180 мл сначала наливают порцию эспрессо, 
 а все остальное место заполняют вспененным молоком. 
 Пена должна быть однородная и эластичная.'
),
('Латте',350, 400,
 'кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, 
 молока и кофе эспрессо',
'Подогрейте молоко, не давая ему закипеть и взбейте пену.
 Приготовьте порцию эспрессо традиционным способом
 и перелейте её в кофейный стакан или керамическую чашку большого объема.
 Добавьте молоко. Тонкой струйкой влейте теплое молоко в кофе.'
),
('Мокко',450, 300,
 'сорт кофе вида арабика, названный по портовому городу Моха в Йемене.
 Кофейное дерево мокко. Мокко. Молотая медная турка с льющимся турецким кофе.',
'Подогрейте жаропрочный бокал для горячих напитков и молоко.
 В подогретый бокал налейте сироп, затем эспрессо и наконец горячее молоко. 
 Украсьте шапочкой взбитых сливок и посыпьте тертым шоколадом.'
);

INSERT INTO ingridients (title, price, description) VALUES
('Зерна кофе',500,'Зерна для кофемашины'),
('Молоко',120,'Безлактозное молоко 1,5% жирности'),
('Вода',20,NULL),
('Сливки',80,'Сливки жирностью 10%');



INSERT INTO toppings (title, price, description) VALUES
('Тертый шоколад',80,'Шведский шоколад'),
('Карамельный сироп',70,NULL),
('Соленый попкорн сироп',70,NULL),
('Ванильный сироп',70,NULL);

INSERT INTO order_coffee (cof_id, ord_id, count_cof) VALUES
(1,2,2),
(2,1,3),
(3,3,2);

INSERT INTO ing_cof (ing_id, cof_id, volume_ing, volume_type) VALUES
(1,2,100,'гр'),
(2,3,20,'мл'),
(3,1,500,'гр'),
(4,1,12,'мл');

INSERT INTO ord_cof_top (top_id, ord_cof_id) VALUES
(1,2),
(2,1),
(3,2),
(4,3);

SELECT * FROM post;
SELECT * FROM employee;
SELECT * FROM "order";
SELECT * FROM coffee;
SELECT * FROM ingridients;
SELECT * FROM toppings;
SELECT * FROM order_coffee;
SELECT * FROM ing_cof;
SELECT * FROM ord_cof_top;




SELECT COUNT(*) FROM employee;


SELECT * FROM employee WHERE ID >= 2;
SELECT * FROM employee WHERE ID = 2;
SELECT * FROM employee WHERE ID <= 2;
SELECT * FROM COFFEE WHERE price > 220;
SELECT * FROM COFFEE WHERE price < 350;
SELECT * FROM COFFEE WHERE price <> 350;
SELECT * FROM COFFEE WHERE price != 220;
SELECT * FROM COFFEE WHERE price = 220;

SELECT AVG(price) FROM toppings;
SELECT (SUM(salary)/COUNT(*)) AS "Средняя зарплата" FROM post;

SELECT MIN(volume) AS "Минимальный объём кофе" FROM coffee;
SELECT MAX(volume) AS "Максимальный объём кофе" FROM coffee;

UPDATE toppings
	SET price = 85
	WHERE id = 1;
 
SELECT * FROM toppings;

UPDATE ingridients
	SET price = 25
	WHERE description IS NULL;
	
SELECT * FROM ingridients;

UPDATE ingridients
	SET price = price + 10
	WHERE description IS NOT NULL;
	
SELECT * FROM ingridients;

SELECT * FROM ingridients
	WHERE title LIKE '_о%';
	
SELECT * FROM employee
	WHERE telephone SIMILAR TO '%6+%';
	
BEGIN;

SELECT * FROM post;

UPDATE post
 SET salary = 45500
 WHERE title = 'Бариста';
 
 SELECT * FROM post;
 
COMMIT;

SELECT * FROM  post
ORDER BY salary ASC;

SELECT * FROM  post
ORDER BY salary DESC;

SELECT * FROM  post;

SELECT * FROM post LIMIT 1;

SELECT * FROM post OFFSET 1;

SELECT * FROM ingridients
LIMIT 2 OFFSET 1;

SELECT DISTINCT registration FROM "order";

SELECT * FROM employee;
SELECT * FROM "order";


SELECT
employee.name, employee.id,"order".status FROM employee
INNER JOIN "order" ON "order".emp_id = employee.id;


SELECT
employee.name, employee.id,"order".status FROM employee
RIGHT JOIN "order" ON "order".emp_id = employee.id;


SELECT
employee.name AS "Имя сотрудника",
employee.id AS "ID сотрудника",
"order".status AS "Статус заказа"
FROM employee LEFT JOIN "order"
ON "order".emp_id = employee.id;

CREATE VIEW emp_ord_view AS
	SELECT
		employee.name AS "Имя сотрудника",
		employee.id AS "ID сотрудника",
		"order".status AS "Статус заказа"
	FROM employee LEFT JOIN "order"
	ON "order".emp_id = employee.id;
	
SELECT * FROM emp_ord_view;

DELETE FROM emp_ord_view
WHERE "Статус заказа" IS NULL;

SELECT * FROM "order"
WHERE price = 820 OR ending IS NULL;

SELECT * FROM "order"
WHERE ending IS NOT NULL AND price > 1000;

SELECT * FROM coffee
WHERE title NOT IN ('Капучино', 'Мокко');

SELECT * FROM coffee
WHERE title IN ('Капучино', 'Мокко');

SELECT * FROM order_coffee;

DELETE FROM order_coffee
WHERE id >1 and count_cof = 2;

SELECT * FROM order_coffee;

SELECT * FROM ord_cof_top;

DELETE FROM ord_cof_top
WHERE top_id = 1 OR ord_cof_id != 2;

SELECT * FROM ord_cof_top;
