public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);
    }

    private static void task2() {
        System.out.println("Задача 2");
//        String ferstName = "Ivan ";
//        String middleName = "Ivanovich";
//        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
//        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task1() {
        System.out.println("Задача 1");
        String ferstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + ferstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}