package Aula3;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args){
        int dias;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o mes");
        int mes = sc.nextInt();

        while( mes <= 0 || mes > 12 ){
            System.out.println("Digite um mes valido");
            mes = sc.nextInt();

        }

        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        while( ano < 0){
            System.out.println("Digite um ano valido");
            ano = sc.nextInt();

        }


        if((ano % 400 == 0) || (ano % 4 == 0 ) && (ano %100 !=0))
        {
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

        else 
        {

            switch(mes)
            {
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

sc.close();

System.out.println("o mes: " + mes + " do ano: " + ano + " tem: " + dias + " dias");
        }

    }


    

