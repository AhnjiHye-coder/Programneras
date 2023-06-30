-- 코드를 입력하세요
-- 전체 목록
-- SELECT * from FOO_PRODUCT

-- 최대가격
-- select max(price) from food_product

-- 전체 목록 중에서 가격이 최대 가격과 일치하는 내용
select * from food_product
    where
        price = (select max(price) from food_product);