package p3;

/*
======Chequeo de niveles de poder======
· Crea un array con 5 nombres de Saiyans, y otro array con sus poderes. Por ejemplo,
  en la posición 0 del de nombres puede aparecer Vegeta, en la posición 0 del de poderes, puede aparecer 9000.
· A continuación, en un bucle:
    - Pregunta al usuario de quién quiere conocer el poder.
    - Imprime el poder de ese guerrero si existe; si no existe, imprime "No tengo datos".
    - Pregunta al usuario si quiere preguntar por otro guerrero, o si quiere acabar
· Tras salir del bucle:
    - Calcula el saiyan más fuerte y el más débil.
    - Imprime "El saiyan más fuerte es [nombre] con un poder de [poder]"
    - Imprime "El saiyan más débil es [nombre] con un poder de [poder]"
*/

import java.util.Scanner;

public class Level_Checker {
    public static void  main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String[] Saiyans = new String[5];
        Saiyans[0] = "Goku";
        Saiyans[1] = "Vegeta";
        Saiyans[2] = "Kakaroto";
        Saiyans[3] = "Freezer";
        Saiyans[4] = "Krillin";

        int[] Powers = new int[5];
        Powers[0] = 15000;
        Powers[1] = 12000;
        Powers[2] = 8000;
        Powers[3] = 13000;
        Powers[4] = 7000;

        String saiyanMasFuerte = Saiyans[0];
        String saiyanMasDebil = Saiyans[4];
        int maxPower = Powers[0];
        int minPower = Powers[4];

        int opcion = 0;

        do {
            System.out.println("===========Son Gokupedia===========");
            System.out.println("1. Conocer la lista de Saiyans.");
            System.out.println("2. Conocer poderes de los Saiyans.");
            System.out.println("3. Conocer poderes de un Saiyan en específico.");
            System.out.println("4. Conocer el Saiyan más fuerte y más débil");
            System.out.println("5. Salir del programa.");
            System.out.println("===================================\n");
            System.out.print("Ingrese una opcion: ");
            int opcionMenu = sc.nextInt();
            opcion = opcionMenu;
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("Lista de Saiyans:");
                    for (int i = 0; i < Saiyans.length; i++) {
                        System.out.printf("%d. %s\n", i+1, Saiyans[i]);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Lista de Poderes de los Saiyans:");
                    for (int i = 0; i < Powers.length; i++) {
                        System.out.printf("%d. %s - %d\n", i, Saiyans[i], Powers[i]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Introduce el nombre del Saiyan: ");
                    String busqueda = sc.next();
                    boolean encontrado = false; // bandera

                    for (int i = 0; i < Saiyans.length; i++) {
                        if (busqueda.equalsIgnoreCase(Saiyans[i])) {
                            System.out.printf("El poder de %s es %d\n", Saiyans[i], Powers[i]);
                            if (busqueda.equalsIgnoreCase(saiyanMasDebil)) {
                                System.out.println("Es el Saiyan más débil");
                            } else if (busqueda.equalsIgnoreCase(saiyanMasFuerte)) {
                                System.out.println("Es el Saiyan más fuerte");
                            }
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No tengo datos de ese Saiyan.");
                    }

                    System.out.println("");
                    break;
                case 4:
                    System.out.printf("El Saiyan más fuerte es %s con %d puntos de poder y el más débil es %s con %d puntos de .\n", saiyanMasFuerte, maxPower, saiyanMasDebil, minPower);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.print("Opción introducida no válida. Introduzca un valor válido");
                    break;
            }
        } while (opcion != 5);
    }
}
