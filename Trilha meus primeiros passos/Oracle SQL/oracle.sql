CREATE TABLE COMPRAS (
	ID NUMBER PRIMARY KEY,
	VALOR NUMBER,
	DATA DATE,
	OBSERVACOES VARCHAR(30),
	RECEBIDO CHAR check(recebido in (0,1))
);
CREATE SEQUENCE ID_SEQ;

SELECT VALOR AND OBSERVACOES FROM COMPRAS WHERE DATA >= 15-OCT-2008;