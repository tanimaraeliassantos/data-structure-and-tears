public class MoveZeroes {
    //pseudocode
    //indicaremos dos pointers para solucionar el problema, uno que
    //lee cada elemento del array y sigue adelante
    // cuando el valor no es cero.
    // El otro pointer que escribe en un array aparte cada
    // elemento del array que no tiene valor cero.
    // Usamos el loop para gestionarlo.
    //Finalizamos añadiendo al array que escribe la cantidad
    //de ceros que complete el array hasta el numero de elementos
    //que tiene el array original
    public static void moveZeroes(int[] nums) {
        int writer = 0;

        for (int reader = 0; reader < nums.length; reader++) {
            if(nums[reader] != 0) {
                nums[writer] = nums[reader];
                writer++;
            }
        }
        while(writer < nums.length) {
            nums[writer] = 0;
            writer++;
        }
    }
}
