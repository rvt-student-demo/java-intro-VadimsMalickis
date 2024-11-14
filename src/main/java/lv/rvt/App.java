package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App 
{
    private static void printPersonsFromCSV() throws Exception{



        BufferedWriter writer = Utils.getWriter("persons.csv");
        BufferedReader reader = Utils.getReader("persons.csv");

        writer.write("Peter, 35, 70, 160");
        writer.newLine();
        writer.close();


        ArrayList<Person> personList = new ArrayList<>();
        
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            Person person = new Person(parts[0], new Random().nextInt(30) + 1, Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));

            personList.add(person);

        }
        for (Person person : personList) {
            System.out.println(person);
        }
    }
  
    public static void main(String[] args) throws Exception {
        
        
        
        printPersonsFromCSV();


        // 1. Pārveidot Person klases konstruktoru,
        // lai būtu iespēja uzrādīt 4 parametrus
        // name; age; heigth; weigth
        
        // 1.1 Uzveidot persons.cvs failu un aizpildīt ar datiem
        // Piemērs:
        // name, age, weigth, height
        // John Doe, 28, 70, 175

        // 2. Izlasīt persons.csv failu ar BufferedReader (Utils.getReader())
        // 3. Aizpildīt persons ArrayList masīvu ar Person klases objektiem
        
        // 4. Ar for-each ciklu printēt ArrayList masīva elementus

        // 4.1. Izvadīt vidējo personu vecumu
        
     

        // line.split(", ");
        // String[] parts = {"name", "age", "weigth", "heith"};
        
        // Person pers1 = new Person(parts[0], parts[1], parts[2], parts[3]);
        // persons.add(pers1);

        // Ignore first line of csv
        // reader.readLine();
        // while ((line = reader.readLine()) != null) {
        //     // Izveido Person objektu un ievieto
        //     // ArrayList masīvā šeit
        // }
        // reader.close();
        // String datu tipa salidzināšana
        
    }

    public static void stringMethods() {
         // Useful String methods
        String str = "Hello World";

        // Length of the string
        int length = str.length(); // 5

        // Character at a specific index
        char charAt = str.charAt(0); // W

        // Check if the string contains a sequence
        boolean contains = str.contains("World"); // true


        // Check if the string starts with a prefix
        boolean startsWith = str.startsWith("Hello"); // true

        // Check if the string ends with a suffix
        boolean endsWith = str.endsWith("!"); // false

        // Convert to lowercase
        String lowerCase = str.toLowerCase();

        // Convert to uppercase
        String upperCase = str.toUpperCase();

        // Trim whitespace from both ends
        String trimmed = str.trim(); 

        // Split the string into an array

        // Hello, world, hello, rvt => ["Hello", "world", "hello", "rvt"]
        String[] split = str.split(", ");

        // Check if the string is empty
        boolean isEmpty = str.isEmpty();

        // Compare two strings
        boolean equals = str.equals("Hello, World!");

        // Compare two strings ignoring case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");

        // Convert other types to string
        String valueOf = String.valueOf(123);
    }
    
}

    