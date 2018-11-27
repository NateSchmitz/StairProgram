package sample;

import javax.swing.*;

public class Main {
    static double num_ways(int n) {
        double N[] = new double[n + 2];
        int i;
        N[0] = 1;
        N[1] = 1;

        for (i = 2; i <= n; i++) {
            N[i] = N[i - 1] + N[i - 2];
        }

        return N[n];
    }

    static void runner() {

        JOptionPane.showMessageDialog(null, "       Imagine you are walking up a staircase with X number of stairs and you are only able to take 1 OR 2 steps at a time.\n                                                                  How many different ways you can go up this staircase?\nTry and calculate this number in your head or on scratch-paper, click 'ok' to see a useful image to help imagine this scenario", "Welcome!", JOptionPane.PLAIN_MESSAGE);

        ImageIcon iconic = new ImageIcon(Main.class.getResource("image.png"));
        JOptionPane.showMessageDialog(null, "", "", JOptionPane.PLAIN_MESSAGE, iconic);
        String numString = JOptionPane.showInputDialog(null, "How many stairs are you climbing?", "Input", JOptionPane.PLAIN_MESSAGE);
        int numInt = Integer.parseInt(numString);
        System.out.printf("%.0f", num_ways(numInt));
        JOptionPane.showMessageDialog(null, "The possible amounts of ways to take the stairs is:\n" + num_ways(numInt), "Answer", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        runner();
        Object[] options = {"Yes, I did!", "No, I didn't :(", "I want to try one more time!"};

        int choice = JOptionPane.showOptionDialog(null, "Did you get it correct?", "?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
        System.out.println(choice);
        if (choice == 0) JOptionPane.showMessageDialog(null, "Good job!", "Woohoo!", JOptionPane.PLAIN_MESSAGE);

        if (choice == 1)
            JOptionPane.showMessageDialog(null, "Better luck next time!", "Shucks!", JOptionPane.PLAIN_MESSAGE);

        if (choice == 2) {

            String numString = JOptionPane.showInputDialog(null, "How many stairs are you climbing?", "Input", JOptionPane.PLAIN_MESSAGE);
            int numInt = Integer.parseInt(numString);
            System.out.printf("%.0f", num_ways(numInt));
            JOptionPane.showMessageDialog(null, "The possible amounts of ways to take the stairs is:\n" + num_ways(numInt), "Answer", JOptionPane.PLAIN_MESSAGE);

        }
    }
}


