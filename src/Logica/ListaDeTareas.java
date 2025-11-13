package Logica;

import java.util.Scanner;

public class ListaDeTareas {

    public static void main(String[] args) {
        //Lista de tareas
        String opcion;
        Scanner teclado = new Scanner(System.in);
        //Agregar una función que muestre menú
        System.out.println("Lista de tareas");
        System.out.println("Opciones:");
        System.out.println("A - Ver tareas.");
        System.out.println("B - Agregar tarea.");
        System.out.println("C - Modificar tarea.");
        System.out.println("D - Eliminar tarea");
        System.out.println("0 - Para salir.");

        //Ingreso de datos
        System.out.print("Ingrese una opción: ");
        opcion = teclado.next();

        while (!opcion.toLowerCase().contains("0")) {
            //Agregar una función que muestre menú
            System.out.println("Lista de tareas");
            System.out.println("Opciones:");
            System.out.println("A - Ver tareas.");
            System.out.println("B - Agregar tarea.");
            System.out.println("C - Modificar tarea.");
            System.out.println("D - Eliminar tarea.");
            System.out.println("0 - Para salir.");
            //Ingreso de datos
            System.out.print("Ingrese una opción: ");
            opcion = teclado.next();

        }

    }

}
