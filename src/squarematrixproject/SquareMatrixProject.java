/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarematrixproject;

/**
 *
 * @author Glen Millard
 */
public class SquareMatrixProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] squarematrix =  {{ 10,12,11},{ 9,8,31},{ 2,16,24}}; //initalize the 3x3 matrix

        int primaryDiagonalSum = 0, secondaryDiagonalSum = 0; //initalize the variables

        int size = squarematrix.length -1; //size of the matrix

        for(int i = 0; i < squarematrix.length; i++){ //using a for loop to do the calculations

                primaryDiagonalSum += squarematrix[i][i];

                secondaryDiagonalSum += squarematrix[i][size-i];

        }

          TextIO.putln("Primary diagonal sum = " + primaryDiagonalSum); //print out the results

          TextIO.putln("Secondary diagonal sum = " + secondaryDiagonalSum); //print out the results

        }
    }
    
