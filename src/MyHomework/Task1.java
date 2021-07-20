package MyHomework;

public class Task1 {
        static boolean isPalindrome(String word) {

            int i = 0, j = word.length() - 1;

            while (i < j) {


                if (word.charAt(i) != word.charAt(j))
                    return false;

                i++;
                j--;
            }

            return true;

        }
    public static void main (String[]args){
        System.out.println(isPalindrome("taat"));
    }

}
