public class Main{
    public static void main(String[] args){
      int [] vector= {6,5,8,9,45,32,22};
     System.out.println("Se encontró el la posición: "+busquedaLineal(vector, vector.length,9));

    }

static int busquedaLineal(int vector[], int len, int v){
int i=0;
while (i<len && vector[i]!=v){
    i++;
}
return i <len?i:-1;


}




}