package p1;

/*
====Impostor Among Us====
· Crea un array con 6 jugadores de Among Us - los nombres.
· Utiliza la librería Random para decir cual de ellos es el impostor; será el 0, 1, 2, 3, 4.o 5 en el array.
· Imprime los nombres de los jugadores.
· Pregunta al jugador cual cree que es el impostor - tiene que escribir el nombre.
· Utilizando un bucle for, recupera cual es el nombre del impostor que se calculó al principio.
· Imprime el resultado de la partida.
*/


import java.util.Random;
import java.util.Scanner;

public class ImpostorAmongUs {
    public static void main(String[] args) {
        boolean partida = true;

        String[] players = new String[6];
        players[0] = "Adrian";
        players[1] = "Juan";
        players[2] = "Maria";
        players[3] = "Pedro";
        players[4] = "Marta";
        players[5] = "Sergio";

        String impostor = elegirImpostor(players);
        System.out.println("");

        for (int i = 0; i < players.length; i++) {
            System.out.printf("Jugador %d: %s\n", i+1, players[i]);
        }
        System.out.println("");

        preguntarJugador(players, impostor, partida);

    }

    public  static String elegirImpostor(String[] players){
        Random rand = new Random();
        String impostor = players[rand.nextInt(players.length)];
        System.out.println("(DEBUG) El impostor es: " + impostor);
        return impostor;
    }

    public static void preguntarJugador(String[] players, String impostor, Boolean partida){
        int[] votos = new int[players.length];
        int maxVotos = 0;
        String mayorVotado = "none";
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s, ¿quien crees que es el impostor?: ", players[i]);
            Scanner sc = new Scanner(System.in);
            String respuesta  = sc.nextLine();
            for (int j = 0; j < players.length; j++) {
                if (respuesta.equals(players[j])){
                    votos[j]++;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s tiene %d votos\n", players[i], votos[i]);
            for (int j = 0; j < players.length; j++) {
                if (votos[j] > maxVotos){
                    maxVotos = votos[j];
                    mayorVotado = players[j];
                }
            }
        }
        System.out.printf("El jugador con más votos es: %s. Se procedera a expulsarlo...", mayorVotado);
        if (mayorVotado.equalsIgnoreCase(impostor)){
            System.out.println("¡El expulsado era el impostor! 🎉 Victoria");
            partida = true;
        } else {
            System.out.println("El jugador expulsado no era el impostor 😢 Derrota");
            partida = false;
        }
    }

}
