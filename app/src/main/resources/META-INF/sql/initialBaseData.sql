insert into person (name, age, gender) values( 'Joana Alves', '2000-05-25', 'M');
insert into person (name, age, gender) values ( 'Jane Smith', '1985-05-22', 'F');

-- Inserir registros na tabela Address (distribuídos entre os registros em Person)
insert into address (state, city, street, number, postal_code, id_person) values ('RJ', 'Los Angeles', 'Main St', '123', '90001', 1);
insert into address (state, city, street, number, postal_code, id_person) values ('SP', 'Angeles', 'Main St', '123', '90001', 1);
insert into address (state, city, street, number, postal_code, id_person) values ('CE', 'Los', 'Main St', '123', '85000',2);
insert into address (state, city, street, number, postal_code, id_person) values ('PE', 'Los les', 'Main St', '123', '90001', 2);
