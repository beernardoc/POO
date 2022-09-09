package EPteste;

import java.util.Arrays;

public class Bebida {

    private String  name;
    private  double teorAlcolico;


    private String[] info = new String[2];

    public Bebida(String name,double teor){
        this.name = name;
        this.teorAlcolico = teor ;


        info[0] = "nome= " + name;
        info[1] = "teorAlc= " + String.valueOf(teor);
    }

    public String toString(){
        return "Bebida " + Arrays.toString(info);

    }


}
