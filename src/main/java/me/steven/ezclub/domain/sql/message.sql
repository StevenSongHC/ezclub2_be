CREATE TABLE message(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  content VARCHAR(2048) NOT NULL,
  is_read BOOLEAN,
  sent_time TIMESTAMP,
  sender_id BIGINT NOT NULL,
  addressee_id BIGINT NOT NULL
);
