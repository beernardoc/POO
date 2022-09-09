package EPteste;

import java.util.ArrayList;
import java.util.List;

public class Bar extends local {

    private int id;
    private String name;

    List<Bebida> lista = new ArrayList<>();

    public Bar(int id, String name) {
        super(id,name);
    }

   public Bar(int id, String name, List<Bebida> lista) {
        super(id,name);
        this.lista = lista;


    }


    public List<Bebida> getLista(){
        return lista;
    }

    public void add(Bebida bebida1){

        lista.add(bebida1);

    }

    public int totalProdutos(){
        return lista.size();
    }

    public String items(){
        return lista.toString();
    }



}
