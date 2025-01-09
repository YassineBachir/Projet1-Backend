CREATE TABLE services (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL
);

INSERT INTO services (name) VALUES ('Seneau'), ('Orange'), ('Senelec'), ('Bank');