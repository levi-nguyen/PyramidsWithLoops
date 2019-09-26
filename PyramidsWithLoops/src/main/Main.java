/* 
 * Duy Nguyen 
 * nguyed4@mail.uc.eu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
 *     1
 *    222
 *   33333
 *  4444444
 * 555555555  
 */
package main;

public class Main {
    public static void main(String args[]) {
        int lines = 5;
        for (int i = 0; i < lines; i++) {
            String space = "";
            for (int j = 0; j < lines - i ; j++) {
                space += " ";
            }
            System.out.print(space);
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
