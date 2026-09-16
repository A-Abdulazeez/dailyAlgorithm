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

    public void add (HugeInteger hugeInteger) {}

    public void subtract (HugeInteger hugeInteger) {}

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int digit : digits) {
            builder.append(digit);
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isEqualTo(HugeInteger firsthugeInteger, HugeInteger secondhugeInteger) {
        for (int index = 0; index < 40; index++) {
            if (firsthugeInteger.digits[index] != secondhugeInteger.digits[index]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger firsthugeInteger, HugeInteger secondhugeInteger){
        return !isEqualTo(firsthugeInteger, secondhugeInteger);
    }

    public boolean isGreaterThan(HugeInteger number){
        return true;
    }
    public boolean isLessThan(HugeInteger number){
        return true;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger number){
        return true;
    }
    public boolean isLessThanOrEqualTo(HugeInteger number){
        return true;
    }

    public boolean isZero(){
        return true;
    }
    
}
