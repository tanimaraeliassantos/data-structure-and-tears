public class ThirdMaximumNumber {
    //pseudocódigo
    //1. Inicializar tres variables para almacenar los tres máximos valores distintos.
    //2. Iterar a través del arreglo de números.
    //3. Para cada número, verificar si es mayor que el primer máximo y distinto de los otros dos máximos. Si es así, actualizar los tres máximos.
    //4. Si el número es mayor que el segundo máximo y distinto del primer máximo, actualizar el segundo y tercer máximo.
    //5. Si el número es mayor que el tercer máximo y distinto de los otros dos máximos, actualizar el tercer máximo.
    //6. Al final de la iteración, si el tercer máximo es distinto de los otros dos, devolverlo. De lo contrario, devolver el primer máximo.
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer num : nums) {
            if(num.equals(max1) || num.equals(max2) || num.equals(max3)) {
                continue;
            }
            if(max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if(max3 == null || num > max3) {
                max3 = num;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
