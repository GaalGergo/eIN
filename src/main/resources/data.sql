INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (100, 'Teszt Tanulo', 'tanulo1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'TANULO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (101, 'Teszt Tanulo 2', 'tanulo2', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'TANULO');



INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (200, 'Teszt Oktato', 'oktato1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'OKTATO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (201, 'Teszt Oktato 2', 'oktato2', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'OKTATO');


INSERT INTO tantargyak (azon, nev)
VALUES (300, 'Matematika');

INSERT INTO tantargyak (azon, nev)
VALUES (301, 'Földrajz');

INSERT INTO tantargyak (azon, nev)
VALUES (302, 'Angol Nyelv');

INSERT INTO tantargyak (azon, nev)
VALUES (303, 'Testnevelés');



INSERT INTO tanorak (azon, oktato_azon, tantargy_azon, osztaly, tanterem, idopont)
VALUES (400, 200, 300, '12C', 'A101', '2018-10-12T11:00:00');

INSERT INTO tanorak (azon, oktato_azon, tantargy_azon, osztaly, tanterem, idopont)
VALUES (401, 201, 300, '10A', 'A203', '2018-10-12T13:00:00');

INSERT INTO tanorak (azon, oktato_azon, tantargy_azon, osztaly, tanterem, idopont)
VALUES (402, 201, 301, '9B', 'A102', '2019-01-12T09:00:00');


INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (500, 200, 100, 301, 4, '2018-12-18T13:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (501, 200, 100, 300, 3, '2018-12-18T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (502, 201, 101, 303, 2, '2018-12-13T14:35:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (503, 201, 100, 300, 4, '2018-11-18T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (504, 201, 101, 301, 3, '2018-12-20T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (505, 200, 101, 303, 2, '2018-11-18T14:33:45');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (506, 201, 101, 303, 1, '2018-12-20T14:33:45');
