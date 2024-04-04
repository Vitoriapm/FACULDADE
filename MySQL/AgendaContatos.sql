CREATE DATABASE Agenda;


USE agenda;


CREATE TABLE contatos(
id int not null,
nome varchar(30) not null,
email varchar(30),
telefone text not null,
grupo varchar(20),
primary key(id)
);


INSERT INTO contatos VALUES
('1', 'Ana Maria', 'anamaria@gmail.com', '(11) 1234-5678', 'Trabalho'),
('2', 'Beatriz Almeida', 'bealmeida@hotmail.com.br', '(12) 2345-6789', 'Escola'),
('3', 'Carlos Almirante', 'carlosmirante@yahoo.com', '(13) 3456-7891', 'Família'),
('4', 'Denise Souza', 'denise@gmail.com.br', '(14) 4567-8910', 'Amigo'),
('5', 'Enrique Doarte', 'enriarte@hotmail.com', '(15) 5678-9101', 'Trabalho'),
('6', 'Fernando Brisola', 'fernandobris@yahoo.com.br', '(16) 6789-1011', 'Escola'),
('7', 'Gustavo Henzo', 'gustavoH@gmail.com', '(17) 7891-0111', 'Família'),
('8', 'Helena Aparecida', 'Haparecida@hotmail.com.br', '(18) 8910-1112', 'Amigo'),
('9', 'Ingrid Lopez', 'ingridLopez@yahoo.com', '(19) 9101-1121', 'Trabalho'),
('10', 'João Paulo', 'joaopaulo@gmail.com.br', '(11) 1011-1213', 'Escola'),
('11', 'Karen Costa', 'karenC@hotmail.com', '(12) 1112-1314', 'Família'),
('12', 'Luan Lucas', 'luanlucas@yahoo.com.br', '(13) 1213-1415', 'Amigo'),
('13', 'Mariana Silva', 'Msilva@gmail.com', '(14) 1314-1516', 'Trabalho'),
('14', 'Nivaldo Júnior', 'juniorNivaldo@hotmail.com.br', '(15) 1415-1617', 'Escola'),
('15', 'Osvaldo Rocha', 'osvaldo@yahoo.com', '(16) 1516-1718', 'Família'),
('16', 'Paula da Cruz', 'paulacruz@gmail.com.br', '(17) 1617-1819', 'Amigo'),
('17', 'Quiana de Oliveira', 'oliveiraQui@hotmail.com', '(18) 1718-1920', 'Trabalho'),
('18', 'Richard Wilson', 'richas@yahoo.com.br', '(19) 1819-2021', 'Escola'),
('19', 'Silvana Martins', 'SilvanaMartins@gmail.com', '(11) 1920-2122', 'Família'),
('20', 'Tiago Lemos', 'lemosTiago@hotmail.com.br', '(12) 2021-2223', 'Amigo'),
('21', 'Úrsula Rosa', 'ursulaR@yahoo.com', '(13) 2122-2324', 'Trabalho'),
('22', 'Vitória Pandolfo', 'vpandolfo@gmail.com.br', '(14) 2223-2425', 'Escola'),
('23', 'Wilson Marcos', 'wilsonmarcos@hotmail.com', '(15) 2324-2526', 'Família'),
('24', 'Xuxa Meireles', 'XuxaMei@yahoo.com.br', '(16) 2425-2627', 'Amigo'),
('25', 'Yuri Pinto', 'yuriP@gmail.com', '(17) 2526-2728', 'Trabalho'),
('26', 'Zacarias Rodrigo', 'rodrigoZacas@hotmail.com.br', '(18) 2627-2829', 'Escola'),
('27', 'Amanda de Paula', 'PaulaAmanda@yahoo.com', '(19) 2728-2930', 'Família'),
('28', 'Bernardo de Campos', 'bernado@gmail.com.br', '(11) 2829-3031', 'Amigo'),
('29', 'Camila Gonzaga', 'camilaG@hotmail.com', '(12) 2930-3132', 'Trabalho'),
('30', 'Doarte Santos', 'santosdoarte@yahoo.com.br', '(13) 3031-3233', 'Escola'),
('31', 'Enzo Gustavo', 'gusEnzo@gmail.com', '(14) 3132-3334', 'Família'),
('32', 'Fabrício Pereira', 'fabriciopereira@hotmail.com.br', '(15) 3233-3435', 'Amigo'),
('33', 'Giovanna America', 'giovanAmerica@yahoo.com', '(16) 3334-3536', 'Trabalho'),
('34', 'Hebert Messias', 'hebertMes@gmail.com.br', '(17) 3435-3637', 'Escola'),
('35', 'Iago Felizberto', 'felizIago@hotmail.com', '(18) 3536-3738', 'Família'),
('36', 'Júlia Rodriguez', 'julianaRo@yahoo.com.br', '(19) 3637-3839', 'Amigo'),
('37', 'Kaique Nandos', 'nandoskaique@gmail.com', '(11) 3738-3940', 'Trabalho'),
('38', 'Lorena Jandira', 'lorena@hotmail.com.br', '(12) 3839-4041', 'Escola'),
('39', 'Marcelo Soares', 'marcelo@yahoo.com', '(13) 3940-4142', 'Família'),
('40', 'Nadine Rezende', 'nadineRez@gmail.com.br', '(14) 4041-4243', 'Amigo'),
('41', 'Otávio Ferreira', 'ferOtavio@hotmail.com', '(15) 4142-4344', 'Trabalho'),
('42', 'Paulo Batigaglia', 'batigagliaPaulo@yahoo.com.br', '(16) 4243-4445', 'Escola'),
('43', 'Queiroz de Camargo', 'queirozC@gmail.com', '(17) 4344-4546', 'Família'),
('44', 'Renata Lemos', 'renata@hotmail.com.br', '(18) 4445-4647', 'Amigo'),
('45', 'Sílvio Santos', 'santosSilvio@yahoo.com', '(19) 4546-4748', 'Trabalho'),
('46', 'Tamires Teixeira', 'tamires@gmail.com.br', '(11) 4647-4849', 'Escola'),
('47', 'Uriel Samoel', 'urielsamoel@hotmail.com', '(12) 4748-4950', 'Família'),
('48', 'Vanessa Lucas Franca', 'vanessaFranca@yahoo.com.br', '(13) 4849-5051', 'Amigo'),
('49', 'Wanderley Gallo', 'wanderley@gmail.com', '(14) 4950-5152', 'Trabalho'),
('50', 'Xande Carlos', 'carlosXandes@hotmail.com.br', '(15) 5051-5253', 'Escola');


SELECT id, nome, grupo FROM contatos
WHERE id > 30;

SELECT nome, email FROM contatos
WHERE grupo = 'Trabalho';

SELECT nome, telefone FROM contatos
WHERE grupo = 'Escola';


UPDATE contatos
SET nome = 'Renato Vasconcelos'
WHERE id = '1';

UPDATE contatos
SET email = 'BeatrizAlmeida@gmail.com'
WHERE id = '2';

UPDATE contatos
SET telefone = '(11) 1111-1111'
WHERE id = '3';

UPDATE contatos
SET grupo = 'Família'
WHERE id = '4';

UPDATE contatos
SET nome = 'Lauana Doarte'
WHERE id = '5';

UPDATE contatos
SET email = 'FernandoBrisola@gmail.com'
WHERE id = '6';

UPDATE contatos
SET telefone = '(22) 2222-2222'
WHERE id = '7';

UPDATE contatos 
SET grupo = 'Escola'
WHERE id = '8';

UPDATE contatos 
SET nome = 'Amanda Aparecida'
WHERE id = '9';

UPDATE contatos
SET email = 'PauloJoao@yahoo.com.br'
WHERE id = '10';


DELETE FROM contatos
WHERE id = '7';

DELETE FROM contatos
WHERE nome = 'Lauana Doarte'
LIMIT 1;

DELETE FROM contatos
WHERE id > 40;


ALTER TABLE contatos
ADD COLUMN favorito varchar(3) default 'Não';


UPDATE contatos
SET favorito = 'Sim'
WHERE id = '20';

UPDATE contatos 
SET favorito = 'Sim'
WHERE grupo = 'Família'
LIMIT 2;

UPDATE contatos
SET favorito = 'Sim'
WHERE nome = 'Luan lucas'
LIMIT 1;


SELECT * FROM contatos;
