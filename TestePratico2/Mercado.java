package EPteste;

import java.util.*;

public class Mercado {

    private String name;
    private String local;

    private List<String> locais = new ArrayList<>();

    private int totalItens = 0;


    public Mercado(String name, String local) {

        this.name = name;
        this.local = local;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public List<String> getLocais(){
        return Collections.singletonList(locais.toString());
    }




    public void add(Bar local1){
        locais.add(local1.getNome());
        totalItens = totalItens + local1.totalProdutos();


    }

    public void add(Tasquinha local2){
        locais.add(local2.getNome());
        totalItens = totalItens + local2.totalProdutos();


    }

    public int totalItems(){
        return totalItens;
    }

    public String toString(){
        return "Mercado " + name;
    }

}
