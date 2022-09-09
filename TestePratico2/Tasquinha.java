package EPteste;

import java.util.Arrays;

public class Tasquinha extends local {

    private int id;
    private  String name;
    private String[] pratos = {};

    public Tasquinha(int id, String name) {
        super(id,name);

    }

    public Tasquinha(int id, String name, String[] pratos) {
        super(id,name);
        this.pratos = pratos;
    }


    public void addPrato(String nomePrato){
        String[] copia = Arrays.copyOf(pratos, pratos.length + 1);
        copia[copia.length - 1] = nomePrato;
        this.pratos = copia;


    }


    public int totalProdutos(){
        return pratos.length;
    }

    public String items(){
        return Arrays.toString(pratos);
    }



}
