public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        // inicializamos los dos punteros, uno al principio y otro al final
        // uno a la izquierda
        int izq = 0;
        // uno a la derecha
        int der = nums.length - 1;
        // empezamos a recorrer el array mientras el puntero izquierdo sea
        // menor que el puntero derecho
        while (izq < der) {
            // si el valor del puntero izq es impar y el valor del puntero
            // der es par, intercambiamos los valores de ambos punteros
            // en el array de nombre temp
            // luego incrementamos el puntero izq y el puntero der decrementa.
            if (nums[izq] % 2 != 0 && nums[der] % 2 == 0) {
                int temp = nums[izq];
                nums[izq] = nums[der];
                nums[der] = temp;
                izq++;
                der--;
            }
            // si el puntero izq es par, incrementamos el puntero izq
            if (nums[izq] % 2 == 0) {
                izq++;
            }
            // si el puntero der ya es impar,decrementamos el puntero der
            if (nums[der] % 2 != 0) {
                der--;
            }
        }
        return nums;
    }
}
