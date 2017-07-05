DROP TABLE IF EXISTS parts;

CREATE TABLE parts (
  ID             BIGSERIAL NOT NULL PRIMARY KEY,
  NAME           TEXT      NOT NULL,
  PRICE          DECIMAL   NOT NULL,
  CATALOG_NUMBER DECIMAL   NOT NULL
);

INSERT INTO parts (NAME, PRICE, CATALOG_NUMBER) VALUES ('uszczelka', 10, 25130);
INSERT INTO parts (NAME, PRICE, CATALOG_NUMBER) VALUES ('klocki hamulcowe', 100, 235784);
INSERT INTO parts (NAME, PRICE, CATALOG_NUMBER) VALUES ('tarcza hamulcowa', 150, 16488);
INSERT INTO parts (NAME, PRICE, CATALOG_NUMBER) VALUES ('olej hamulcowy', 1500, 32085);

CREATE TABLE customer (
  ID          BIGSERIAL NOT NULL PRIMARY KEY,
  NAME        TEXT      NOT NULL,
  phoneNumber TEXT      NOT NULL,
  NIP_PESEL   DECIMAL   NOT NULL
);
INSERT INTO customer (NAME, phoneNumber, NIP_PESEL) VALUES ('Marian', 10324212, 25130);
INSERT INTO customer (NAME, phoneNumber, NIP_PESEL) VALUES ('Firma Krzak', 1032423512, 25153530);
INSERT INTO customer (NAME, phoneNumber, NIP_PESEL) VALUES ('Bolo', 10324213432, 25155630);
INSERT INTO customer (NAME, phoneNumber, NIP_PESEL) VALUES ('Zenek', 10342422412, 2512424230);

CREATE TABLE Emploee (
  ID             BIGSERIAL NOT NULL PRIMARY KEY,
  NAME           TEXT      NOT NULL,
  phoneNumber    TEXT      NOT NULL,
  NIP_PESEL      DECIMAL   NOT NULL,
  positionWorker TEXT      NOT NULL
);

INSERT INTO Emploee (NAME, phoneNumber, NIP_PESEL, positionWorker) VALUES ('Janusz', 1032584212, 25178930, 'Majster');
INSERT INTO Emploee (NAME, phoneNumber, NIP_PESEL, positionWorker) VALUES ('Henio', 1032424512, 25198730, 'Mechanik');
INSERT INTO Emploee (NAME, phoneNumber, NIP_PESEL, positionWorker) VALUES ('Marian', 10324212, 25130, 'Blacharz');

CREATE TABLE order (
  ID           BIGSERIAL NOT NULL PRIMARY KEY,
  nameOfOrder  TEXT      NOT NULL,
  priceOfOrder DECIMAL   NOT NULL,
  timeOfWork   TEXT      NOT NULL
);

INSERT INTO order (nameOfOrder, priceOfOrder, timeOfWork) VALUES ('naprawa', 103, '2h');
INSERT INTO order (nameOfOrder, priceOfOrder, timeOfWork) VALUES ('naprawa', 1023, '4h');
INSERT INTO order (nameOfOrder, priceOfOrder, timeOfWork) VALUES ('naprawa', 303, '2h 45min');

