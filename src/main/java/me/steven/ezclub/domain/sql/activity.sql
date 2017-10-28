CREATE SEQUENCE activity_id_seq
  START 1000000
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE activity(
  id BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('activity_id_seq'),
  title VARCHAR(225) NOT NULL,
  summary VARCHAR(225),
  update_date DATE,
  is_finished BOOLEAN,
  club_id BIGINT,
  CONSTRAINT activity_id_unique UNIQUE (id)
);
