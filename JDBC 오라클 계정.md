CREATE USER vino IDENTIFIED by 1234;

grant create database link to vino;
grant create materialized view to vino;
grant create procedure to vino;
grant create public synonym to vino;
grant create role to vino;
grant create sequence to vino;
grant create synonym to vino;
grant create table to vino;
grant drop any table to vino;
grant create trigger to vino;
grant create type to vino;
grant create view to vino;
grant create session to vino;

// 맴버 식별 ID auto_increment 시퀀스
CREATE SEQUENCE USER_SEQ START WITH 1 INCREMENT BY 1 MAXVALUE 9999 NOCYCLE NOCACHE