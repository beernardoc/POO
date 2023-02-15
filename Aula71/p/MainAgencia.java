package Aula71.p;


import java.util.Arrays;
import java.util.Scanner;

public class MainAgencia {

    
    
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia();
        Apartamento newApto = new Apartamento();
        Quarto newQuarto = new Quarto();

        int option = menu();

        while(option != 0){

        switch(option){

            
            
            case 1:

            System.out.println("DIGITE O NOME DA AGENCIA: ");
            String name = sc.next();
            System.out.println("DIGITE O ENDEREÇO DA AGENCIA: ");
            String adress = sc.next();
            agencia.setName(name);
            agencia.setAdress(adress);

            System.out.println(agencia);
            option = menu();

            break;
            

            case 2:

            System.out.println(agencia);
            option = menu();

           
            break;

            case 3:

            System.out.println("1 - criar um novo apartamento \n2 - criar novo quarto\n0 - voltar");
            int escolha = sc.nextInt();

            while(escolha!=0){

            switch(escolha){
                case 1:

                
                System.out.println("DIGITE O CODIGO DO APARTAMENTO: ");
                int codigo = sc.nextInt();
                newApto.setCodigo(codigo);

            

                System.out.println("DIGITE O NOME DO APARTAMENTO: ");
                String nome = sc.next();
                newApto.setName(nome);

                System.out.println("DIGITE O LOCAL DO APARTAMENTO: ");
                String local = sc.next();
                newApto.setLocal(local);

                System.out.println("DIGITE O PREÇO DO APARTAMENTO: ");
                Double preco = sc.nextDouble();
                newApto.setPreco(preco);

                System.out.println("DIGITE A QUANTIDADE DE QUARTOS DO APARTAMENTO: ");
                int quantidade = sc.nextInt();
                newApto.setNQuartos(quantidade);

                System.out.println(newApto);
                System.out.println("1 - criar um novo apartamento \n2 - criar novo quarto\n0 - voltar");
                escolha = sc.nextInt();



                break;
                case 2:
                newQuarto = new Quarto();
                System.out.println("DIGITE O CODIGO DO QUARTO: ");
                codigo = sc.nextInt();
                newQuarto.setCodigo(codigo);

                System.out.println("DIGITE O NOME DO QUARTO: ");
                nome = sc.next();
                newQuarto.setName(nome);

                System.out.println("DIGITE O LOCAL DO QUARTO: ");
                local = sc.next();
                newQuarto.setLocal(local);

                System.out.println("DIGITE O PREÇO DO QUARTO: ");
                preco = sc.nextDouble();
                newQuarto.setPreco(preco);

                System.out.println("DIGITE O TIPO DO QUARTO: ");
                String tipo = sc.next();
                newQuarto.setTipo(tipo);

                System.out.println(newQuarto);
                System.out.println("1 - criar um novo apartamento \n2 - criar novo quarto\n0 - voltar");
                escolha = sc.nextInt();

                break;

                
            }
            
        }
        option = menu();

            break;
            
       
            case 4:
           
            Cars newCarro = new Cars();
            String classes[] = {"A","B","C","D","E","F"};
            System.out.println("DIGITE A CLASSE DO CARRO (A-F): ");
            String classe = sc.next();

            while(Arrays.asList(classes).contains(classe) == false){

                System.out.println("DIGITE UMA CLASSE VÁLIDA (A-F): ");
                classe = sc.next();

            }


            newCarro.setClasse(classe);
            String motores[] = {"gasolina","diesel","híbrido","elétrico"};
            System.out.println("DIGITE O TIPO DE MOTOR DO CARRO (gasolina,diesel,híbrido,elétrico): ");
            String motor = sc.next();

            while(Arrays.asList(motores).contains(motor) == false){
                System.out.println("DIGITE O TIPO DE MOTOR VÁLIDO (gasolina,diesel,híbrido,elétrico): ");
                motor = sc.next();
            }
            System.out.print("\ncarro adicionado:\n");
            newCarro.setMotor(motor);
            System.out.print(newCarro);


            option = menu();
            break;

            case 5: //checkin alojamento

            System.out.println("DIGITE O NOME DO HOSPEDE: ");
            String nome = sc.next();
            System.out.println("DIGITE O TEMPO DA PERMANENCIA EM DIAS: ");
            int tempo = sc.nextInt();

            System.out.println("DIGITE O CODIGO DO ALOJAMENTO: ");
            int codigo = sc.nextInt();

            if(newApto.codigo == 0){

                System.out.println("\nPRIMEIRO CADASTRE UM ALOJAMENTO: ");
                option = menu();
                break;
               

            }
            else{
                while(codigo != newApto.codigo){
                

                    System.out.println("DIGITE UM CODIGO VALIDO:\n ");
                    codigo = sc.nextInt();
                }
                newApto.checkIn(codigo, nome, tempo);
            }

            option = menu();

            break;

            case 6:
            System.out.println("DIGITE O CODIGO DO ALOJAMENTO: ");
            int codigoCO = sc.nextInt();

            newApto.checkout(codigoCO);
            option = menu();

            break;

            
            


            

            

            






        }
    
    }
    



       
    }





public static int menu(){
    Scanner sc = new Scanner(System.in);

    

    
        System.out.println("\n1 - criar nova agencia \n2 - informações agencia \n3 - adicionar novo alojamento \n4 - adicionar novo carro\n5 - realizar check-in\n6 - realizar check-out \n0 - exit");
        System.out.println("Choose option");
        int option = sc.nextInt();
    

    return option;

}
    
}
