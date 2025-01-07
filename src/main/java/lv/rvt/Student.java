package lv.rvt;

import lv.rvt.exercises.SimpleDate;

public class Student {

    private String name;
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Student)) {
            return false;
        }
        
        Student comparedStudent = (Student) compared;

        if (this.name.equals(comparedStudent.getName())) {
            return true;
        }
        return false;
    }
}
