public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //si el tamaño de nums es igual a 0, devolver 0
        if (nums.length == 0) return 0;
        //inicializar i en 0
        int writer = 1;
        //Recorrer el array j, empezando desde 1, si j es menor que el tamaño del array nums, sumamos un elemento al array
        for (int reader = 1; reader < nums.length; reader++) {
            //si el numero actual es diferente del numero de antes
            if (nums[reader] != nums[reader-1]) {
                //ponerlo en writer
                nums[writer] = nums[reader];
                //añadir un elemento a writer
                writer++;
            }
        }
        //devuelve el número de elementos unicos
        return writer;
    }
}