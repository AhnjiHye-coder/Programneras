-- 코드를 입력하세요
select
    count(USER_ID) as USERS
    from USER_INFO
    where year(joined) = '2021'
    and
        age between 20 and 29;
    