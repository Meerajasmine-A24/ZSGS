public class Problem8 {
    public static boolean isCapital(String word) {
        int Count = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                Count++;
            }
        }

        return Count == word.length() || 
               Count == 0 || 
               (Count == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        String word1 = "USA";
        String word2 = "FlaG";
        String word3 = "Google";

        System.out.println(isCapital(word1));
        System.out.println(isCapital(word2)); 
        System.out.println(isCapital(word3)); 
    }
}
