package p4;

/*
=======Creación de un array aleatorio=======
Realiza un programa que genere un array de números aleatorios DECIMALES. Para ello:
1.- Pide por teclado el número de elementos que tendrá el array. Tienes que pedirlo ANTES de crear el array - recuerda, cuando inicializamos un array, tenemos que decir cuantos elementos va a tener.
2.- Pide por teclado el número mínimo para los valores aleatorios.
3.- Pide por teclado el número máximo para los valores aleatorios.

Una vez que tengas todos estos datos, crea el array en un bucle. A continuación, en otro bucle, imprime el array como:
posición 0: 0,32
posición 1: 5,27
posición 2: 4,31
posición 3: 2,27
*/


import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tamanio = solicitarTamanio();
        int[] arrayAleatorio = new int[tamanio];
        int menor = 0;
        int mayor = 0;
        System.out.printf("Introduce el numero mínimo del array: ");
        menor = sc.nextInt();
        arrayAleatorio[0] = menor;
        System.out.printf("Introduce el numero máximo del array: ");
        mayor = sc.nextInt();
        arrayAleatorio[tamanio-1] = mayor;
        for (int i = 1; i < tamanio; i++) {
            arrayAleatorio[i] = rand.nextInt(menor, mayor);
        }
        for (int i = 0; i < tamanio; i++) {
            System.out.printf("Posición [%d]: %d\n", i, arrayAleatorio[i]);
        }
    }

    public static int solicitarTamanio(){
        Scanner sc = new Scanner(System.in);
        int cantidadArray = 0;
        System.out.print("Ingrese el numero de posiciones que contendrá el array: ");
        cantidadArray = sc.nextInt();
        return cantidadArray;
    }

}
