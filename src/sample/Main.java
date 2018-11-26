package sample;

import javax.swing.*;

public class Main {
    int N;
    public static int num_ways(){

        return 100;
        }

    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(null,"How many stairs are you climbing?", "Input", JOptionPane.PLAIN_MESSAGE);
        System.out.println(numString);
        System.out.println(num_ways());
    }
}
