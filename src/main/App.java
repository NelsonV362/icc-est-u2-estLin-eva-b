package main;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args)  {
        LogicaClasificacion logica =new LogicaClasificacion();
        Queue<String> cola1=new LinkedList<>();
        cola1.add("Ana");
        cola1.add("Luis");
        cola1.add("Pedro");
    System.out.println("Ejercicio Ana-Pedro-Luis");
    Queue<String>  reversa=logica.invertirColaNombres(cola1);
    for(String nombre : reversa) {
        System.out.println(nombre);
    }
        //2ndo ejercicio
    Queue<String> cola2= new LinkedList<>();
    cola2.add("c");
    cola2.add("a");
        cola2.add("d");
            cola2.add("r");
            System.out.print("Segunda ejercicio:");
            System.out.println(logica.verificar(cola2));
            cola2.add("c");
            cola2.add("a");
            cola2.add("s");
            cola2.add("s");
            System.out.print("Segundo ejercicio");
            System.out.println(logica.verificar(cola2));



    }
}
