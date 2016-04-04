package Student;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Student student1 = new Student("Soraya", new Date(91,11,16));
        Student student2 = new Student("Matías", new Date(92,11,8));
        Student student3 = new Student("Oscar", new Date(109,1,23));
        System.out.println(student1.getAge());
        System.out.println(student2.getAge());
        System.out.println(student3.getAge());
    }
}
