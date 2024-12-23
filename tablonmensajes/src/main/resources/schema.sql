-- Modelo de datos para TablonMensajes

-- Tabla: TB_USUARIOS
CREATE TABLE TB_USUARIOS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    uuid VARCHAR(12) NOT NULL UNIQUE,
    username VARCHAR(50) NOT NULL UNIQUE,
    gmail VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    rol VARCHAR(50) NOT NULL
);

-- Tabla: TB_POSTS
CREATE TABLE TB_POSTS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    uuid VARCHAR(18) NOT NULL UNIQUE,
    titulo VARCHAR(100) NOT NULL,
    contenido TEXT NOT NULL,
    fecha_publicacion DATETIME NOT NULL,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_posts_usuarios FOREIGN KEY (usuario_id) REFERENCES TB_USUARIOS(id)
);

-- Tabla: TB_MENSAJES
CREATE TABLE TB_MENSAJES (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    uuid VARCHAR(18) NOT NULL UNIQUE,
    contenido VARCHAR(200) NOT NULL,
    fecha_publicacion DATETIME NOT NULL,
    post_id INT NOT NULL,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_mensajes_posts FOREIGN KEY (post_id) REFERENCES TB_POSTS(id),
    CONSTRAINT fk_mensajes_usuarios FOREIGN KEY (usuario_id) REFERENCES TB_USUARIOS(id)
);

-- Tabla: TB_CATEGORIAS
CREATE TABLE TB_CATEGORIAS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

-- Tabla: TB_POST_CATEGORIAS (relación muchos a muchos entre posts y categorias)
CREATE TABLE TB_POST_CATEGORIAS (
    post_id BIGINT NOT NULL,
    categoria_id INT NOT NULL,
    CONSTRAINT fk_postcategorias_posts FOREIGN KEY (post_id) REFERENCES TB_POSTS(id),
    CONSTRAINT fk_postcategorias_categorias FOREIGN KEY (categoria_id) REFERENCES TB_CATEGORIAS(id),
    PRIMARY KEY (post_id, categoria_id)
);