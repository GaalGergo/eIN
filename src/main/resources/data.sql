INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (100, 'Teszt Tanulo', 'tanulo1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'TANULO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (101, 'Teszt Tanulo 2', 'tanulo2', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'TANULO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (102, 'Teszt Oktato', 'oktato1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'OKTATO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (103, 'Teszt Oktato 2', 'oktato2', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'OKTATO');


INSERT INTO tantargyak (azon, nev)
VALUES (100, 'Matematika');

INSERT INTO tantargyak (azon, nev)
VALUES (101, 'Földrajz');

INSERT INTO tantargyak (azon, nev)
VALUES (102, 'Angol Nyelv');

INSERT INTO tantargyak (azon, nev)
VALUES (103, 'Testnevelés');



INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (100, 102, 100, 101, 4, '2018-12-18T13:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (101, 102, 100, 100, 3, '2018-12-18T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (102, 103, 100, 103, 2, '2018-12-13T14:35:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (103, 103, 100, 100, 4, '2018-11-18T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (104, 103, 101, 101, 3, '2018-12-20T14:33:45');
