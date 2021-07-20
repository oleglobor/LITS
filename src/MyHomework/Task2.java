package MyHomework;
import java.util.Random;


public class Task2 {
    public static int method1(int[] array){
        int min;
        min = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }


    public static int method2(int[] array) {
        int max;
        max = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] >= max)
                max = array[i];
        }
        return max;
    }
    public static int[] method3(int[] array){ //зворотній масив
        int[]a= new int[array.length];
        for (int i = array.length - 1; i >= 0; i --) {



    }
        return array;
    }
    public void method4(int[]array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print((array[i]) + "\t");
        }

    }
    public static void method5(int[]array) {
        for (int i = array.length - 1; i > 1; i--) {
            for (int a = 0; a < i; a++) {
                if (array[a] > array[a + 1]) {
                    int tmp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = tmp;
                }
            }
        }



    }
    public static void main (String[]args){
        Task2 task2 = new Task2();
        Random r = new Random();
        int[] array = new int[20];
        for (int b = 0; b < array.length; b++) {
            array[b] = r.nextInt(47);
        }
        System.out.println("\nMax : " + Task2.method2(array));
        System.out.println("Min : " + Task2.method1(array));
        System.out.print("Reverse array : " + Task2.method3(array));



    }
}
