package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

import lv.rvt.exercises.PersonManager;

public class App 
{

    public static void main(String[] args) throws Exception {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, choose your command: ");
        System.out.println("show - shows all persons");
        System.out.println("add - add a person");
        System.out.println("exit - add a person");
        System.out.println("help - see available command");
        
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
                for (Person person : persons) {
                    System.out.println(person);
                }
            }
            else if (command.equals("add")) {
                System.out.println("Please enter name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter weigth: ");
                int weigth = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter heigth: ");
                int heigth = Integer.valueOf(scanner.nextLine());
        
                Person person = new Person(name, age, weigth, heigth);
                PersonManager.addPerson(person);
            }
            else if (command.equals("help")) {
                System.out.println("show - shows all persons");
                System.out.println("add - add a person");
                System.out.println("exit - add a person");
                System.out.println("help - see available command");
            }
            else if (command.equals("exit")) {
                break;
            }
        }

        System.out.println("Bye bye!");




    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }


    public static void modify(int value) {
        value += 5;
    }

  

   

}
