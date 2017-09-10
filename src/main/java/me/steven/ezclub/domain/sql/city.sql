CREATE SEQUENCE city_id_seq
  START 520
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE city(
  id INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('city_id_seq'),
  cn_name VARCHAR(25) NOT NULL,
  en_name VARCHAR(255) NOT NULL,
  province_id VARCHAR(2) NOT NULL,
  CONSTRAINT city_id_unique UNIQUE (id),
  CONSTRAINT city_cn_name_unique UNIQUE (cn_name)
);


INSERT INTO city(cn_name, en_name, province_id) VALUES ('广州', 'Guangzhou', 'GD');
INSERT INTO city(cn_name, en_name, province_id) VALUES ('深圳', 'Shenzhen', 'GD');
INSERT INTO city(cn_name, en_name, province_id) VALUES ('海口', 'Haikou', 'HI');
