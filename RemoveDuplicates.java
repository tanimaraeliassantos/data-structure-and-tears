public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //si el tamaño de nums es igual a 0, devolver 0
        if (nums.length == 0) return 0;
        //inicializar i en 0
        int i = 0;
        //Recorrer el array j, empezando desde 1, si j es menor que el tamaño del array nums, sumamos un elemento al array
        for (int j = 1; j < nums.length; j++) {
            //si el tamaño del array de j es diferente al tamaño del array de i
            if (nums[j] != nums[i]) {
                //añadir un elemento al array i
                i++;
                //igualar array i a array j
                nums[i] = nums[j];
            }
        }
        //devolver array más 1
        return i + 1;
    }

    public static void main(String[] args) {
        // inicializar array nums con valores
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //definir k como el resultado de ejecutar la función removeDuplicates al array nums
        int k = removeDuplicates(nums);
        //imprimir cuantos elementos están en el array k
        System.out.println("Unique count (k): " + k);
        //imprimir texto del siguiente bucle
        System.out.print("Modified array: ");
        //recorrer el array, iniciando en la posición 0, si el array tiene tamaño menor que k, añadir uno al elemento que se está leyendo
        for (int i = 0; i < k; i++) {
            //imprimir el número de cada posición del array
            System.out.print(nums[i] + " ");
        }
    }
}