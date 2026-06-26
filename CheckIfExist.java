import java.util.HashSet;

public class CheckIfExist {
    public boolean checkIfExist(int[] array) {
        // Crear lista para guardar los números que ya fueron vistos
        HashSet<Integer> seen = new HashSet<>();
        // Loop cada número del array
        for (int num: array) {
            // si vimos que el array contiene el doble o si contiene la mitad del número
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num /2))) {
                //devolver true
                return true;
            }
            //si no hay match todavía, añadir número a la lista de números
            seen.add(num);
        }
        //si checkeamos el array y no encontramos nada, devolver false.
        return false;
    }
}
