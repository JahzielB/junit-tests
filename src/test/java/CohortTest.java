import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setUp() {
        cohort = new Cohort();
        student1 = new Student("bob", 7);
        student2 = new Student("joe", 8);
        student3 = new Student("tim", 9);
        student1.addGrade(50);
        student1.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(40);
        student3.addGrade(20);
        student3.addGrade(10);
    }

    @Test
    public void testMethods() {
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        cohort.addStudent(student3);
        assertEquals(3, cohort.getStudents().size());
        assertEquals(48.3, cohort.getCohortAverage(), 0.5);
    }
}
