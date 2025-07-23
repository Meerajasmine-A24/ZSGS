// pattern printing using while k

public class Problem3a {
    public static void main(String[] args) {
        int i = 0;
        int val = 1;
        
        while (i < 5) {
            int end = (i < 3) ? i : 5 - i - 1;
            int spaces = 2 - end;
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }
            int j = 0;
            while (j <= end) {
                System.out.print(val + " ");
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
