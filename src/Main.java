import java.util.*;

public class Main {
    public static void main(String[] args) {

 // ESERCIZIO 1

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
                    if (!wordsSet.add(word)){
                        duplicateSet.add(word);
                    }
                }
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
            System.out.println(wordsSet);
            System.out.println(duplicateSet);
            System.out.println(duplicateSet.size());
        }


        System.out.println("Prima funzione: " + returnRandomNumberList(5));
        System.out.println("Seconda funziona: " + previousAndDouble(returnRandomNumberList(5)));
        System.out.println("Terza funzione: " + evenAndOddPosition(returnRandomNumberList(5)));

    }

    // ESERCIZIO 2

    public static List<Integer>  returnRandomNumberList(int number) {

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int randomNumber = random.nextInt(101);
            randomNumbers.add(randomNumber);
        }

        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public static List<Integer> previousAndDouble(List<Integer> previousList){
        List <Integer> newAndBiggerList = new ArrayList<>(previousList);
        Collections.reverse(previousList);
        newAndBiggerList.addAll(previousList);
        return newAndBiggerList;
    }

    public static List<Integer> evenAndOddPosition(List<Integer> someList) {
       List<Integer> evenAndOddList = new ArrayList<>();
        for (int i = 0; i < someList.size(); i++) {
            if (i% 2 == 0){
                System.out.println("Even position numbers: " + someList.get(i));
            }
        }
        for (int i = 0; i < someList.size(); i++) {
            if (i %2 !=0) {
                System.out.println("Odd position numbers: " + someList.get(i));
            }
        }
        return someList;
    }
}