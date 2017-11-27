/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_02 {

    
    public static void main(String[] args) {
        int[] array = new int[10];

		// Prompt the user to enter ten integers
		System.out.print("Ingrese diez enteros: ");

		// fill the array
		fill(array);

		// Display integers in reverse order
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	/** Method fill */
	public static void fill(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) 
			array[i] = input.nextInt();
	}
}
    

