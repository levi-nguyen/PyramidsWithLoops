/* 
 * Duy Nguyen
 * nguyed4@mail.uc.eu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555  
*/
package main;

public class Main {
	public static void main(String args[]) {        
	 for (int i = 1; i < 5; i++) {
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	    }
	}

