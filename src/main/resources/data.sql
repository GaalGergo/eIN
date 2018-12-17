INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (100, 'Teszt Tanulo', 'tanulo1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'TANULO');

INSERT INTO felhasznalok (azon, nev, felhasznalo_nev, jelszo, tipus)
VALUES (101, 'Teszt Oktato', 'oktato1', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 'OKTATO');


INSERT INTO tantargyak (azon, nev)
VALUES (100, 'Matematika');

INSERT INTO tantargyak (azon, nev)
VALUES (101, 'Földrajz');

INSERT INTO tantargyak (azon, nev)
VALUES (102, 'Angol Nyelv');

INSERT INTO tantargyak (azon, nev)
VALUES (103, 'Testnevelés');

INSERT INTO jegybeirasok (azon, oktato_azon, tanulo_azon, tantargy_azon, erdemjegy, idopont)
VALUES (100, 101, 100, 101, 4, '2018-12-18T13:33:45');
