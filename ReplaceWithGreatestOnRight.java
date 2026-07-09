public class ReplaceWithGreatestOnRight {
    public int[]replaceElements(int[] array) {
        //empezar loop en el final del array
        int maxHastaAhora = -1;

        //recorrer array al revés
        for (int i = array.length - 1; i >= 0; i--) {
            //guardar el valor antes de borrarlo en array temp
            int temp = array[i];
            //reemplazamos el valor con el número más grande hasta ahora
            array[i] = maxHastaAhora;
            //comparamos el valor original con el número más grande anotado
            if(temp > maxHastaAhora) {
                maxHastaAhora = temp;
            }
        }
        //al terminar, devolver array modificado
        return array;
    }
}
