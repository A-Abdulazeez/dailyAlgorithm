public class LowestCommonMultiple {

    public int lowestCommonMultiple(int firstNumber, int secondNumber, int thirdNumber ) {
        int lcm = 0;

        if  (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) lcm = 0;
        if  (firstNumber == 1 || secondNumber == 1 || thirdNumber == 1) lcm = 1;
        if (firstNumber == secondNumber && firstNumber == thirdNumber) lcm = firstNumber;
        for (int index = 1; index <= firstNumber * secondNumber * thirdNumber; index++) {
            if (index % firstNumber == 0 && index % secondNumber == 0 && index % thirdNumber == 0) {
                lcm = index;
                break;
            }
        }

        return  lcm;
    }



}
