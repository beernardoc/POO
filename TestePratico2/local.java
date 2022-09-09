package EPteste;

import java.util.ArrayList;
import java.util.List;

public class local {

    private int id;
    private  String name;

    private List<Bebida> lista = new ArrayList<>();

    private String[] pratos;

    public local(int id,String name){
        this.id = id;
        this.name = name;

    }

    public String getNome(){
        return name;
    }

    public int getId(){
        return id;
    }



}
