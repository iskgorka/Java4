import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input minimum 3 words: ");
        String inputValue = sc.nextLine();
        String[] words = inputValue.split(",");
        System.out.println("Choose the variant:\n" +
                "1-max length\n" +
                "2-start with\n" +
                "3-end with\n" +
                "4-contains\n" +
                "0-exit");
        int variant = sc.nextInt();
        while (variant != 0) {
            if (variant == 1) {
                int maxLength = 0;
                String longestString = null;
                for (String word : words) {
                    if (word.length() > maxLength) {
                        maxLength = word.length();
                        longestString = word;
                    }
                }
                System.out.println("The longest word is " + longestString);
                System.out.println("Choose the variant:\n" +
                        "1-max length\n" +
                        "2-start with\n" +
                        "3-end with\n" +
                        "4-contains\n" +
                        "0-exit");
                variant = sc.nextInt();

            } else if (variant == 2) {
                System.out.println("Input the beginning of the string: ");
                String startWith = sc.next();
                for (String word : words) {
                    if (word.startsWith(startWith)) {
                        System.out.println("Yes, the '" + word + "' starts with " + startWith);
                    }
                }
                System.out.println("Choose the variant:\n" +
                        "1-max length\n" +
                        "2-start with\n" +
                        "3-end with\n" +
                        "4-contains\n" +
                        "0-exit");
                variant = sc.nextInt();

            } else if (variant == 3) {
                System.out.println("Input the end of the string: ");
                String endWith = sc.next();
                for (String word : words) {
                    if (word.endsWith(endWith)) {
                        System.out.println("Yes, the '" + word + "' ends with " + endWith);
                    }
                }
                System.out.println("Choose the variant:\n" +
                        "1-max length\n" +
                        "2-start with\n" +
                        "3-end with\n" +
                        "4-contains\n" +
                        "0-exit");
                variant = sc.nextInt();

            } else if (variant == 4) {
                System.out.println("Input some text: ");
                String part = sc.next();
                for (String word : words) {
                    if (word.contains(part)) {
                        System.out.println("Yes, the '" + word + "' contains " + part);
                    }
                }
                System.out.println("Choose the variant:\n" +
                        "1-max length\n" +
                        "2-start with\n" +
                        "3-end with\n" +
                        "4-contains\n" +
                        "0-exit");
                variant = sc.nextInt();
            }
        }
    }
}