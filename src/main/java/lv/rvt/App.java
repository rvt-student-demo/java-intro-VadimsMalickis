package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
       
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();

        data.add("Alice,1990");
        data.add("Bob,1985");
        data.add("Charlie,1992");
        data.add("Diana,1988");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            data.add(input);
        }
        String[] names = new String[data.size()];
        int[] birthYears = new int[data.size()];

        int index = 0;
        for (String item : data) {
            String[] parts = item.split(",");
            names[index] = parts[0];
            birthYears[index] = Integer.valueOf(parts[1]);
            index++;
        }

        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        int yearsSum = 0;
        for (int year : birthYears) {
            yearsSum += year;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average birth year: " + yearsSum / birthYears.length);
        scanner.close();
    }
}
    