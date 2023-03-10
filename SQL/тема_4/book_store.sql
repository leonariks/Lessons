--CREATE DATABASE book_store;

CREATE TABLE IF NOT EXISTS post
(
	id serial NOT NULL PRIMARY KEY,
	title varchar(50) NOT NULL,
	salary numeric(10,2) NOT NULL
);

--DROP TABLE post;

ALTER TABLE post
ADD description text NOT NULL;

ALTER TABLE post 
DROP COLUMN description;

ALTER TABLE post
ALTER COLUMN description TYPE varchar(100);

ALTER TABLE post 
RENAME COLUMN work_desc TO description;

ALTER TABLE work_post
RENAME TO post;


ALTER TABLE post
ADD description text NULL;

ALTER TABLE post
ALTER COLUMN description SET NOT NULL;

ALTER TABLE post
ALTER COLUMN description DROP NOT NULL;



INSERT INTO post
VALUES 
(1,'Менеджер',60000.00,'Руководит командой и процессом');

SELECT * FROM post;

DELETE FROM post;

INSERT INTO post (title, description, salary)
VALUES
('Продавец','Стоит на кассе', 50000.00);

INSERT INTO post (title, salary, description)
VALUES
('Кладовщик', 55000.00,'Переносит товар'),
('Директор',100000.00,'Руководит магазином');

UPDATE post
SET description = 'Здесь должно быть'

UPDATE post
SET salary = 65500
WHERE title = 'Менеджер';

UPDATE post
SET description = 'Руководит магазином'
WHERE id = 4;

SELECT * FROM post;

UPDATE post
SET description = 'Руководит командой и процессом'
WHERE id = 1;

UPDATE post
SET salary = 60000.00
WHERE id = 3;

SELECT * FROM post;

SELECT * FROM post
WHERE description ='Здесь должно быть';

SELECT * FROM post
WHERE id = 8;

SELECT * FROM post
WHERE salary <= 65000;

SELECT * FROM post
WHERE salary <> 60000;

SELECT * FROM post
WHERE title <> 'Директор';

SELECT * FROM post
WHERE description IS NOT NULL;

SELECT * FROM post
WHERE description IS NULL;

UPDATE post
SET description = NULL
WHERE id = 3;

SELECT * FROM post
WHERE salary > 55000 AND description IS NOT NULL;

SELECT * FROM post;

SELECT * FROM post
WHERE id = 2 or salary > 66000;

SELECT * FROM post
WHERE (id = 1 AND description IS NOT NULL) OR salary <= 50000;


CREATE TABLE IF NOT EXISTS employee
(
	id serial NOT NULL PRIMARY KEY,
	firstname varchar(50) NOT NULL,
	name varchar(50) NOT NULL,
	patronymic varchar(50) NOT NULL,
	datebirth date NOT NULL,
	telephone varchar(18) NOT NULL,
	post_id integer NOT NULL REFERENCES post(id)
	
	--post_id integer NOT NULL,
	--FOREIGN KEY (post_id) REFERENCES post(id)
)

DROP TABLE employee;

CREATE TABLE IF NOT EXISTS passport
(
	id integer NOT NULL PRIMARY KEY REFERENCES employee (id),
	seria char(4) NOT NULL,
	number char(6) NOT NULL,
	who_issued varchar(150) NOT NULL,
	when_issued date NOT NULL,
	registration varchar(150) NOT NULL
	
	--employee_id integer NOT NULL,
	--FOREIGN KEY (employee_id) REFERENCES employee (id)
	--UNIQUE (employee_id)
)


CREATE TABLE IF NOT EXISTS "order" 
(
	id serial NOT NULL PRIMARY KEY,
	registration_date date NOT NULL,
	price numeric(10,2) NOT NULL
)

CREATE TABLE IF NOT EXISTS order_employee
(
	order_id integer NOT NULL REFERENCES "order"(id),
	employee_id integer NOT NULL REFERENCES employee(id),
	
	UNIQUE(order_id, employee_id)
)


INSERT INTO "order" (registration_date, price) VALUES
('2022-09-18', 1000),
('2022-09-27', 20000),
('2022-10-01', 8700);

SELECT * FROM "order";

INSERT INTO employee (firstname,name, patronymic,datebirth,telephone,post_id) VALUES
	('Захаренко','Иван','Дмитриевич','1989-04-28','+7(999)888-77-66',3),
	('Миронова','Дарья','Сергеевна','1992-11-11','+7(842)991-01-42',4),
	('Ретув','Илья','Никитьевич','1990-08-01','+7(813)129-83-01',2);
	
SELECT * FROM employee;

INSERT INTO passport VALUES
	(1,'8234','182393','ГУ МВД РОССИИ','2009-05-15','ул.Ленина, д.12'),
	(2,'1024','934561','ГУ МВД РОССИИ','2010-08-28','Новомосковский пер., д.2');

SELECT * FROM passport;


INSERT INTO order_employee (order_id, employee_id) VALUES
(1,2),
(2,2),
(2,1),
(3,3),
(3,1);
SELECT * FROM order_employee;

INSERT INTO order_employee (order_id, employee_id) VALUES
(3,3);

SELECT * FROM employee,post;

SELECT 
	employee.firstname,
	employee.name,
	employee.telephone,
	post.title 
FROM employee INNER JOIN post 
	ON employee.post_id = post.id;
	
SELECT 
	employee.firstname,
	employee.name,
	employee.telephone,
	post.title 
FROM employee LEFT JOIN post 
	ON employee.post_id = post.id;
	
SELECT
	emp.firstname AS "Фамилия",
	pas.seria AS "Серия паспорта",
	pas.number AS "номер паспорта"
FROM employee emp LEFT JOIN passport pas
	ON emp.id = pas.id;
	
SELECT 
	o.registration_date AS "Дата оформления заказа",
	o.price AS "Цена",
	e.firstname AS "Фамилия сотрудника",
	e.name AS "Имя сотрудника",
FROM order_employee oe 
INNER JOIN employee e
	ON oe.employee_id = e.id
INNER JOIN "order" o
	ON oe.order_id = o.id;
	
SELECT * FROM order_employee;
	
CREATE OR REPLACE VIEW order_employee_view AS
SELECT 
	o.registration_date AS "Дата оформления заказа",
	o.price AS "Цена",
	e.firstname AS "Фамилия сотрудника",
	e.name AS "Имя сотрудника"
FROM order_employee oe 
INNER JOIN employee e
	ON oe.employee_id = e.id
INNER JOIN "order" o
	ON oe.order_id = o.id;
	
SELECT * FROM order_employee_view;
	
DROP VIEW order_employee_view;


SELECT COUNT (*) FROM employee;

SELECT * FROM employee;

SELECT COUNT (*) FROM employee WHERE post_id >= 3;

SELECT * FROM "order";

SELECT AVG(price) FROM "order";

SELECT SUM(price) FROM "order";

SELECT (SUM(price)/COUNT(*)) FROM ;

SELECT MIN(price) FROM "order";

SELECT MAX(price) FROM "order"; 

SELECT * FROM employee;

SELECT * FROM employee 
WHERE name LIKE 'Ива_';

SELECT * FROM employee 
WHERE name LIKE 'И___';

SELECT * FROM employee 
WHERE name LIKE 'И%';

SELECT * FROM employee 
WHERE name LIKE '%а__%';

SELECT * FROM employee
WHERE telephone LIKE '%0%';

SELECT * FROM employee
WHERE telephone SIMILAR TO '%0%';

SELECT * FROM employee
WHERE telephone SIMILAR TO '%9+%';

SELECT * FROM employee
WHERE telephone SIMILAR TO '%9{2}%';

SELECT * FROM employee
WHERE telephone SIMILAR TO '%(9{3}|42+)%';

ALTER TABLE employee
ADD CHECK (telephone SIMILAR TO '\+7\([0-9][0-9][0-9]\)[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]');

SELECT * FROM employee;

INSERT INTO employee (firstname, name, patronymic, datebirth, telephone, post_id) VALUES
('Петров', 'Пётор', 'Петрович', '1999-02-08', '+7(921)653-20-17', 3);

SELECT * FROM "order"
WHERE price > (SELECT AVG(price) FROM "order");

INSERT INTO "order"(registration_date, price) VALUES
('2022-09-27', (SELECT AVG(price) FROM "order"));

SELECT * FROM "order"
ORDER BY price ASC;

SELECT * FROM "order"
ORDER BY price DESC;

SELECT * FROM "order"
ORDER BY registration_date, price;

SELECT * FROM "order" LIMIT 2;

SELECT * FROM "order" OFFSET 2;

SELECT * FROM "order" LIMIT 2 OFFSET 1;


SELECT DISTINCT registration_date, price FROM "order";

SELECT 
	(COUNT(*) - (SELECT COUNT (DISTINCT registration_date) FROM "order")) 
		AS "Кол-во повтор знач из столба registration_date" FROM "order";

SELECT registration_date, SUM(price) FROM "order"
GROUP BY registration_date;

SELECT registration_date, COUNT(id) FROM "order"
GROUP BY registration_date;

BEGIN;

SELECT * FROM "order";

UPDATE "order"
	SET price = price - 3000
	WHERE id = 3;

SAVEPOINT my_savepoint;

UPDATE "order"
	SET price = price + 3000
	WHERE id =1;
	
ROLLBACK TO my_savepoint;

ROLLBACK;
COMMIT;



CREATE TABLE IF NOT EXISTS rectangle 
(
	id serial NOT NULL PRIMARY KEY,
	property text[],
	points integer[][]
)

INSERT INTO rectangle (property, points) VALUES
(
	'{"Красный","Толстые границы","Синяя заливка"}',
	'{{0,0},{0,1},{1,1},{1,0}}'
)

SELECT * FROM rectangle;
