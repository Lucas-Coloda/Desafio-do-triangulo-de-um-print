package pyramidChallenge;


import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] itens = {' ', 'x', ' ', '\n'}; // all things to print
        int[] period; //one line its printed in 4 steps: spaces in blanc, 'x', spaces in blank again and a break line at the end
        int lines;

        while (true) {
            System.out.print("Quantas linhas a piramide deve ter? \t");
            lines = input.nextInt();
            period = new int[]{lines, 1, lines, 1}; //initialize parameters defining how big will be the triangle printed

            drawPyramid(lines, period, itens);

            System.out.println("\nDigite zero(0) para sair \n");
            if (lines == 0) {
                break;
            }
        }
    }

    private static void drawPyramid(int lines, int[] period, char[] itens) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = period[j]; k > 0; k--) {
                    System.out.print(itens[j]);
                }
            }
            period = updatePeriod(period);
        }
    }

    private static int[] updatePeriod(int[] period) {
        period[0] -= 1; // decreases the amount of spaces in blank to be printed
        period[1] += 2; // increases the amount of 'x' to be printed
        period[2] -= 1; // decreases the amount of spaces in blank to be printed
        return period;
    }
}
