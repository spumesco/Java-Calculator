import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator addCalc = new Calculator();
        addCalc.setNumbers(10, 20);
        assertEquals(30, addCalc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator subtractCalc = new Calculator();
        subtractCalc.setNumbers(10, 20);
        assertEquals(-10, subtractCalc.subtract());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator multiplyCalc = new Calculator();
        multiplyCalc.setNumbers(20, 10);
        assertEquals(200, multiplyCalc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator divideCalc = new Calculator();
        divideCalc.setNumbers(20, 10);
        assertEquals(2, divideCalc.divide());
    }

    // @org.junit.jupiter.api.Test 는 메소드를 유닛 테스트하는 코드라는 의미로 입력되어 있는 것으로
    // void 뒤의 메소드 이름(add, subtract, multiply, divide 등)이 중요한 것
    // Calculator과 CalculatorTest는 다른 클래스이므로 Main 클래스에서 했던 것처럼
    // Calculator 선언명 = new.Calculator(); 를 선언한 다음
    // 선언명.메소드 이름(); 을 통해 객체를 생성해주어야 함
    // aeesrtEquals(값, 선언명.메소드이름()); 을 통해 생성한 객체(메소드)의 결과값이 값과 같은지 확인하여 테스트하는 방식
    // 값과 메소드의 결과가 다른 값이라면 테스트에 실패한 것으로 간주함

}