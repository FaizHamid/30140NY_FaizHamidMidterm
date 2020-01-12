package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
            int seq = 40;
            for (int i = 1; i <= seq; i++) {
                System.out.print(fib(i) + " "); // 1 1 2 3 5
            }
        }

        public static int fib(int num){
            if (num == 0) {
                return 1;
            }
            if (num == 1) {
                return 1;
            }
            if (num == 2){
                return 1;
        }
        return fib(num -1) + fib (num -2);
        }

    public static void Fib(int i) {
    }
}

