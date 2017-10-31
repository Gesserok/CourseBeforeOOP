package course.homeworkBeforeOOP.week3.HomeWork312.password;

//3.12*. Строки. Ввод пароля.
//        Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
//        - длинна пароля должна быть от 8 до 20 символов
//        - в пароле должны быть как маленькие так и большие буквы
//        - должны быть цифры
//        - не должен содержать слов 'password', 'pass', 'gfhjkm'
//        - генерировать случайный пароль используя символы: a-z A-Z 0-9


import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserPass user1 = new UserPass(scanner.nextLine());

        System.out.println("Password generation: 1 - Manual, 2 - Automatic");
        switch (scanner.nextLine()) {
            case "1":
                String password = PasswordGeneration.manualPasswordGenerator();
                if (password.equals("Password isn't satisfying the conditions")){
                    System.out.println("Password isn't satisfying the conditions");
                } else {
                    user1.setPassword(password);
                    System.out.println(user1.getPassword() + " is a password for user " + user1.getUser());
                }

            case "2":
                String password1 = PasswordGeneration.automaticPasswordGenerator();
                if (password1.equals("Password isn't satisfying the conditions")){
                    System.out.println("Password isn't satisfying the conditions");
                } else {
                    user1.setPassword(password1);
                    System.out.println(user1.getPassword() + " is a password for user " + user1.getUser());
                }
        }
    }
}
