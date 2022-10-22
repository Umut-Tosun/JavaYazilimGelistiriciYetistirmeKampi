--Select Komutu
select ContactName adi,CompanyName sirketadi,City sehir
from Customers

select * from Customers
where City='London'

--case insensitive
select * from products

select  * from Products where CategoryID=1
-- OR = YA DA

select  * from Products
where CategoryID=1 OR CategoryID=3

--AND ve <> farklı olanları
select  * from Products
where CategoryID=1 AND UnitPrice>=30
--order by sırala default asc[ascending artan] istersen desc yap
Select * from Products order by ProductName
--desc[descending düşen]
Select * from Products order by ProductName desc

Select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice desc

select * from Products where CategoryID=1 order by UnitPrice desc

select count(*) as 'Ürün Sayısı',CategoryID from products group by CategoryID

select count(*) as 'Ürün Sayısı',CategoryID from products group by CategoryID having Count(*)>10

Select Count(*) as 'Ürün Sayısı',Avg(UnitPrice) as 'Ortalama Fiyat',CategoryName from Products inner join Categories on
        Categories.CategoryID=Products.CategoryID group by CategoryName

--DTO Data Transformation Object

Select  Count(*) as 'Satılan Adet',p.ProductName,avg(p.UnitPrice)
    as 'Fiyat',sum(p.UnitPrice) as 'Kazanç',avg(p.UnitsInStock) as 'Kalan Stok' From Products p
                                                                                         inner join [Order Details] od on p.ProductID = od.ProductID
group by p.ProductName