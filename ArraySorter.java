/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class ArraySorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {5,4,3,2,1};
        int switchNum = 0;
        int stoper = numbers.length;
        for (int i = 0; i < stoper; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print( numbers[j]);
            }
            System.out.println("");
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    switchNum = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = switchNum;
                }
            }
        }
    }

}
