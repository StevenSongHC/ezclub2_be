CREATE SEQUENCE college_id_seq
  START 10000
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE college(
  id INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('college_id_seq'),
  primary_name VARCHAR(255) NOT NULL,
  secondary_name VARCHAR(255),
  intro Text,
  emblem VARCHAR(500),
  create_date DATE,
  status INTEGER,
  city_id BIGINT,
  CONSTRAINT college_id_unique UNIQUE (id),
  CONSTRAINT college_primary_name_unique UNIQUE (primary_name)
);
