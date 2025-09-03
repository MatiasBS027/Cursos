/*
Elaborado por: Matias Benavides
Fecha: 13-08-2025
Descripción: Programa para hacer ejercicios de Java sobre esteructuras
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicios3 {
    public static void main(String[] args){
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        System.out.println(Array.getLength(number));
        System.out.println(number[1]);

        number[1] = 25; // Modifica el segundo elemento del arreglo
        System.out.println(number[1]);

        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println(lista);
        lista.add(1);
        lista.add(100);
        lista.add(200);
        lista.add(300);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);

        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Hola");
        conjunto.add("Mundo");
        System.out.println(conjunto);
        conjunto.add("Hola"); // No se añade porque ya existe
        System.out.println(conjunto);
        conjunto.remove("Mundo");
        System.out.println(conjunto);

        HashMap<String,String> contactos = new HashMap<>();
        contactos.put("Juan", "1235-6789");
        contactos.put("Maria", "9876-5432");
        contactos.put("Pedro", "5555-5555");
        System.out.println(contactos);
        contactos.replace("Juan", "1111-1111");
        System.out.println(contactos);
        contactos.remove("Pedro");
        System.out.println(contactos);


    }
}
