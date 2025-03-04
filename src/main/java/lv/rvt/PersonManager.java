package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;

import lv.rvt.tools.Helper;

public class PersonManager {

    private static final String delimiter = ", ";

    public void run() {
        
    }

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine(); // Ignorējam titul rindiņu        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(PersonManager.delimiter);

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;
    }

    public static void printPersonTable() throws Exception{
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, weight, height, address");
        personList = PersonManager.getPersonList();

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = 
        Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }

    public static void addPerson(String line) throws Exception {
        String[] parts = line.split(" ");
        
        String name, address;
        int age, weight, height;
        name = parts[0]; address = parts[4];
        age = Integer.valueOf(parts[1]); 
        weight = Integer.valueOf(parts[1]); 
        height = Integer.valueOf(parts[1]); 
        
        Person person = new Person(name, age, weight, height, address);

        addPerson(person);
    }

    public static void sortPersonListBy() {
         ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Jack", "Talsi"));
        personList.add(new Person("John", "Riga"));
        personList.add(new Person("Peter", "Ogre"));
        personList.add(new Person("Andrejs", "Salaspils"));
        personList.add(new Person("Max", "Atašiene"));

        // sort by name vai nu sort by address
    
        // Person objektu sortēšana pēc lauka <address>
        personList.sort(Comparator.comparing(Person::getAddress));

        // Pārbaudam rezultātu pēc sortēšanas
        // for (Person person : personList) {
        //     System.out.println(person.getAddress());
        // }

        // Filtrēšana
        int[] intArr2 = {5, 4, 3, 7, 6, 2};
        String[] stringArr2 = {"John", "Peter", "Ozols", "Ernests", "Jack", "Samuel"};
    }
}
