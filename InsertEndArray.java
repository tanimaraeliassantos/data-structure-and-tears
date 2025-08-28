public class InsertEndArray {
    int[] intArray = new int[6];
    int length = 0;

    public InsertEndArray() {
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
            System.out.println("Index" + i + " contains " + intArray[i]);
        }
    }

    public static void main(String[] args) {
        InsertEndArray myArray = new InsertEndArray();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray.intArray[i]);
        }
    }

}
