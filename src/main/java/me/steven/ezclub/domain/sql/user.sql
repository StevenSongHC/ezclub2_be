CREATE SEQUENCE user_id_seq
  START 100000
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE "user"(
  id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('user_id_seq'),
  name VARCHAR(25) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  portrait VARCHAR(500),
  gender INTEGER,
  birth_date DATE,
  join_date DATE,
  last_login TIMESTAMP,
  from_city_id INTEGER,
  college_id INTEGER,
  status INTEGER,
  CONSTRAINT user_id_unique UNIQUE (id),
  CONSTRAINT user_name_unique UNIQUE (name),
  CONSTRAINT user_email_unique UNIQUE (email)
);
