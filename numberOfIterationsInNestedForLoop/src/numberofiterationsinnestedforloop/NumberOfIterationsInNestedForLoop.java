/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofiterationsinnestedforloop;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class NumberOfIterationsInNestedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = computerKeyboardInput.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
            for (int k = 1; k < n - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
