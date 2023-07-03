-- 코드를 입력하세요

select
    b.BOOK_ID, a.author_name,
    to_char(b.published_date,'yyyy-mm-dd') as PUBLISHED_DATE
    from book b
    join author a
    on b.author_id = a.author_id
    where b.CATEGORY like '경제'
    order by PUBLISHED_DATE;