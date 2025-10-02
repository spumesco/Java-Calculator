public class Main {
    public static void main(String[] args) {

        Calculator calc_add =  new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub =  new Calculator();
        calc_sub.setNumbers(5, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        Calculator calc_mul =  new Calculator();
        calc_mul.setNumbers(5, 3);
        calc_mul.multiply();
        calc_mul.displayResult("×");

        Calculator calc_div =  new Calculator();
        calc_div.setNumbers(5, 3);
        calc_div.divide();
        calc_div.displayResult("÷");

        AdvancedCalculator calc_M = new AdvancedCalculator();
        calc_M.setNumbers(10, 2);
        calc_M.multiply();
        calc_M.displayResult("*");

        AdvancedCalculator calc_D = new AdvancedCalculator();
        calc_M.setNumbers(10, 2);
        calc_M.divide();
        calc_M.displayResult("/");
    }
}