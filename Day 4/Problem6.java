// Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class.
// Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
// 1. int length() – Returns the number of characters.
// 2. char charAt(int index) – Returns the character at the specified index.
// 3. boolean equals(MyString other) – Checks if two MyString objects are equal.
// 4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
// 5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
// 6. MyString substring(int start, int end) – Returns a substring from start to end-1.
// 7. MyString concat(MyString other) – Concatenates another string to the current one.
// 8. boolean contains(MyString sub) – Checks if a substring exists.
// 9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
// 10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.

class MyString {
    private char[] data;
    private int length;

    public MyString(String input) {
        if (input == null) input = "";
        this.length=input.length();
        this.data=new char[length];
        for(int i=0;i<length;i++){
            data[i]=input.charAt(i);
        }
    }

      public MyString(char[] input) {
        if (input == null) input = new char[0];
        this.length = input.length;
        this.data = new char[length];
        for (int i = 0; i < length; i++) {
            data[i] = input[i];
        }
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public boolean equals(MyString other) {
        if (this.length != other.length) return false;
        for (int i = 0; i < length; i++) {
            if (this.data[i] != other.data[i]) return false;
        }
        return true;
    }

    public MyString toUpperCase() {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            if (data[i] >= 'a' && data[i] <= 'z') {
                result[i] = (char)(data[i] - 32);
            } else {
                result[i] = data[i];
            }
        }
        return new MyString(result);
    }

    public MyString toLowerCase() {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                result[i] = (char)(data[i] + 32);
            } else {
                result[i] = data[i];
            }
        }
        return new MyString(result);
    }

    public MyString substring(int start, int end) {
        if (start < 0 || end > length || start > end) {
            throw new IndexOutOfBoundsException();
        }
        char[] result = new char[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = data[i];
        }
        return new MyString(result);
    }

    public MyString concat(MyString other) {
        char[] result = new char[this.length + other.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i];
        }
        for (int i = 0; i < other.length; i++) {
            result[this.length + i] = other.data[i];
        }
        return new MyString(result);
    }

    public boolean contains(MyString sub) {
        int n = this.length;
        int m = sub.length;
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (this.data[i + j] != sub.data[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < length; i++) {
            if (data[i] == ch) return i;
        }
        return -1;
    }

    public MyString replace(char oldChar, char newChar) {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            if (data[i] == oldChar) {
                result[i] = newChar;
            } else {
                result[i] = data[i];
            }
        }
        return new MyString(result);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + data[i];
        }
        return result;
    }
}
public  class Problem6{
    public static void main(String[] args) {
        MyString s1 = new MyString("HelloWorld");
        MyString s2 = new MyString("World");

        System.out.println("s1: " + s1.toString());
        System.out.println("Length: " + s1.length());
        System.out.println("Char at 3: " + s1.charAt(3));
        System.out.println("Equals s2 " + s1.equals(s2));
        System.out.println("UpperCase: " + s1.toUpperCase());
        System.out.println("LowerCase: " + s1.toLowerCase());
        System.out.println("Substring(1,5): " + s1.substring(1, 5));
        System.out.println("Concat with s2: " + s1.concat(s2));
        System.out.println("Contains 'World' " + s1.contains(s2));  
        System.out.println("Index of 'o': " + s1.indexOf('o'));
        System.out.println("Replace 'l' with '*': " + s1.replace('l', '*'));
    }
}
