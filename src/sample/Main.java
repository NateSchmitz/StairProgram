package sample;

import javax.swing.*;

public class Main {
    public static int num_ways(int N){
        num_ways(1);
        return 1;
        num_ways(0);
        return 0;
        }

    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(null,"How many stairs are you climbing?", "Input", JOptionPane.PLAIN_MESSAGE);
        int numInt = Integer.parseInt(numString);
        System.out.println(numInt);
        System.out.println(num_ways());
    }
}
