import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 words: ");
        String inputValue = sc.nextLine();
        String[] words = inputValue.split("[ ,]+");
        //System.out.println(Arrays.toString(words));
        /*
        for (String word : words) {
            System.out.println(word);
        }
         */
        System.out.println("Choose the variant: \n" +
                "1-max length макс длина\n" +
                "2-start with первые буквы\n" +
                "3-end with последние буквы\n" +
                "4-contains часть слова\n" +
                "0-exit");
        int variant = sc.nextInt();
        while (true){
            if (variant == 1){
                String longest = Arrays.stream(inputValue.split("[ ,]+")).max(Comparator.comparingInt(String::length)).orElse(null);
                System.out.println(longest.length());
                System.out.println("Input another variant");
                variant = sc.nextInt();
            }
            if (variant == 2){
                char first = inputValue.charAt(0);
                System.out.println(first);
                System.out.println("Input another variant");
                variant = sc.nextInt();
            }
            if (variant == 3){
                int last = inputValue.length()-1;
                char ch = inputValue.charAt(last);
                System.out.println(ch);
                System.out.println("Input another variant");
                variant = sc.nextInt();
            }
            if (variant == 4){
                System.out.println(inputValue.substring(1, inputValue.length()-1));
                System.out.println("Input another variant");
                variant = sc.nextInt();
            /*
            String contains;
            System.out.println((contains = inputValue.substring(0, inputValue.lastIndexOf(':'))).substring(inputValue.lastIndexOf('')));
             */
            }
            if (variant == 0){
                break;
            }
            //System.out.println("Choose another variant");
        }
    }
}
