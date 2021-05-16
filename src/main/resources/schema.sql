# CREATE TABLE IF NOT EXISTS USERS (
#                                      userid INT PRIMARY KEY auto_increment,
#                                      username VARCHAR(20),
#                                      salt VARCHAR(200),
#                                      password VARCHAR(200),
#                                      firstname VARCHAR(20),
#                                      lastname VARCHAR(20)
# );
#
# CREATE TABLE IF NOT EXISTS NOTES (
#                                      noteid INT PRIMARY KEY auto_increment,
#                                      notetitle VARCHAR(20),
#                                      notedescription VARCHAR (1000),
#                                      userid INT,
#                                      foreign key (userid) references USERS(userid)
# );
#
# CREATE TABLE IF NOT EXISTS FILES (
#                                      fileId INT PRIMARY KEY auto_increment,
#                                      filename VARCHAR(200),
#                                      contenttype VARCHAR(200),
#                                      filesize VARCHAR(200),
#                                      userid INT,
#                                      filedata BLOB,
#                                      foreign key (userid) references USERS(userid)
# );
#
# CREATE TABLE IF NOT EXISTS CREDENTIALS (
#                                            credentialid INT PRIMARY KEY auto_increment,
#                                            url VARCHAR(100),
#                                            username VARCHAR (30),
#                                            key VARCHAR,
#                                            password VARCHAR(200),
#                                            userid INT,
#                                            foreign key (userid) references USERS(userid)
# );
