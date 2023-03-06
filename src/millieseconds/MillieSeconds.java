/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millieseconds;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MillieSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of milliseconds: ");
        long milliseconds = scanner.nextLong();

        long hours = milliseconds / 3600000;
        milliseconds = milliseconds % 3600000;

        long minutes = milliseconds / 60000;
        milliseconds = milliseconds % 60000;

        long seconds = milliseconds / 1000;

        System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
    
}
