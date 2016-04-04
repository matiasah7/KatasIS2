package Student;

import java.util.Date;

public class Student {
    private static final long MILLISECONDS_PER_SECOND = 1000;
    private static final long MILLISECONDS_PER_MINUTE = MILLISECONDS_PER_SECOND * 60;
    private static final long MILLISECONDS_PER_HOUR = MILLISECONDS_PER_MINUTE * 60;
    private static final long MILLISECONDS_PER_DAY = MILLISECONDS_PER_HOUR * 24;
    private static final long MILLISECONDS_PER_YEAR = (long) (MILLISECONDS_PER_DAY * 365.25);
    
    private String name;
    private Date age;

    public Student(String name, Date age) {
        this.name = name;
        this.age = age;
    }

    public long getAge() {
        long CURRENT_TIME = (long) (new Date().getTime());
        long AGE_MILLISECONDS = CURRENT_TIME - age.getTime();
        return (AGE_MILLISECONDS / MILLISECONDS_PER_YEAR);
    }

       
    
}
