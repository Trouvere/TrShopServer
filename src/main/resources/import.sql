insert into category(name) values ('display')
insert into category(name) values ('mobile')
insert into category(name) values ('camera')

insert into product(name, category_id, price) values ('LG29UM58-P', '1', '10')
insert into product(name, category_id, price) values ('Dell UltraSharp U2515H', '1', '11')
insert into product(name, category_id, price) values ('BenQ XL2411Z', '1', '1')
insert into product(name, category_id, price) values ('Apple iPhone 7 32GB Black', '2', '12')
insert into product(name, category_id, price) values ('Xiaomi Redmi 4 32GB Silver', '2', '13')
insert into product(name, category_id, price) values ('Apple_iPhone 7 32GB Black', '2', '14')
insert into product(name, category_id, price) values ('Canon EOS 6D Body', '3', '15')
insert into product(name, category_id, price) values ('Nikon D3300 Kit 18-55mm VR II', '3', '16')


--
--insert into user(name, password, role) values ('name1', '123', 'USER')
--insert into user(name, password, role) values ('name2', '123', 'ADMIN')
--
--



--# noinspection SqlNoDataSourceInspectionForFile
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));

INSERT INTO AUTHORITY (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (ID, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (3, 1);
