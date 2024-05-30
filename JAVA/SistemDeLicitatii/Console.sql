create database if not exists sistem_licitatii;
use sistem_licitatii;

-- Tabelul Utilizator
CREATE TABLE IF NOT EXISTS Utilizator (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nume VARCHAR(255),
       prenume VARCHAR(255),
       email VARCHAR(255),
       adresa VARCHAR(255),
       numar_telefon VARCHAR(20)
);

-- Tabelul Produs
CREATE TABLE IF NOT EXISTS Produs (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nume VARCHAR(255),
       descriere TEXT,
       categorie VARCHAR(50),
       disponibil BOOLEAN,
       pret_pornire DECIMAL(10, 2)
);

-- Tabelul Licitație
CREATE TABLE IF NOT EXISTS Licitație (
       id INT AUTO_INCREMENT PRIMARY KEY,
       descriere TEXT,
       data_inceput DATE,
       data_sfarsit DATE,
       loc_desfasurare VARCHAR(255)
);

-- Tabelul LicitatieOnline
CREATE TABLE IF NOT EXISTS LicitatieOnline (
       id INT AUTO_INCREMENT PRIMARY KEY,
       descriere TEXT,
       data_inceput DATE,
       data_sfarsit DATE,
       platforma_online VARCHAR(255)
);

-- Tabelul Produse_castigate
CREATE TABLE IF NOT EXISTS Produse_castigate (
       utilizator_id INT,
       produs_id INT,
       PRIMARY KEY (utilizator_id, produs_id),
       FOREIGN KEY (utilizator_id) REFERENCES Utilizator(id),
       FOREIGN KEY (produs_id) REFERENCES Produs(id)
);

-- Tabelul Oferta
CREATE TABLE IF NOT EXISTS Oferta (
      id INT AUTO_INCREMENT PRIMARY KEY,
      suma_ofertata DECIMAL(10, 2),
      utilizator_id INT,
      produs_id INT,
      licitatie_id INT,
      FOREIGN KEY (utilizator_id) REFERENCES Utilizator(id),
      FOREIGN KEY (produs_id) REFERENCES Produs(id),
      FOREIGN KEY (licitatie_id) REFERENCES Licitație(id)
);

-- Tabelul licitatii_produse pentru relația many-to-many între licitații și produse
CREATE TABLE IF NOT EXISTS licitatii_produse (
      licitatie_id INT,
      produs_id INT,
      PRIMARY KEY (licitatie_id, produs_id),
      FOREIGN KEY (licitatie_id) REFERENCES Licitație(id),
      FOREIGN KEY (produs_id) REFERENCES Produs(id)
);

-- Tabelul Vânzare
CREATE TABLE IF NOT EXISTS Vanzare (
      id INT AUTO_INCREMENT PRIMARY KEY,
      nume_cumparator VARCHAR(255),
      nume_produs VARCHAR(255),
      pret_final DECIMAL(10, 2)
);






