CREATE TABLE comment(
  id BIGSERIAL PRIMARY KEY NOT NULL ,
  content VARCHAR(2048) NOT NULL,
  submit_time TIMESTAMP,
  status INTEGER,
  user_id BIGINT NOT NULL,
  activity_id BIGINT NOT NULL
);
