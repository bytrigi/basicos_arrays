package p2;

/*
====Captura de Pokemon.=====
· Crea un array de tamaño 5, de String, pero no le des valor a ningún.
· En un bucle:
    - Pregunta al usuario el nombre del Pokemon que acaba de capturar.
    - Guárdalo en la posición correcta del array.
    - Después, imprime el nombre de todos los Pokemon, pero en orden inverso.
*/

import java.util.Scanner;

public class Captura_Pokemon {
    public static void main(String[] args) {
        String[] pokemons = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pokemons.length; i++) {
            System.out.printf("Ingrese el %dº pokemon que desea capturar: ", i+1);
            pokemons[i] = sc.nextLine();
        }
        System.out.println("");
        System.out.println("=====Lista de pokemons a capturar=====");
        for (int i = pokemons.length - 1; i >= 0; i--) {
            System.out.printf("Pokemon %d: %s\n", i + 1, pokemons[i]);
        }
    }
}
