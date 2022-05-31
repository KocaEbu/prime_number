
public class prime_num {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int loop = 0;

            for (int j = 2; j < i; j++) {

                if (i == 2) continue;

                if (i % j == 0) {
                    loop++;
                    break;
                }
            }
            if (loop == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
