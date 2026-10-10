import java.util.Scanner;
/**
* Programa Psicólogo
* Objetivo desarrollar un programa que simule una conversación entre el psicólogo y el usuario.
* @author Jennyfer Ramos Montes  324182543
* @version 3a edición
*/

public class Psicologo{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Bienvenido, cual es su nombre?");
     String nombre = scanner.nextLine();
     System.out.println("Buenas tades "+nombre);
     System.out.println("Digame, cuál es su problema en la vida?");
     String problema = scanner.nextLine();
     System.out.println(" MMMM... ya veo");
     System.out.println(" Y dime ...");
     System.out.println(" ¿por qué dice '"+problema+ "'?");
     String respuesta = scanner.nextLine();
     System.out.println("Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión");
    }

    }
