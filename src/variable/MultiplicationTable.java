package variable;



public class MultiplicationTable {
    public static void main(String[] args) {
        printNumbers(9);
        printSquaresOfNumbers(9);
        printMultiplicationTable(6);
        System.out.println(Sum(1,2,3));
    }

    // 1부터 n까지 차례대로 출력
    public static void printNumbers(int n){
        for(int i=1; i<n+1; i++){
            System.out.println(i);
        }
    }

    public static void printSquaresOfNumbers(int n){
        for(int i=1; i<n+1; i++){
            System.out.println(i*i);
        }
    }

    public static void printMultiplicationTable(int n){
//        for(int i =1; i<n; i++){
//            for(int j =1; j < 10; j++)
//                System.out.println(i + "*" + j + "=" + i*j);
//        }

        for(int j =1; j < 10; j++)
            System.out.println(n + "*" + j + "=" + n*j);

    }

    public static int Sum(int a, int b, int c) {
        int sum =0;
        sum = a + b+ c;
        return sum;
    }
}
