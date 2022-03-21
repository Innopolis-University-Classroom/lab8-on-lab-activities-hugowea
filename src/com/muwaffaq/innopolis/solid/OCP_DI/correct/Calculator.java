package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

 class Calculator {
    public  double calculate(string operation, double left, double right) {
        double result;
        switch (operation) {
            case "ADD":
                result = left + right;
                break;
            case "SUBTRACT":
                result = left - right;
                break;
            case "MULTIPLICATION": 
                result = left * right;
                break;
            case "DIVIDE":
                result = left / right;
                break;
            default: 
                result = 0.00;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate("ADD", 4, 7);
        calculator.calculate("SUBTRACT", 8, 2);

    }

}
