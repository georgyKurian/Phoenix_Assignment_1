/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.phoenix;

/**
 *
 * @author c0687988
 */
public class CSD4464Assignment1Phoenix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String stringPower(String word, int number) {
        if (number < 1) {
            return null;
        } else {
            String str = "";
            for (int i = 0; i < number; i++) {
                str = str+word;
            }
            return str;
        }

    }

}
