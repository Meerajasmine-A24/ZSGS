public class Problem7 {
    public static int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            } else {
                inSegment = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "Hello, my name is John";
        String s2 = "Hello";
        String s3 = "   ";
        System.out.println(countSegments(s1)); 
        System.out.println(countSegments(s2)); 
        System.out.println(countSegments(s3)); 
    }
}
