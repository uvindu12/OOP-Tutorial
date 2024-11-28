package com.iit.Tutorial.OOP;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        if (isValidDate(day, month, year))
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    public void setDay(int day)
    {
        if (isValidDate(day, this.month, this.year))
        {
            this.day = day;
        }
        else
        {
            throw new IllegalArgumentException("Invalid day");
        }
    }
    public void setMonth(int month)
    {
        if(isValidDate(this.day, month, this.year))
        {
            this.month = month;
        }
        else
        {
            throw new IllegalArgumentException("Invalid month");
        }
    }
    public void setYear(int year)
    {
        if(isValidDate(this.day,this.month,year))
        {
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }
    public String getDate()
    {
        return String.format("%d/%d/%d", day, month, year);
    }
    @Override
    public String toString()
    {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    private boolean isValidDate(int day, int month, int year)
    {
        if(year < 1980 || year > 2079) return false;
        if(month < 1 || month > 12) return false;
        if(day < 1 || day > 31) return false;
        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) return false;
        if (month == 2)
        {
            if(isLeapYear(year)&& day > 29) return false;
            if(!isLeapYear(year) && day > 28) return false;
        }
        return true;
    }
    private boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
