CREATE SEQUENCE club_id_seq
  START 10000
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE club(
  id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('club_id_seq'),
  name VARCHAR(225) NOT NULL,
  profile_name VARCHAR(255) NOT NULL,
  slogan TEXT,
  logo VARCHAR(500),
  create_date DATE,
  status INTEGER,
  creator_cmid BIGINT,
  president_cmid BIGINT,
  CONSTRAINT club_id_unique UNIQUE (id),
  CONSTRAINT club_name_unique UNIQUE (name),
  CONSTRAINT club_profile_name_unique UNIQUE (profile_name)
);
