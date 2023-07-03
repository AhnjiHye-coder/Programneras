-- 코드를 입력하세요
-- 문제 
-- 입양일을 조회한다
-- 보호시작일보다 빠른 입양일을 조회하면 된다
-- 보호시작일 테이블과 입양테이블을 비교해서 이름,id출력
-- a보다 b가 빠른가? 하는 경우엔 부등호를 사용하자!
-- 문제번호 59042
-- 있었는데요 없었습니다
select 
    i.ANIMAL_ID, i.NAME
    from ANIMAL_INS i
    join ANIMAL_OUTS o
    on i.ANIMAL_ID = o.ANIMAL_ID
    where
        i.DATETIME > o.DATETIME -- i보다 o가 더 큰 경우
    order by i.DATETIME;