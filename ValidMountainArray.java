public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        // si array tiene menos de 3 elementos, false
        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // si loop llega a elemento menor que el tamaño del array Y si el loop va
        // downhill, añadir uno al index del elemento del array.
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }
        // si el pico está en el primer elemento o en el último elemento del array
        // devolver falso
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }
}
