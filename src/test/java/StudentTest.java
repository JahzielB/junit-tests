import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() {
        student = new Student("bob", 5);
    }

    @Test
    public void testId() {
        assertEquals(5, student.getId());
    }

    @Test
    public void testName() {
        assertEquals("bob", student.getName());
    }

    @Test
    public void testGradeMethods() {
        student.addGrade(20);
        student.addGrade(50);
        assertEquals(35, student.getGradeAverage(), 0);
    }
}
