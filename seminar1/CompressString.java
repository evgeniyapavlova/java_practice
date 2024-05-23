// Напишите метод, который сжимает строку.

// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

public class CompressString {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";

        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                count = 1;
                currentChar = str.charAt(i);
            }
        }

        sb.append(currentChar).append(count);

        return sb.toString();
    }
}
