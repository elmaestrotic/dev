public class Test{
    static int sols;
    public static void main(String[] args){
  int n=4;
  int[] reinas= new int[n];
  nReinas(reinas, n, 0);

    }


static void nReinas(int [] reinas, int n, int q){
    if(q==n){
        sols++;
        for (int i=0; i <n; i++){
            System.out.print(reinas[i]+" ");
        }
        System.out.println();
    }else{
        for(reinas[q]=0; reinas[q]<n; reinas[q]++){
            if(comprobar(reinas,q)){
                nReinas(reinas, n, q+1);
            }
        }
    }
}


static boolean comprobar(int[] reinas, int q){

for(int i=0; i< q; i++){
    if(reinas[i]==reinas[q]  || Math.abs(i-q) == Math.abs(reinas[i]- Math.abs(reinas[q]))){
        return false;

    }
}
return true;

}

}