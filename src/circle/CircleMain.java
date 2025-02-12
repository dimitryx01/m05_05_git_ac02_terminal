/**
 * Proyecto: m05_05_git_ac02_terminal
 * Paquete: [circle]
 * Clase: CircleMain.java
 * Autor: jolmangordillo // DAW PRIMERO // ILERNA
 * Fecha de modificacion: 5 feb 2025
 * Profesor: JOAN
 * Descripción: 

 */
package circle;

/**
 * 
 */
import java.util.Scanner;
public class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius in meters: ");
		double radi = in.nextDouble();
		in.close();
		System.out.println("\nThe area is: " + circle.area(radi));
		
		
	}
}
