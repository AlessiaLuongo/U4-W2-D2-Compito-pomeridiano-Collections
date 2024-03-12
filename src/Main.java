import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words do you want to add?");
        int N = scanner.nextInt();
        scanner.nextLine();
        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        if (N <= 0) {
            System.out.println("The number can not be zero or less");
        } else {
            try {
                for (int i = 0; i < N; i++) {
                    System.out.print("Word " + (i + 1) + ": ");
                    String word = scanner.nextLine();
                    if (wordsSet.contains(word)){
                        duplicateSet.add(word);
                        wordsSet.remove(word);
                    } else {
                        wordsSet.add(word);
                    }
                }
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
            System.out.println(wordsSet);
            System.out.println(duplicateSet);
            System.out.println(duplicateSet.size());
        }

    }
}