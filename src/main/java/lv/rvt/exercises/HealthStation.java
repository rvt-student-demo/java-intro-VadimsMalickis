package lv.rvt.exercises;

import lv.rvt.Person;

public class HealthStation {

    private int weightingCount;
    
        public int weigh(Person person) {
            this.weightingCount++;
            return person.getWeight();
        }
    
        public void feed(Person person) {
            person.setWeight(person.getWeight() + 1);
        }
    
        public int weightings() {
            return this.weightingCount;
    }
}
