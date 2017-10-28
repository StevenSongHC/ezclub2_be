CREATE TABLE content(
  id BIGSERIAL PRIMARY KEY NOT NULL ,
  type INTEGER NOT NULL,
  content TEXT NOT NULL,
  submit_time TIMESTAMP,
  "order" INTEGER,
  activity_id BIGINT NOT NULL,
  submitter_id BIGINT NOT NULL
);
