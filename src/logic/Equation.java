package logic;

import java.util.Random;

public class Equation {

    private int firstNumber;
    private int secondNumber;
    private char operator;
    private static final char[] OPERATORS = {'+', '-'};
    private static Random random;

    static {
        random = new Random();
    }

    public Equation(int firstNumber, int secondNumber, char operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    //<editor-fold defaultstate="collapsed" desc="properties">
    public int getFirstNumber() {
        return firstNumber;
    }

    public final void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public final void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public final void setOperator(char operator) {
        this.operator = operator;
    }
//</editor-fold>

    public static final Equation getRandomEquation() {
        int a = random.nextInt(1, 11);
        int b = random.nextInt(1, 11);
        char op = getRandomOperator();
        Equation eq = new Equation(a, b, op);
        return eq;
    }

    public final int getResult() {
        int a = this.getFirstNumber();
        int b = this.getSecondNumber();
        char op = this.getOperator();
        int result = calculateResult(a, b, op);
        return result;
    }

    private int calculateResult(int a, int b, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }

    private static char getRandomOperator() {
        return OPERATORS[random.nextInt(OPERATORS.length)];
    }

}
