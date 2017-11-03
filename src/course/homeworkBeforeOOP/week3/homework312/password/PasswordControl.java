package course.homeworkBeforeOOP.week3.homework312.password;


//
// if (compromisedPasswords(str)) {
//         System.out.println("Contains compromised passwords");
//         return false;
//         }


public class PasswordControl {
    public static boolean meetTheConditions(String str) {
//        - длинна пароля должна быть от 8 до 20 символов
//        - в пароле должны быть как маленькие так и большие буквы
//        - должны быть цифры
//        - не должен содержать слов 'password', 'pass', 'gfhjkm'

        if (compromisedPasswords(str) && passwordLength(str) && charConditional(str))
            {
            return true;
        } else return false;
    }


    private static boolean passwordLength (String str) {
        if (str.length() >= 8 && str.length() <= 20) {
            return true;
        } else {
            System.out.println("Password must be between 8 and 20 characters");
            return false;
        }
    }

    private static boolean charConditional (String str) {
        int countDigit = 0;
        int countLowCase = 0;
        int countUpCase = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    countDigit++;
                } else if (Character.isAlphabetic(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                    countLowCase++;
                } else if (Character.isAlphabetic(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                    countUpCase++;
                } else {
                    System.out.println("Containing symbols not satisfying the conditions");
                    return false;
                }
            }
        if (countDigit > 0 && countLowCase > 0 && countUpCase > 0) {
            return true;
        } else {
            System.out.println("Password fault");
            return false;
        }

    }
    private static boolean compromisedPasswords (String str) {
        for (CompromisedPassword x : CompromisedPassword.values()) {

            if (str.toLowerCase().contains(x.toString())) {
                System.out.println("Password contains compromised word");
                return false;
            }
        }
        return true;
    }
}
