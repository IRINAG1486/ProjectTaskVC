/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int a = 34;
        int b = 67;
        //int sum = a + b;
        //System.out.println(sum);
        System.out.println(findSum(a, b));
        System.out.println(findDif(a, b));
        System.out.println(findProduct(a, b));
        
    }
    public static int  findSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int  findDif(int a, int b){
        int dif = a - b;
        return dif;
    }

    public static int  findProduct(int a, int b){
        int prod = a * b;
        return prod;
    }
}