select c.nome, count(m.id) from
curso c join matricula m on c.id = m.curso_id
where m.tipo IN ('PAGA_PF', 'PAGA_PJ')
group by c.nome;

select e.pergunta, count(r.id) from
exercicio e join resposta r on e.id = r.exercicio_id
join secao s on s.id = e.secao_id
join curso c on s.curso_id = c.id
where c.id IN (1,3)
group by e.pergunta;

select avg(n2.nota) from nota n2;

select a.nome, avg(n1.nota) as media, avg(n1.nota) - (select avg(n2.nota) from nota n2) as diferenca from nota n1
join resposta r on r.id = n1.resposta_id
join exercicio e on e.id = r.exercicio_id
join secao s on s.id = e.secao_id
join aluno a on a.id = r.aluno_id
group by a.nome;