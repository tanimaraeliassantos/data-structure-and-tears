public class LinearSearch {
    public static boolean linearSearch(int[] array, int length, int element) {
        // si el array es nulo o tiene 0 elementos devolver falso
        if (array == null || length == 0) {
            return false;
        }
        //repasar cada elemento del array, para cada elemento empezando desde la posición 0, ir al de la siguiente posición)
        for (int i = 0; i < length; i++) {
            // si el array encuentra el elemento que se espera, devolver true)
            if (array[i] == element) {
                return true;
            }
        }
        //si no hay elementos en el array, devolver false
        return false;
    }
}
