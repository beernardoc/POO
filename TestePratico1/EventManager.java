package EP105926;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventManager {
    private String name;

    private List<String> eventos = new ArrayList<>();
    private Set<String> clientes = new HashSet<>();


    public EventManager(String name){
        this.name = name;
    }




    public Client addClient(String name, String local){

        clientes.add(name);
        return new Client(name,local);


    }

    public Event addEvent(Client c1, LocalDate parse){
        eventos.add(c1.getName());
        return new Event(c1,parse);



    }

    public boolean listClients(){
        System.out.println("Clientes: ");
        for(String ln : clientes){
            System.out.println(ln);
        }


        return false;
    }


    public String listEvents() {
        return eventos.toString();



    }

    public void setName(String name){
        this.name = name;

    }

    //public String[] clientsWithEvents() {


   // }
}




