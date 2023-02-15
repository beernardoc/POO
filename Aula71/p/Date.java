package Aula71.p;
import java.lang.Math;

public abstract class Date{
    int Day;
    int Month;
    int Year;

    public abstract boolean validMonth();
    public abstract boolean leapYear();
    public abstract int MonthDays();
    public abstract boolean valid();
    public abstract void increment();
    public abstract void decrement();


}


  class DateYMD extends Date{

    
 
     DateYMD(int d, int m, int y){
         Day = d;
         Month = m;
         Year = y;
 
     }
 
 
     public boolean validMonth(){
 
         if(Month >= 1 && Month <=12){return true;}
         else{return false;}
 
     }
 
 
     public boolean leapYear(){
 
         if((Year % 400 == 0) || (Year % 4 == 0 ) && (Year %100 !=0)){return true;}
         else{return false;}
     }
 
     public int MonthDays(){
 
         
         if (leapYear()){
 
             switch(Month){
                 case 2:
                     Day = 29;
                     break;
                 case 4,6,9,11:
                     Day = 30;
                     break;
                 default:
                     Day = 31;
                     break;
 
                 }
 
 
         }
         else{
             switch(Month){
                 case 2:
                     Day = 28;
                     break;
                 case 4,6,9,11:
                     Day = 30;
                     break;
                 default:
                     Day = 31;
                     break;
 
                 }
         }
 
         return Day;    
 
     }
 
     public boolean valid(){
         
         if(Day <= 0 || Day > Day){
             return false;
 
         }
 
         if (Month <= 0 || Month >12){
             return false;
         }
 
         if (Year <0){
             return false;
         }
         return true;
 
     }
 
 
     public void set(int Day,int Month,int Year){
         this.Day = Day;
         this.Month = Month;
         this.Year = Year;
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
 
     public void increment(){
          int day = MonthDays();
 
         if(Day == day){
             this.Day = 1;
 
             if(Month == 12){
                 this.Month = 1;
                 this.Year++;
             }
             else{
                 this.Month++;
                 
             }
         }
         else{
             this.Day++;
            
         }
 
 
 
     }
 
 
 
     public void decrement(){
         
 
         if(Day == 1){
             
 
             if( Month == 1){
                 Day = 31;
                 Month = 12;
                 Year--;
             }
             else{
                if (leapYear()){
 
                    switch(Month){
                        case 3:
                            Day = 29;
                            Month--;
                            break;
                        case 4,6,8,9,11:
                            Day = 31;
                            Month--;
                            break;
                        default:
                            Day = 30;
                            Month--;
                            break;
        
                        }
        
        
                }
                else{
                    switch(Month){
                        case 3:
                            Day = 28;
                            Month--;
                            break;


                            case 4,6,8,9,11:
                            Day = 31;
                            Month--;
                            break;
                        default:
                            Day = 30;
                            Month--;
                            break;
        
                        }
                }
        
             }
    
         }
         else{
             Day--;
             
 
         }
 
     }
 
     public String toString(){
 
         return Year + "-" + Month + "-" + Day;
 
 
     }

    }


    class DateND extends Date{
        int dias = 0;
        DateND(){
            Day = 1;
            Month = 1;
            Year = 2000;
        }
        public boolean validMonth(){
 
            if(Month >= 1 && Month <=12){return true;}
            else{return false;}
    
        }
        public boolean leapYear(){
 
            if((Year % 400 == 0) || (Year % 4 == 0 ) && (Year %100 !=0)){return true;}
            else{return false;}
        }
        public int MonthDays(){
 
         
            if (leapYear()){
    
                switch(Month){
                    case 2:
                        Day = 29;
                        break;
                    case 4,6,9,11:
                        Day = 30;
                        break;
                    default:
                        Day = 31;
                        break;
    
                    }
    
    
            }
            else{
                switch(Month){
                    case 2:
                        Day = 28;
                        break;
                    case 4,6,9,11:
                        Day = 30;
                        break;
                    default:
                        Day = 31;
                        break;
    
                    }
            }
    
            return Day;    
    
        }
        public boolean valid(){
         
            if(Day <= 0 || Day > Day){
                return false;
    
            }
    
            if (Month <= 0 || Month >12){
                return false;
            }
    
            if (Year <0){
                return false;
            }
            return true;
    
        }
        public void increment(){
            int day = MonthDays();
   
           if(Day == day){
               this.Day = 1;
   
               if(Month == 12){
                   this.Month = 1;
                   this.Year++;
               }
               else{
                   this.Month++;
                   
               }
           }
           else{
               this.Day++;
              
           }
   
   
   
       }
        public void decrement(){
         
 
        if(Day == 1){
            

            if( Month == 1){
                Day = 31;
                Month = 12;
                Year--;
            }
            else{
               if (leapYear()){

                   switch(Month){
                       case 3:
                           Day = 29;
                           Month--;
                           break;
                       case 4,6,8,9,11:
                           Day = 31;
                           Month--;
                           break;
                       default:
                           Day = 30;
                           Month--;
                           break;
       
                       }
       
       
               }
               else{
                   switch(Month){
                       case 3:
                           Day = 28;
                           Month--;
                           break;


                           case 4,6,8,9,11:
                           Day = 31;
                           Month--;
                           break;
                       default:
                           Day = 30;
                           Month--;
                           break;
       
                       }
               }
       
            }
   
        }
        else{
            Day--;
            

        }

    }
        

    public  int comparaçao(DateYMD objeto){ // melhorar codigo para considerar anos bisextos e nem todos os meses com 30 dias

        int diferençaAnos= Math.abs(objeto.Year - Year);
        

        dias = dias + 365*diferençaAnos; //sem considerar por enquanto os anos bisextos

        int diferençaMeses = Math.abs(objeto.Month - Month);

        dias = dias + diferençaMeses*30; // ainda considerando os meses como tendo 30 dias

        int diferençaDias = Math.abs(objeto.Day - Day);

        dias = dias + diferençaDias;



        return dias;

    
    }

    
    
    }

 









        



        

        
        


     






        

     


    


    

 
 