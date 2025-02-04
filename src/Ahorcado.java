import java.util.Scanner;
public class Ahorcado{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Declaraciones y asignaciones
        String palabraSecreta = "paralelogramo";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estgructura de control iterativa
        for (int i = 0; i < letrasAdivinadas.length; i ++){
            letrasAdivinadas[i] = '_';
        }
        //Estructura de control iterativa: bucle
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                            //Esto se usa cuando tenemos una palabra de char
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor ");
            //usamos Scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0)) ;
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++){
                //Estructura de control condicional
                if (palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }    
            if (!letraCorrecta){
                    intentos++;
                    System.out.println("Incorrecto, te quedan " + (intentosMaximos - intentos) + "intentos");
                }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                    palabraAdivinada = true;
                    System.out.println("Felicidades.  Has adivinado la palabra secreta " + palabraSecreta);
                }
             
               
                   

    }
    if (!palabraAdivinada){
        System.out.println("Qué lástima.  Te has quedado sin intentos.  GAME OVER");

    }
    scanner.close();

    }
}
