import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {
    // pseudocódigo
    // 1. Iterar a través del arreglo de números.
    // 2. Para cada número, calcular el índice correspondiente (valor actual - 1).
    // 3. Marcar el número en ese índice como negativo para indicar que el número ha
    // aparecido.
    // 4. Después de marcar todos los números, iterar nuevamente a través del
    // arreglo y agregar los índices de los números positivos a la lista de
    // resultados, ya que esos índices representan los números que no aparecieron en
    // el arreglo.
    // 5. Devolver la lista de resultados que contiene los números que no
    // aparecieron en el arreglo.

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int valorActual = Math.abs(nums[i]);
            int indiceDestino = valorActual - 1;

            if (nums[indiceDestino] > 0) {
                nums[indiceDestino] = -nums[indiceDestino];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // Si la posición i es positiva, significa que el número (i + 1) nunca apareció
                resultado.add(i + 1);
            }
        }
        return resultado;
    }
}
