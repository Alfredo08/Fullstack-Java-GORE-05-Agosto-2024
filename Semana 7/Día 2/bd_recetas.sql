-- Query para insertar un registro a una tabla
INSERT INTO usuarios (nombre, apellido, email, password)
VALUES ('Roger', 'Infante', 'roger@infante.com', 'password123');

INSERT INTO usuarios (nombre, apellido, email, password)
VALUES ('Martha', 'Gómez', 'martha@gomez.com', 'password123'),
	   ('Julieta', 'Vargas', 'julieta@vargas.com', 'password123'),
       ('Roger', 'Infante', 'roger@infante.com', 'password123'),
       ('Alan', 'Morales', 'alan@morales.com', 'password123'),
       ('Julieta', 'Salazar', 'julieta@salazar.com', 'password123');
       
-- Query para proyectar el contenido de una tabla       
SELECT *
FROM usuarios;

SELECT nombre AS 'Nombre', apellido AS 'Apellido', email AS 'Correo'
FROM usuarios
WHERE nombre = 'Julieta';

-- Query para actualizar el contenido de un registro en una tabla
UPDATE usuarios
SET nombre = 'Miguel', apellido = 'López', email = 'miguel@lopez.com', password = 'secreto123'
WHERE id = 4;

-- Query para remover el contenido en una tabla
DELETE FROM usuarios
WHERE id = 7;