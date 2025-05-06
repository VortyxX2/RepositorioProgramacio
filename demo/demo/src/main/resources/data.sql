-- 🎟️ Membresías
INSERT INTO membresia (id, tipo, precio, acceso) VALUES
                                                     (1, 'BASICA', 20.0, 'Acceso por la mañana'),
                                                     (2, 'PREMIUM', 35.0, 'Acceso todo el día'),
                                                     (3, 'VIP', 50.0, 'Acceso completo + entrenador personal');

-- 🧑‍🦰 Personas
INSERT INTO persona (id, nombre, apellido1, apellido2, edad, dni, email, sexo)
VALUES
    (1, 'Lucía', 'Gómez', 'Pérez', 25, '12345678A', 'lucia@gym.com', 'FEMENINO'),
    (2, 'Carlos', 'Martínez', 'López', 32, '87654321B', 'carlos@gym.com', 'MASCULINO'),
    (3, 'Ana', 'Sánchez', 'Ruiz', 29, '11223344C', 'ana@gym.com', 'FEMENINO'),
    (4, 'David', 'Jiménez', 'Torres', 35, '44332211D', 'david@gym.com', 'MASCULINO'),
    (5, 'Laura', 'Ramírez', 'González', 22, '56473829E', 'laura@gym.com', 'FEMENINO'),
    (6, 'Jorge', 'Hernández', 'Luna', 28, '18273645F', 'jorge@gym.com', 'MASCULINO'),
    (7, 'María', 'Pérez', 'Vázquez', 30, '92837465G', 'maria@gym.com', 'FEMENINO'),
    (8, 'Tomás', 'Ruiz', 'Méndez', 27, '38475629H', 'tomas@gym.com', 'MASCULINO');

-- 🧑‍💼 Empleados (referencian a Persona)
INSERT INTO empleado (id, puesto, salario)
VALUES
    (1, 'MONITOR', 1800.00),  -- Ana (id 3)
    (2, 'RECEPCIONISTA', 1200.00),  -- David (id 4)
    (3, 'LIMPIEZA', 2500.00),  -- Lucía (id 1)
    (4, 'MONITOR', 1900.00),  -- Jorge (id 6)
    (5, 'RECEPCIONISTA', 1300.00),  -- Laura (id 5)
    (6, 'MONITOR', 2800.00);  -- Tomás (id 8)

-- 👥 Clientes (referencian a Persona y Membresía)
INSERT INTO cliente (id, membresia_id)
VALUES
    (1, 1),  -- Lucía → BÁSICA
    (2, 3),  -- Carlos → VIP
    (3, 2),  -- Ana → PREMIUM
    (4, 1),  -- David → BÁSICA
    (5, 3),  -- Laura → VIP
    (6, 2),  -- Jorge → PREMIUM
    (7, 1),  -- María → BÁSICA
    (8, 2);  -- Tomás → PREMIUM

-- Inserción de clases guiadas
INSERT INTO clase_guiada (id, nombre, duracion, monitor_id, sala)
VALUES
    (1, 'Yoga', 60, 3, 1),    -- Monitor: Ana (id 3), Sala: 1
    (2, 'Body Pump', 45, 3, 2), -- Monitor: Ana (id 3), Sala: 2
    (3, 'Spinning', 50, 3, 3),  -- Monitor: Ana (id 3), Sala: 3
    (4, 'Pilates', 60, 4, 4),    -- Monitor: Jorge (id 4), Sala: 4
    (5, 'HIIT', 30, 6, 5),      -- Monitor: Tomás (id 6), Sala: 5
    (6, 'Zumba', 45, 4, 6);      -- Monitor: Jorge (id 4), Sala: 6

-- Inserción de horarios de clases guiadas
INSERT INTO horario (id, dia_Semana, hora_Apertura, hora_Cierre, clase_guiada_id)
VALUES
    (1, 'LUNES', '08:00:00', '09:00:00', 1),   -- Yoga
    (2, 'MIÉRCOLES', '08:00:00', '09:00:00', 1),   -- Yoga

    (3, 'MARTES', '10:00:00', '10:45:00', 2),  -- Body Pump
    (4, 'JUEVES', '10:00:00', '10:45:00', 2),  -- Body Pump

    (5, 'LUNES', '17:00:00', '17:50:00', 3),   -- Spinning
    (6, 'VIERNES', '17:00:00', '17:50:00', 3), -- Spinning

    (7, 'MARTES', '12:00:00', '13:00:00', 4),  -- Pilates
    (8, 'JUEVES', '12:00:00', '13:00:00', 4),  -- Pilates

    (9, 'MIÉRCOLES', '18:00:00', '18:30:00', 5), -- HIIT
    (10, 'VIERNES', '18:00:00', '18:30:00', 5),  -- HIIT

    (11, 'SÁBADO', '11:00:00', '11:45:00', 6),  -- Zumba
    (12, 'DOMINGO', '11:00:00', '11:45:00', 6); -- Zumba
INSERT INTO Objetos (id, nombre, peso, cantidad, fecha_compra)
VALUES
    (1, 'Mancuerna 5kg', 5.0, 20, '2023-01-10'),
    (2, 'Esterilla', 1.2, 30, '2022-09-20'),
    (3, 'Bicicleta estática', 25.0, 10, '2021-06-15'),
    (4, 'Banco de pesas', 30.0, 5, '2021-08-05'),
    (5, 'Barra olímpica', 20.0, 10, '2022-03-12'),
    (6, 'Disco 10kg', 10.0, 20, '2022-03-12'),
    (7, 'Disco 5kg', 5.0, 20, '2022-03-12'),
    (8, 'TRX', 1.5, 20, '2022-05-20'),
    (9, 'Cinta de correr', 80.0, 10, '2020-12-15'),
    (10, 'Elíptica', 70.0, 10, '2021-01-22'),
    (11, 'Máquina de remo', 45.0, 4, '2021-04-18'),
    (12, 'Prensa de piernas', 150.0, 2, '2020-11-05'),
    (13, 'Mancuerna 10kg', 10.0, 8, '2023-01-10'),
    (14, 'Balón medicinal 5kg', 5.0, 2, '2022-07-14'),
    (15, 'Step', 3.0, 4, '2022-08-28'),
    (16, 'Polea alta', 120.0, 4, '2020-10-30'),
    (17, 'Polea baja', 110.0, 6, '2020-10-30'),
    (18, 'Kettlebell 8kg', 8.0, 8, '2022-04-05'),
    (19, 'Kettlebell 12kg', 12.0, 8, '2022-04-05'),
    (20, 'Esterilla yoga antideslizante', 1.5, 5, '2022-12-10');

-- 🔧 Material (hereda de Objeto)
INSERT INTO Material (id)
VALUES
    (1), -- Mancuerna 5kg
    (2), -- Esterilla
    (4), -- Mancuerna 10kg
    (5); -- Cuerda para saltar

-- 🏋️‍♀️ Máquinas (hereda de Objeto)
INSERT INTO Maquinas (id)
VALUES
    (3), -- Bicicleta estática
    (6), -- Máquina de remo
    (8); -- Bicicleta elíptica
