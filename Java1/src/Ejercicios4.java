/*
Elaborado por: Matias Benavides
Fecha: 13-08-2025
Descripción: Programa para hacer ejercicios de Java sobre bucles
 */


import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicios4 {
    public static void main(String[] args) {
        //Ej1
        System.out.println("Ejercicio 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Ej2
        System.out.println("Ejercicio 2:");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        int i = 0;
        do {
            System.out.println(lista.get(i));
            i++;
        } while (i < lista.size());

        //Ej3
        System.out.println("Ejercicio 3:");
        for (int j = 1; j <= 50; j++) {
            if (j % 5 == 0)
                System.out.println(j);
        }
        //Ej4
        System.out.println("Ejercicio 4:");
        int[] numbers = {3, 5, 7, 9, 11};
        int suma = 0;
        for (int num : numbers) {
            suma += num;
        }
        System.out.println(suma);

        //Ej5
        System.out.println("Ejercicio 5:");
        for (int num : numbers) {
            System.out.println(num);
        }

        //Ej6
        System.out.println("Ejercicio 6:");
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 28);
        edades.put("Luis", 34);
        edades.put("Marta", 22);
        for (String nombre : edades.keySet()) {
            System.out.println("Nombre: " + nombre + ", Edad: " + edades.get(nombre));
        }

        //Ej7
        System.out.println("Ejercicio 7:");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        //Ej8
        System.out.println("Ejercicio 8:");
        int[] numeros ={2, 4, 6, -8, 10};
        for (int num : numeros) {
            if (num < 0) {
                break;
            }
            System.out.println(num);
        }
    }
}


