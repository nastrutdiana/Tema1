import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //example1();
//        MyClass m = new MyClass(1,2);
//        m.sayHello();
//        String s = m.returnHello("Alex");
//        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];

        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m1[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] sumMatrix = new int[n][n];
        int[][] productMatrix = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                sumMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                for(int k=0; k<n; k++){
                    productMatrix[i][k] += m1[k][i] * m2[k][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(sumMatrix[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void example1(){
        int a = 5;
        double b = 5.5;
        float c = 2.4f;
        char d = 'a';
        boolean e = true;

        Integer a1 = a;

    }
}
