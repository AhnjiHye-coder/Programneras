-- 131535
-- 조건에 맞는 회원수 구하기
select
    count(USER_ID) as USERS
    from USER_INFO
    where year(joined) = '2021'
    and 
        age between 20 and 29;