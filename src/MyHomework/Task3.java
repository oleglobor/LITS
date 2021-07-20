package MyHomework;

public class Task3 {
public static void Array(int[][] i){
    for (int d = 0; d < i.length; d++) {
        for (int t = 0; t < i.length; t++)
            System.out.print(i[d][t] + "\t");
        System.out.println();
    }
}
public void method1(int[][] i){
    System.out.println("значення, які вище діагоналі");
    for (int d = 0; d < i.length - 1; d++) {
        for (int t = 1 + 1; t < i.length; t++) {
            System.out.print(i[d][t] + " ");
        }
    }
}
    public static void method2(int[][] i){
        System.out.println("значення, які нище діагоналі");
        for (int d = 1; d < i.length; d++) {
            for (int t = 0; t < d; t++) {
                System.out.print(i[d][t] + " ");
            }
        }
    }
    public static void main(String[] args) {
    Task3 task3 = new Task3();

        int[][] i = {{1, 5, 7, 32, 65, 5, 23, 45, 75, 1},
                {33, 44, 12, 32, 4, 5, 12, 3, 4, 1},
                {99, 2, 4, 21, 35, 67, 86, 32, 2, 4},
                {12, 43, 54, 22, 6, 774, 2, 2, 4, 1},
                {12, 34, 12, 2, 0, 12, 40, 42, 12, 3},
                {55, 34, 52, 61, 71, 863, 46, 87, 34, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {99, 32, 6, 8, 3, 236, 78, 568, 54, 23},
                {1, 3, 5, 7, 9, 11, 12, 13, 15, 17}};

        System.out.println("Діагоналі");
        Task3.Array(i);
        task3.method1(i);
        task3.method2(i);


    }
}
