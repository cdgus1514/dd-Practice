package dh.study.test;

public interface Calcuator {

    public static int calculate(int operand1, String operator, int operand2) {

        if(operator.equals("+")) {
            return operand1 + operand2;
        }else{
            return 0;
        }
    }
}
