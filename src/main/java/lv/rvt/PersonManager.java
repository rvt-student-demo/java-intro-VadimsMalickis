package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import lv.rvt.tools.Helper;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String Line;

        reader.readLine();
        
        while ((Line = reader.readLine()) != null) {
            String[] parts = Line.split(", ");

            String name, address;
            int age, weight, height;
            name = parts[0]; address = parts[4];
            age = Integer.valueOf(parts[1]); 
            weight = Integer.valueOf(parts[1]); 
            height = Integer.valueOf(parts[1]); 

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;
    }

    public static void showPersonList() throws Exception{
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

    public static void addPerson(String line) throws Exception{
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
}
