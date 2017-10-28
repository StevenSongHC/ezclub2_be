CREATE TABLE club_member(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  nickname VARCHAR(225) NOT NULL,
  realname VARCHAR(225),
  contact VARCHAR(255),
  join_date DATE,
  user_id BIGINT NOT NULL,
  department_id BIGINT NOT NULL,
  class_id BIGINT NOT NULL
);
