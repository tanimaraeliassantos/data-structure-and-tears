public class InsertStartArray {
    int[] intArray = new int[6];
    int length = 0;

    public void insertAtEnd(int value) {
        if (length < intArray.length) {
            intArray[length] = value;
            length++;
        } else {
            System.out.println("array is full");
        }
    }

    public void InsertStartArray(int value) {
        if (length < intArray.length) {
            for (int i = length; i > 0; i--) {
                intArray[i] = intArray[i - 1];
                System.out.println("Index" + i + " contains " + intArray[i]);
            }
            intArray[0] = value;
            length++;
        } else {
            System.out.println("array is full");
        }
    }

    public static void main(String[] args) {
        InsertStartArray myArray = new InsertStartArray();

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(30);
        myArray.insertAtEnd(50);

        System.out.println("Original array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray.intArray[i]);
        }

        myArray.InsertStartArray(4);
        System.out.println("Array after inserting 4 at the beginning: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray.intArray[i]);
        }
    }

}
