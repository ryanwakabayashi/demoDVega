INSERT INTO link (id,creation_date,last_modified_date,created_by,last_modified_by,title,url)
VALUES (1,NOW(),NOW(),null,null,'Getting Started with SB2','http://localhost');

INSERT INTO comment (id,created_by,creation_date,last_modified_date,last_modified_by,body,link_id)
VALUES (1,null,NOW(),NOW(),null,'Coursework in the body',1);