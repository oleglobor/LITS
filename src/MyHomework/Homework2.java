package MyHomework;

import java.util.Random;

public class Homework2 {

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


    public static void array(String[] args) {
        Random r = new Random();
        int [] array = new int[20];
        for (int b = 0; b < array.length; b++) {
            array[b] = r.nextInt(47);
        }

        int min;
            min = array [0];
            for (int i = 1; i < 20; i++) {
                if (array[i] < min)
                    min = array[i];
                }
                System.out.println(min);
    }

    public static void main(String[] args) {
    }

}
