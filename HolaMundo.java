import java.util.Scanner;

public class HolaMundo {
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.println("Hola Mundo");
    System.out.println("Bienvenido al curso de EDA");
    System.out.print("Ingrese su nombre: ");
    String name= scn.nextLine();
    System.out.println(name);
  }
  

}
