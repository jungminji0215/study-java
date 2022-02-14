package basic.stringclass;

public class StringAndIntEx01 {
    public static void main(String[] args) {
        // 숫자를 String으로 변환하는 방법1
        int iVal = 100;
        String strVal = String.valueOf(iVal); // "100"

        // 숫자를 String으로 변환하는 방법2
        double dVal = 200.0;
        String strVal2 = dVal + ""; // "200.0"

        // 문자를 숫자로 바꾸기1
        double sum1 = Integer.parseInt("" + strVal) + Double.parseDouble(strVal2);

        // 문자를 숫자로 바꾸기2
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum1); // join() 은 내부적으로 StringBuffer을 사용함
        System.out.println(strVal + "+" + strVal2 + "=" + sum2); // 이렇게 문자열을 계속 결합하는 것은 객체가 계속 만들어짐

    }
}
