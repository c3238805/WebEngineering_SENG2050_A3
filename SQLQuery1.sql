Use itservices
Go
---------------------------------------------------
-- Create a user for JDBC 
CREATE LOGIN jdbcUser
WITH PASSWORD = 'mySecur3Passw0rd!';

CREATE USER jdbcUser
FOR LOGIN jdbcUser;

GRANT SELECT, INSERT, UPDATE, DELETE
TO jdbcUser;


---------------------------------------------------
-- Create a AllUser Table 
DROP TABLE IF EXISTS AllUser;
CREATE TABLE AllUser (
    
	username VARCHAR(20) PRIMARY KEY,
    password VARCHAR(80) NOT NULL,
	firstname VARCHAR(20),
	surname VARCHAR(20),
	email VARCHAR(20),
	contact VARCHAR(20),
)
---------------------------------------------------
-- Create a ReportIssue Table 
DROP TABLE IF EXISTS ReportIssue;
CREATE TABLE ReportIssue (
    reportid int IDENTITY(1,1) PRIMARY KEY,
	username VARCHAR(20),
	FOREIGN KEY (username) REFERENCES AllUser(username),

	Category VARCHAR(20),
    Network VARCHAR(20),
    Software VARCHAR(20),
    Hardware VARCHAR(20),
    Email VARCHAR(20),
    Account VARCHAR(20),
    Description VARCHAR(1000),
	State VARCHAR(20),
)

SELECT * FROM AllUser
SELECT * FROM ReportIssue

INSERT INTO AllUser (username,password) VALUES ('jenny','123');

INSERT INTO ReportIssue VALUES ('jenny','record','record','record','record','record','record','record','record');
INSERT INTO ReportIssue VALUES ('nuoya','record','record','record','record','record','record','record','record');

DELETE FROM AllUser
DELETE FROM ReportIssue