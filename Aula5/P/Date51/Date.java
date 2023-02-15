package Aula5.P.Date51;




public class Date implements Comparable<Date>{
   int Day;
   int Month;
   int Year;

    public Date(int d, int m, int y){
        this.Day = d;
        this.Month = m;
        this.Year = y;

    }


    public static boolean validMonth(int month){
            

        if(month >= 1 && month <=12){return true;}
        else{return false;}

    }


    public static boolean leapYear(int year){

        if((year % 400 == 0) || (year % 4 == 0 ) && (year %100 !=0)){return true;}
        else{return false;}
}

    public static int monthDays(int mes, int year){

        int dias;
        if (leapYear(year)){

            switch(mes){
                case 2:
                    dias = 29;
                    break;
                case 4,6,9,11:
                    dias = 30;
                    break;
                default:
                    dias = 31;
                    break;

                }


        }
        else{
            switch(mes){
                case 2:
                    dias = 28;
                    break;
                case 4,6,9,11:
                    dias = 30;
                    break;
                default:
                    dias = 31;
                    break;

                }
        }

        return dias;    

    }

    public static boolean valid(int day,int month,int year){
        
        int dias = monthDays(month, year);

        if(day <= 0 || day > dias){
            return false;

        }

        if (month <= 0 || month >12){
            return false;
        }

        if (year <0){
            return false;
        }
        return true;

    }


    public void set(int day,int month,int year){
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }

    public int getDay(){
        return Day;

    }
    public int getMonth(){
        return Month;

    }
    public int getYear(){
        return Year;

    }

    public void increment(int day, int month, int year){
        int dias = monthDays(month, year);

        if(day == dias){
            this.Day = 1;

            if(month == 12){
                this.Month = 1;
                this.Year++;
            }
            else{
                this.Month++;
                this.Year = year;
            }
        }
        else{
            this.Day++;
            this.Month = month;
            this.Year = year;
        }



    }



    public void decrement(int day, int month, int year){
        int dias;

        if(day == 1){

            if( month == 1){
                dias = monthDays(12, year-1);
                this.Day = dias;
                this.Month = 12;
                this.Year = year -1;
            }
            else{
                dias = monthDays(month - 1, year);
                this.Day = dias;
                this.Month = month - 1;
                this.Year = year;
            }



            
        }
        else{
            this.Day--;
            this.Month = month;
            this.Year = year;

        }

    }

    public String toString(){

        return Year + "-" + Month + "-" + Day;


    }


    @Override
    public int compareTo(Date o) {
        return Day;
        
        
    }


    
}