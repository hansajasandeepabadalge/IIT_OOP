import java.util.*;

public class Main {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            total += number;
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.print("The Sum of all the number in the array is " + total);

        // Generics and JCF doesnt support primitive data type
        // that is why they introduce - Wrapper class
        // int - Integer
        // char - Character
        // bool - Boolean
        // double - Double
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(23);
        list.add(15);
        list.add(45);
        list.add(19);
        list.add(13);
        list.add(89);
        list.add(58);

        playWithList(list);

    }

    // Programming to Inerface
    // whereever the super type is need you can pass any of sub type
    public static void playWithList(List<Integer> list){
        for (int number : list) {
            System.out.println(number);
        }

        Collections.sort(list);
        System.out.println(list);
    }
}