package Aula8.ex2;

public enum DiaSemana {
    SEGUNDA,TERÇA,QUARTA,QUINTA,SEXTA;

    static DiaSemana getEnum(int i ){
        DiaSemana[] a = DiaSemana.values();
        return a[i];
    }


    
}
