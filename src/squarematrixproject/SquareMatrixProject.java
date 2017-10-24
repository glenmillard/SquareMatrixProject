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
        int [][] squarematrix =  {


                      { 10,12,11},


                      { 9,8,31},


                      { 2,16,24},

                     

                    };


        int primaryDiagonalSum = 0, secondaryDiagonalSum = 0;


        int size = squarematrix.length -1;


        for(int i = 0; i<squarematrix.length; i++){


                primaryDiagonalSum += squarematrix[i][i];


                secondaryDiagonalSum+= squarematrix[i][size-i];


        }


          System.out.println(" Primary diagonal sum = " +primaryDiagonalSum);


          System.out.println(" Secondary diagonal sum = " + secondaryDiagonalSum);


        }
    }
    
