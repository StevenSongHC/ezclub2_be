CREATE TABLE college_album(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  path VARCHAR(500),
  describe TEXT,
  upload_date DATE,
  college_id BIGINT NOT NULL
);
