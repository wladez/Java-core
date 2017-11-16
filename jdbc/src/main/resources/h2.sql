CREATE TABLE IF NOT EXISTS Student (
  id         INT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name  VARCHAR(255),
  dob        DATE,
  telephone  VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS Temp(
  id        INT PRIMARY KEY AUTO_INCREMENT,
  name      VARCHAR(255) NOT NULL
);

INSERT INTO Student (first_name, last_name, dob, telephone)
VALUES ('Ivan', 'Ivanov', '1994-01-01', '+79214657881');

INSERT INTO Student (first_name, last_name, dob, telephone)
VALUES ('Petr', 'Petrov', '1994-01-10', '+79214638881');

INSERT INTO Student (first_name, last_name, dob, telephone)
VALUES ('Igor', 'Igorev', '1994-03-01', '+79114957881');

INSERT INTO Temp (name) VALUES ('abc');