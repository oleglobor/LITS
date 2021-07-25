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
    public static int[] method3(int[] a){ //зворотній масив
        int[]arr= new int[a.length];
        for (int i = a.length - 1; i >0;) {
            for (int j = 0; j < a.length; j++) {
                arr[j] = a[i];
                i--;
            }

    }
        return arr;
    }
    public static void method4(int[] a) {
        System.out.print("\nOdds : " );
        for (int i = 0; i < a.length; i++) {
            if ((i+1) % 2 != 0)
                System.out.print((a[i]) + "\t");
        }

    }
    public static void method5(int[]a) {
        System.out.print("\nDrink beer, i sort it: ");
        for (int i = a.length - 1; i > 1; i--) {
            for (int b = 0; b < i; b++) {
                if (a[b] > a[b + 1]) {
                    int tmp = a[b];
                    a[b] = a[b + 1];
                    a[b + 1] = tmp;
                }
            }
            System.out.print((a[i]) + "\t");
        }




    }
    public static void outputArray(int[] a) {
        for (int arr : a) {
            System.out.print(arr + " ");
        }
    }
    public static void main (String[]args){
        Task2 task2 = new Task2();
        Random r = new Random();
        int[] a = new int[20];
        System.out.println("Array :");
        for (int b = 0; b < a.length; b++) {
            a[b] = r.nextInt(47);
            System.out.print((a[b])+ "\t");
        }
        System.out.println("");
        System.out.println("Max : " + Task2.method2(a));
        System.out.println("Min : " + Task2.method1(a));
        System.out.print("Reverse array : " );
        Task2.outputArray(Task2.method3(a));
        Task2.method4(a);
        Task2.method5(a);



    }
}
