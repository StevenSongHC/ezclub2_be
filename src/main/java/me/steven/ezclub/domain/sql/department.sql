CREATE TABLE department(
  id BIGSERIAL PRIMARY KEY NOT NULL ,
  title VARCHAR(225) NOT NULL,
  create_date DATE,
  club_id BIGINT NOT NULL
);
