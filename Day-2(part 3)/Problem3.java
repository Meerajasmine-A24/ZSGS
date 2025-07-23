// String after reversing to vowels

public class Problem3 {
    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (!isVowel(ch[left])) {
                left++;
            } else if (!isVowel(ch[right])) {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        return new String(ch);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        System.out.println(s1 + " after reversing vowels: " + reverse(s1));
        System.out.println(s2 + " after reversing vowels: " + reverse(s2));
    }
}
