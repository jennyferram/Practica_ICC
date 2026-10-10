import java.util.Scanner;
/**
* Programa para utilizar métodos de manipulación de cadenas de caracteres.
* Objetivo desarrollar un programa en Java que solicite el nombre completo y la fecha de nacimiento de una persona para crear el RFC
* @author Jennyfer Ramos Montes  324182543
* @version 3a edición
*/
public class RFC{
  public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   String nombreCompleto;
   String fecha;

   //Nombre  completo del usuario
   System.out.println("Ingrese su nombre completo: ");
   nombreCompleto = in.nextLine();
   int posicion = nombreCompleto.indexOf(" ");
   int posicion2 = nombreCompleto.indexOf(" ", posicion + 1);

   String nombre = nombreCompleto.substring(0,posicion);
   String aPaterno = nombreCompleto.substring(posicion + 1, posicion2);
   String aMaterno = nombreCompleto.substring(posicion2 + 1);

   nombre = nombre.toUpperCase();
   aPaterno = aPaterno.toUpperCase();
   aMaterno = aMaterno.toUpperCase();

   char nombreLetra = nombre.charAt(0);
   String aPaternoLetras = aPaterno.substring(0,2);
   char aMaternoLetra = aMaterno.charAt(0);

   //Fecha de naciento

   System.out.println("Ingrese su fecha de nacimiento en el siguiente formato dd/mm/aa ");
   fecha = in.nextLine();

  String dia = fecha.substring(0,2);
  String mes = fecha.substring(3,5);
  String anio = fecha.substring(6,8);


 System.out.println("El RFC de " + nombreCompleto + " es: "+ aPaternoLetras + aMaternoLetra + nombreLetra + anio + mes + dia);




}

}
