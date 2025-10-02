public class AdvancedCalculator extends Calculator {
    @Override
    public int multiply(){
        result = num1 * num2;
        return result;
        // 계산기 2.0 version 곱하기 기능 개발 완료
        //https://github.com/spumesco/Java-Calculator/issues/2
    }

    @Override
    public int divide(){
        result = num1 / num2;
        return result;
        // 계산기 2.0 version 나누기 기능 개발 완료
        // https://github.com/spumesco/Java-Calculator/issues/3
    }
}