import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args){

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"

        System.out.println(scottishIslands.get(4));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist

        int scottishIslandNumber = scottishIslands.toArray().length;
        System.out.println(scottishIslandNumber);

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("Alphabetical list " + scottishIslands);


//        9. Print out all the islands using a for loop

        //      System.out.println("all the islands using a for loop");

        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland.toUpperCase());
        }
//         System.out.println(scottishIslands);

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        //System.out.println("numbers: " + numbers);
        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//          for (int i = 0; i < numbers.)
        //List<Integer> evenNumbers = new ArrayList<>();
//         System.out.println("List of Even Numbers");
//          for (Integer number : numbers){
//             if (number % 2 == 0){
//             System.out.println(number);
//             }
//
//          }

//        2. Print the difference between the largest and smallest value
//         Integer smallest = numbers.get(0);
//         Integer largest = numbers.get(0);
//
//         for (Integer i = 1; i < numbers.toArray().length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             } else if (numbers[i] < smallest) {
//                 smallest = numbers[i];
//             }
//         System.out.println(largest - smallest);
//
//         }
//
        int largest = Collections.max(numbers);
        int smallest = Collections.min(numbers);
        int difference = largest - smallest;
        System.out.println("The difference between the largest and smallest number is " + difference);


//        3. Print True if the list contains a 1 next to a 1 somewhere.
        //         ArrayList<Integer> list = new ArrayList<>();
        boolean containsTwoOnes = false;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                containsTwoOnes = true;
                break;
            }
        }
        System.out.println(containsTwoOnes);


//        4. Print the sum of the numbers,

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the numbers is " + sum);
        //           for ( int i = 0; i > numbers.size(); i+= i);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.

        int sumunlucky = 0;
        for (int num : numbers) {
            if (num == 13 || num == 99)
             {
                System.out.println(sumunlucky);
                break;
            }
            sumunlucky += num;

            // ^^ Above usually use a classic loop, so to only exclude the number directly after 13 and not every number
            // appearing as 99 in the given data set, loop will disregard all 99 in another data set.


//          So [2, 7, 13, 2] would have sum of 9.

       }

    }}

