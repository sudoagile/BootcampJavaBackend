-- Creación de la tabla Autores
CREATE TABLE IF NOT EXISTS Autores (
    Autor_ID INT PRIMARY KEY,
    Nombre VARCHAR(100)
);

-- Creación de la tabla Categorías
CREATE TABLE IF NOT EXISTS Categorias (
    Categoria_ID INT PRIMARY KEY,
    Nombre VARCHAR(100)
);

-- Creación de la tabla Libros
CREATE TABLE IF NOT EXISTS Libros (
    ISBN VARCHAR(20) PRIMARY KEY,
    Título VARCHAR(200)
);

-- Creación de la tabla Lectores
CREATE TABLE IF NOT EXISTS Lectores (
    Lector_ID SERIAL PRIMARY KEY,
    Nombre VARCHAR(100)
);

-- Creación de la tabla Prestamos
CREATE TABLE IF NOT EXISTS Prestamos (
    Prestamo_ID SERIAL PRIMARY KEY,
    Fecha_Prestamo DATE,
    Fecha_Devolucion_Esperada DATE,
    ISBN VARCHAR(20),
    Lector_ID INT,
    FOREIGN KEY (ISBN) REFERENCES Libros(ISBN),
    FOREIGN KEY (Lector_ID) REFERENCES Lectores(Lector_ID)
);

-- Creación de la tabla intermedia Autores_Libros
CREATE TABLE IF NOT EXISTS Autores_Libros (
    Autor_ID INT,
    ISBN VARCHAR(20),
    FOREIGN KEY (Autor_ID) REFERENCES Autores(Autor_ID),
    FOREIGN KEY (ISBN) REFERENCES Libros(ISBN),
    PRIMARY KEY (Autor_ID, ISBN)
);

-- Creación de la tabla intermedia Libros_Categorias
CREATE TABLE IF NOT EXISTS Libros_Categorias (
    ISBN VARCHAR(20),
    Categoria_ID INT,
    FOREIGN KEY (ISBN) REFERENCES Libros(ISBN),
    FOREIGN KEY (Categoria_ID) REFERENCES Categorias(Categoria_ID),
    PRIMARY KEY (ISBN, Categoria_ID)
);
