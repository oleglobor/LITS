package MyHomework;

public class Task4 {
    public static void iWasvorn(int month) {

        switch (month) {
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

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.iWasvorn(1);
    }
}
