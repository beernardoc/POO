package Aula5.P.Calendar52;

import Aula5.P.Date51.Date;

public class Calendar{

    private int year;
    private int first;
    private String[] weekDays = {"Domingo","Segunda","terça","quarta","quinta","sexta","sabado"};
    private String[] monthDays= {"Janeiro","Fevereiro","Março","Abril","Maio","junho","julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};




    public Calendar(int year, int first){
        this.year = year;
        this.first = first;
    }

    public int year(){
        return year;

    }

    public String firstWeekdayOfYear(){

        return weekDays[first - 1];

    }

    public int firstWeekdayOfMonth(int m){
        int dia=first;
        for(int i=1; i<m;i++){
            dia+=Date.monthDays(i,year);
            dia%=7;
            if(dia==0){dia=7;}
        }
        return dia;
    }



    public String printMonth(int m){
        int max= 20;

        String ms=monthDays[m-1];

        int paddingLeft;
        int changeLine=1;

        paddingLeft=(max-(ms.length()+3))/2;
        StringBuilder sb= new StringBuilder("");

        sb.append("\n");
        sb.append(String.format(" ".repeat(paddingLeft)+"%s %4d \n",ms,year));
        sb.append("Su Mo Tu We Th Fr Sa \n");

        for (int i=1-(firstWeekdayOfMonth(m)-1);i<=Date.monthDays(m,year);i++){
            if(i<1){
                sb.append("   ");
            }else{
                sb.append(String.format("%2d ",i));
            }
            if(changeLine++%7==0){
                sb.append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
     
    }

    public void set(int year, int first){
        this.year = year;
        this.first = first;

    }







    public String toString(){

        StringBuilder sb= new StringBuilder("");
        for(int i=1;i<=12;i++){
            sb.append(printMonth(i));
        }
        return sb.toString();


    }













}