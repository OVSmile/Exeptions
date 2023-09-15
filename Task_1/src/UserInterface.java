
import java.util.Scanner;

    public class UserInterface {
        public static void dataEntry() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите данные пользователя в формате:");
            System.out.println("Фамилия Имя Отчество номер_телефона");
//            System.out.println("пол - символ латиницей f или m");
//            System.out.println("дата_рождения - строка формата dd.MM.yyyy");
            System.out.println("номер_телефона - в формате 79999999999");
            System.out.println("Или введите exit для выхода");
            boolean run = true;
            while (run) {
                String[] arr = in.nextLine().split(" ");
                if (arr[0].equalsIgnoreCase("exit")) {
                    break;

                }
                MessageHandler.arrayEnteredData(arr);
            }
        }
    }
