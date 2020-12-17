-- esempio di Transact-SQL (T-SQL); è specifico di SQL Server
declare @a int

set @a = 11

if @a > 10
begin
	print 'maggiore'
	select * from ricetta
end
else
begin
	print 'non è maggiore'
	select * from cuoco
end