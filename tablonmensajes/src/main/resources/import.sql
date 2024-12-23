-- Datos iniciales para TablonMensajes

-- Usuarios
INSERT INTO TB_USUARIOS (uuid, username, gmail, password, rol) VALUES
('a1b2c3d4e5f6', 'sabrina', 'sabrina@gmail.com', 'pass1234', 'user'),
('b2c3d4e5f6a1', 'angel', 'angel@gmail.com', 'pass1234', 'user'),
('c3d4e5f6a1b2', 'yeray', 'yeray@gmail.com', 'pass1234', 'user'),
('d4e5f6a1b2c3', 'santi', 'santi@gmail.com', 'pass1234', 'user'),
('e5f6a1b2c3d4', 'maria', 'maria@gmail.com', 'pass1234', 'user'),
('f6a1b2c3d4e5', 'lucas', 'lucas@gmail.com', 'pass1234', 'admin');

-- Categorías
INSERT INTO TB_CATEGORIAS (nombre) VALUES
('Doméstico'),
('Jardín'),
('Iluminación'),
('Finanzas');

-- Posts
INSERT INTO TB_POSTS (uuid, titulo, contenido, fecha_publicacion, usuario_id) VALUES
('1a2b3c4d5e6f', 'Cómo mantener tu hogar limpio', '1. Limpia diariamente las superficies principales, como mesas y encimeras, para evitar acumulaciones. 2. Dedica 15 minutos diarios a recoger los objetos fuera de lugar. 3. Usa productos de limpieza ecológicos para proteger tu hogar y el medio ambiente. 4. Implementa un sistema de organización: etiquetas y contenedores pueden ser muy útiles. 5. Lava los trapos y utensilios de limpieza con frecuencia para evitar malos olores y bacterias.', '2024-12-23 10:00:00', 1),
('2b3c4d5e6f1a', 'Mejorando tu jardín', 'Riega tus plantas temprano en la mañana, usa compost natural y crea espacios con plantas de bajo mantenimiento para un jardín espectacular.', '2024-12-22 09:30:00', 2),
('3c4d5e6f1a2b', 'Iluminación para interiores', '1. Usa espejos estratégicamente para reflejar la luz natural y expandirla por las habitaciones. 2. Opta por bombillas de luz cálida para ambientes relajantes o luz blanca para espacios de trabajo. 3. Instala reguladores de intensidad (dimmers) para ajustar la luz según el momento del día. 4. Aprovecha lámparas de pie y de mesa para crear puntos de luz acogedores. 5. Evita bloquear ventanas con muebles y utiliza cortinas ligeras para maximizar la entrada de luz.', '2024-12-21 15:45:00', 3),
('4d5e6f1a2b3c', 'Consejos financieros', '1. Elabora un presupuesto mensual para tener claro en qué gastas. 2. Establece un fondo de emergencia con al menos tres meses de tus gastos fijos. 3. Automatiza tus ahorros para garantizar que siempre apartes una cantidad fija. 4. Reduce gastos innecesarios revisando suscripciones o servicios que no uses. 5. Considera invertir en instrumentos financieros básicos para generar rendimientos a largo plazo.', '2024-12-20 12:00:00', 4);

-- Relación Posts-Categorías
INSERT INTO TB_POST_CATEGORIAS (post_id, categoria_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);

-- Mensajes
INSERT INTO TB_MENSAJES (uuid, contenido, fecha_publicacion, post_id, usuario_id) VALUES
('5e6f1a2b3c4d', 'Muy útil, gracias.', '2024-12-23 11:00:00', 1, 2),
('6f1a2b3c4d5e', 'Me encantó la idea.', '2024-12-22 10:00:00', 2, 3),
('1a2b3c4d5e6f', 'Gran aporte, gracias.', '2024-12-21 16:00:00', 3, 4);
