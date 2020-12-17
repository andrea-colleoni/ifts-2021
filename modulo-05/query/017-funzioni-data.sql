-- date

declare @data datetime

print GETDATE()

set @data = GETDATE()
print @data
print DATEPART(week, @data)
print DATEPART(day, @data)
print DATEPART(month, @data)

-- che giorno sarà tra 1000 ore?
print DATEADD(hour, 1000, @data)
-- che giorno era 90 giorni fa?
print DATEADD(day, -90, @data)

-- quante settimane sono passate da quando sono nato?
print DATEDIFF(week, '1973-08-30', @data)