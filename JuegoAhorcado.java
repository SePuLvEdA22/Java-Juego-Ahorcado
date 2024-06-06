import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }


        while (!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " Letras)");

            System.out.print("Introduce una letra por favor: ");
            char letra = scanner.next().charAt(0);
            Character.toLowerCase(letra);

            boolean letraCorrecta = false;

            for (int j = 0; j < palabraSecreta.length(); j++) {
                if(palabraSecreta.charAt(j) == letra){
                    letrasAdivinadas[j] = letra;
                    letraCorrecta = true;
                
            }
                
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorreccta, te quedan un total de " + (intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra correcta " + palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Te has quedado sin intentos.");
        }
        scanner.close();
        }
    }
