package MyHomework;

import java.util.Random;

public class HomeworkLits2 {

//завдання 1

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
    public static void main(String[] args) {
        iWasvorn(1); //це до завдання 4

        String str = "atta";

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
        System.out.println();
//завдання 2
        Random r = new Random();
        int[] array = new int[20];
        System.out.print("масив ");
        for (int b = 0; b < array.length; b++) {
            array[b] = r.nextInt(47);
            System.out.print((array[b]) + "\t");
        }
        System.out.println("");
        int min;
        min = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("найменше число " + min);

        int max;
        max = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] >= max)
                max = array[i];
        }
        System.out.println("найбільше число " + max);

        System.out.print("зворотній масив ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print((array[i]) + "\t");
        }
        System.out.println("");
        System.out.print("непарні елементи масиву ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print((array[i]) + "\t");
        }
        System.out.println("");  System.out.println("Привіт. Це сортування");
        for (int i = array.length - 1; i > 1; i--) {
            for (int a = 0; a< i; a++) {
                if (array[a] > array[a+ 1])  {
                    int tmp = array[a];
                    array[a] = array[a+1];
                    array[a+1] = tmp;
                }
            }
            System.out.print((array[i]) + "\t");
        }
//завдання 3
        int[][] j = {{1, 5, 7, 32, 65, 5, 23, 45, 75, 1},
                {33, 44, 12, 32, 4, 5, 12, 3, 4, 1},
                {99, 2, 4, 21, 35, 67, 86, 32, 2, 4},
                {12, 43, 54, 22, 6, 774, 2, 2, 4, 1},
                {12, 34, 12, 2, 0, 12, 40, 42, 12, 3},
                {55, 34, 52, 61, 71, 863, 46, 87, 34, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {99, 32, 6, 8, 3, 236, 78, 568, 54, 23},
                {1, 3, 5, 7, 9, 11, 12, 13, 15, 17}};
        for (int d = 0; d < j.length; d++) {
            for (int t = 0; t< j.length; t++)
                System.out.print(j[d][t] + "\t");
        }

    }
    //завдання 4
    public static void iWasvorn(int month){

        switch (month){
            case 1:
                System.out.println("я народився в січні");
                break;
            case 2:
                System.out.println("я народився в лютому");
                break;
            case 3:
                System.out.println("я народився в березні");
                break;
            case 4:
                System.out.println("я народився в квітні");
                break;
            default:
                System.out.println("некоректний місяць");
                break;
        }
    }

}
