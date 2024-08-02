public class Main {

    public static void main(String[] args) {
        int[] vector = { 4, 7, 5, 2, 85, 9, 22 };
         
        System.out.println("Se encontró en la pos: "+busquedaLineal(vector, vector.length, 85));

        int []vector2= { 2, 4, 5,  85, 90 };
        System.out.println("Se encontró en la pos: "+busquedaBinaria(vector2, vector2.length, 5));

    }

    int busquedaLineal(int[] vector, int len, int v) {
        int i = 0; // Asignación: 1 unidad de tiempo
        while (i < len && vector[i] != v) { // Comparación y acceso al array: 4n unidades de tiempo
            i++; // Operación aritmética: 2n unidades de tiempo
        }
        return i < len ? i : -1; // Comparación y asignación: 2 unidades de tiempo
    }


static int busquedaBinaria(int[] vector, int len, int v) {
    int j = len - 1; // Asignación: 1 unidad de tiempo
    int i = 0; // Asignación: 1 unidad de tiempo
    int k = 0; // Asignación: 1 unidad de tiempo
    boolean enc = false; // Asignación: 1 unidad de tiempo

    while (i <= j && !enc) { // Comparación: 2 log(n) unidades de tiempo
        k = (i + j) / 2; // Operación aritmética: 1 log(n) unidad de tiempo
        if (vector[k] == v) { // Acceso al array y comparación: 2 log(n) unidades de tiempo
            enc = true; // Asignación: 1 unidad de tiempo
        } else {
            if (vector[k] < v) { // Acceso al array y comparación: 2 log(n) unidades de tiempo
                i = k + 1; // Operación aritmética y asignación: 2 log(n) unidades de tiempo
            } else {
                j = k - 1; // Operación aritmética y asignación: 2 log(n) unidades de tiempo
            }
        }
    }
    return enc ? k : -1; // Comparación y asignación: 2 unidades de tiempo
}


}