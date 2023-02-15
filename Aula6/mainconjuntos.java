package Aula6;



public class mainconjuntos {


    public static void main(String[] args) throws CloneNotSupportedException {


        conjuntos c1 = new conjuntos();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5);

        conjuntos c2 = new conjuntos();
        int[] test = { 7, 3, 2, 5, 4, 6, 7};

        for (int el : test) c2.insert(el);
        c2.remove(3);  c2.remove(5); c2.remove(6);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());

        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?:" + ((c2.contains(6) ? "sim" : "não")));

        System.out.println("União:" + c1.unir(c2));
        System.out.println("Interseção:" + c1.interset(c2));
        System.out.println("Diferença:" + c1.subtrair(c2));
        
        c1.empty();
        System.out.println("c1:" + c1);

    }

  
}
