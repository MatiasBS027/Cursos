/*
Elaborado por: Matias Benavides
Fecha: 13-08-2025
Descripción: Este programa declara variables de diferentes tipos de datos,
asigna valores a esas variables, y luego imprime esos valores en la consola. También muestra cómo cambiar el valor de una variable y cómo obtener el tipo de dato de una variable.
 */
public class Ejercicios2 {
    public static void main(String[] args){
        String name = "Matias";
        int age = 20;
        double height = 1.70;
        boolean likesProgramming = true;
        final String EMAIL = "matibs0727";
        char initial = 'M';
        String location = "CR";
        System.out.println("Mi nombre es:"+ name);
        System.out.println("Mi edad es:"+ age);
        System.out.println("Mi altura es:"+ height);
        System.out.println("¿Me gusta programar?:"+ likesProgramming);
        System.out.println("Mi correo es:"+ EMAIL);
        System.out.println("La inicial de mi nombre es:"+ initial);
        System.out.println("Mi ubicación es:"+ location);
        location = "USA";
        System.out.println("Mi nueva ubicación es:"+ location);

        int a = 10;
        int b = 5;
        System.out.println("La suma de " +(a)+ "+" +(b)+ " es: " + (a + b));

        System.out.println(name.getClass().getSimpleName());
        System.out.println(location.getClass().getSimpleName());


    }
}
