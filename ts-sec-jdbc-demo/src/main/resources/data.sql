insert into account_holders(username, password, enabled) values ('ravi', '1234', true);
insert into account_holders(username, password, enabled) values ('raju', '1234', true);
insert into account_holders(username, password, enabled) values ('kiran', 'abcd', true);
insert into account_holders(username, password, enabled) values ('pavan', 'abcd', true);

insert into roles(username, authority) values('ravi', 'ROLE_ADMIN');
insert into roles(username, authority) values('raju', 'ROLE_USER');
insert into roles(username, authority) values('kiran', 'ROLE_USER');
insert into roles(username, authority) values('pavan', 'ROLE_USER');