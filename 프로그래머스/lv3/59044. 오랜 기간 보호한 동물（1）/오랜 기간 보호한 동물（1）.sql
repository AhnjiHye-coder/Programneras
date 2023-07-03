-- 코드를 입력하세요
select 
     i.name, i.DATETIME
    from ANIMAL_INS i
    left join ANIMAL_OUTS o
    on i.ANIMAL_ID = o.ANIMAL_ID
    where o.ANIMAL_ID is null
    order by i.DATETIME asc
    fetch next 3 rows only;

    
    