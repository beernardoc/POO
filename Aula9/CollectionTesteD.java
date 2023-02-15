package Aula9;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.TreeSet;


public class CollectionTesteD { 
    public static void main(String[] args) {
        int[] DIM= {1000,5000,10000,20000,40000,100000};
        List<Collection<Integer>> col= new ArrayList<>();

    col.add(new ArrayList<>());
    col.add(new LinkedList<>());
    col.add(new HashSet<>());
    col.add(new TreeSet<>());

    System.out.printf("%-10s", "Collection");
    for(int i = 0;i < DIM.length; i++){
        System.out.printf("%15d", DIM[i]);

    }
    System.out.println("\n");

    for( Collection<Integer> c : col){
        printTable(c,DIM);
    }
    

    }
        
        private static double[] checkPerformance(Collection<Integer> col, int DIM) {
            


            double start, stop, delta;
            // Add
            start= System.nanoTime(); // clock snapshot before
            for(int i=0; i<DIM; i++ )
            col.add( i);
            stop= System.nanoTime();  // clock snapshot after
            delta= (stop-start)/1e6; // convert to milliseconds
            double adicionar = delta;
            //System.out.println(adicionar);
            //System.out.println(col.size()+ ": Add to "+col.getClass().getSimpleName() +" took "+ delta+ "ms");

            // Search
            start= System.nanoTime(); // clock snapshot before
            for(int i=0; i<DIM; i++ ) {
                int n= (int) (Math.random()*DIM);
                if(!col.contains(n)) 
                System.out.println("Not found???"+n);
            }
            stop= System.nanoTime();  // clock snapshot after
            delta= (stop-start)/1e6; // convert nanoseconds to milliseconds

            double search = delta;
            //System.out.println(search);
           // System.out.println(col.size()+ ": Search to "+ col.getClass().getSimpleName() +
           //     " took "+ delta+ "ms");
                    
            // Remove
            start= System.nanoTime(); // clock snapshot before
            Iterator<Integer> iterator= col.iterator();
            while(iterator.hasNext()) {
                iterator.next();
                iterator.remove();}
            stop= System.nanoTime();  // clock snapshot after
            delta= (stop-start)/1e6; // convert nanoseconds to milliseconds
            double remove = delta;
            //System.out.println(remove);
           // System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +
             //   " took "+ delta+ "ms");

                
                double[] fim = {adicionar,search,remove};
               
                
               
                

            return fim;
            
        }


        private static void printTable(Collection<Integer> col, int[] DIM){


            double[][] t = new double[DIM.length][3];
            String[] col1 = {"add", "search", "remove"};
            for(int i = 0 ; i < DIM.length ; i++){
                double[] each = checkPerformance(col, DIM[i]);
                t[i] = each;
            }

            System.out.printf("%-10s\n", col.getClass().getSimpleName());

            for(int i = 0; i < 3; i++){
                System.out.printf("%-10s", col1[i]);
                for(int j = 0;j < DIM.length;j++){
                    System.out.printf("%15.2f", t[j][i]);
                }
                System.out.println();

            }


        }
    }