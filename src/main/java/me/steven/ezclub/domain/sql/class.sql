CREATE TABLE class(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  year INTEGER NOT NULL,
  group_photo VARCHAR(225),
  freshman_photo VARCHAR(225),
  club_id BIGINT NOT NULL
);
