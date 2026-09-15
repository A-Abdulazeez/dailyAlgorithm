public class RotateArray {

    public int [] rotateArrayByTwo(int [] array) {
        int [] rotatedArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            if (index + 3 < array.length) {
                rotatedArray[index + 3] = array[index];
            } 
            else {
                rotatedArray[index - (array.length - 3)] = array[index];
            }
        }
        return rotatedArray;
    }
       
}