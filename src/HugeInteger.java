import java.math.BigDecimal;

public class HugeInteger {

    private int[] digits = new int[40];

    public void parse(String number) {
        int start = 40 - number.length();

        for (int index = 0; index < number.length(); index++) {
            char character = number.charAt(index);
            int digit = character - '0';
            digits[start + index] = digit;
        }
    }

    public HugeInteger add(HugeInteger number) {
        BigDecimal firstNumber = new BigDecimal(toString());
        BigDecimal secondNumber = new BigDecimal(number.toString());

        BigDecimal result = firstNumber.add(secondNumber);

        HugeInteger hugeInteger = new HugeInteger();
        hugeInteger.parse(result.toString());

        return hugeInteger;
    }

    public HugeInteger subtract (HugeInteger hugeInteger) {
        BigDecimal firstNumber = new BigDecimal(toString());
        BigDecimal secondNumber = new BigDecimal(hugeInteger.toString());

        BigDecimal result = firstNumber.subtract(secondNumber);

        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse(result.toString());

        return hugeInteger2;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int digit : digits) {
            builder.append(digit);
            builder.append("");
        }
        return builder.toString();
    }

    public boolean isEqualTo(HugeInteger hugeInteger) {
        for (int index = 0; index < 40; index++) {
            if (digits[index] != hugeInteger.digits[index]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger hugeInteger){
        return !isEqualTo(hugeInteger);
    }

    public boolean isGreaterThan(HugeInteger number) {
        for (int index = 0; index < 40; index++) {
            if (digits[index] > number.digits[index]) return true;
            if (digits[index] < number.digits[index]) return false;
        }

        return false;
    }

    public boolean isLessThan(HugeInteger number){
        return !isGreaterThan(number) && !isEqualTo(number);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger){
        return isGreaterThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public boolean isLessThanOrEqualTo(HugeInteger hugeInteger) {
        return isLessThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public boolean isZero(){
        for (int number : digits) {
            if (number != 0) return false;
        }
        return true;
    }

}
