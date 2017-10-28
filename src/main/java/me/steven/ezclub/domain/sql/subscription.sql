CREATE TABLE subscription(
  id BIGSERIAL PRIMARY KEY NOT NULL ,
  subscribe_time TIMESTAMP,
  user_id BIGINT NOT NULL,
  club_id BIGINT NOT NULL
);
