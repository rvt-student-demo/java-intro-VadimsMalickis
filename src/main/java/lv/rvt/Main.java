package lv.rvt;

public class Main 
{

    public static void main(String[] args) throws Exception {  
        
        Person person = new Person("John");

        System.out.println(person instanceof Object);
    }

    
    private static void modify(Person person) {
        person.setName("Modified!");
    }


    private static void modify(int value) {
        value += 5;
    }

  

   

}
