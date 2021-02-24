CREATE TABLE "user" (
                id UUID,
                username VARCHAR(20) NOT NULL,
                email_address VARCHAR(255) NOT NULL,
                first_name VARCHAR(20) NOT NULL,
                middle_name VARCHAR(30),
                last_name VARCHAR(20) NOT NULL,
                CONSTRAINT id_username_email_address_PK
                PRIMARY KEY (id, username, email_address)
            );

CREATE TABLE "tweets" (
                id UUID PRIMARY KEY,
                content VARCHAR(255),
                timestamp TIMESTAMP,
                username VARCHAR (20) NOT NULL
            );

