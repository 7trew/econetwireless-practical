
-- SET FOREIGN_KEY_CHECKS = 0;

delete from area;
delete from shop;

insert into area (area_id, city,province) values 
(1, 'Harare CBD', 'Harare'),
(2, 'Bulawayo', 'Bulawayo'),
(3, 'Mutare', 'Manicaland'),
(4, 'Mazowe', 'Mashonaland Central'),
(5, 'Marondera', 'Mashonaland East'),
(6, 'Kariba', 'Mashonaland West'),
(7, 'Masvingo', 'Masvingo'),
(8, 'Hawange', 'Matabeleland North'),
(9, 'Beitbridge', 'Matabeleland South'),
(10, 'Gweru', 'Midlands')

-- SET FOREIGN_KEY_CHECKS = 1;

