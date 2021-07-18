package MyHomework;

public class homework4 {
    public static void main(String[] args) {
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
            for (int t = 0; t < j.length; t++) {
                System.out.print(j[d][t] + "\t");
                System.out.print("");
            }
            System.out.println();
        }
        System.out.println("значення, які вище діагоналі");
        for (int d = 0; d < j.length - 1; d++) {
            for (int t = 1 + 1; t < j.length; t++) {
                System.out.print(j[d][t] + " ");
            }
        }
        System.out.println();
        System.out.println("значення, які нище діагоналі");
        for (int d = 1; d < j.length; d++) {
            for (int t = 0; t < d; t++) {
                System.out.print(j[d][t] + " ");
            }
        }
    }
}
