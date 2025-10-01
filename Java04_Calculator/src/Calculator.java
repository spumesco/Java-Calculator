public class Calculator {
    int num1 ;
    int num2 ;
    int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        result = num1 + num2;
        return result;
    }

    public int subtract() {
        result = num1 - num2;
        return result;
    }

    public int multiply() {
        for (int i = 0; num2 > i; i++) {
            result += num1;
        }
        return result;
    }

    public int divide() {
        int i = 0;
        int num3 = num1;
        while (true) {
            if (num3 >= num2) {
                num3 -= num2;
                i++;
            } else if (num3 < num2) {
                result = i;
                break;
            }
        }
        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}