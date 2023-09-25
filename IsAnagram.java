
    import java.util.Arrays;

    public class IsAnagram {
        public static boolean isAnagram(String str) {
            String reference = "abcba";
            char[] charArray1 = str.toCharArray();
            char[] charArray2 = reference.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String input = "abcba";

            if (isAnagram(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }


