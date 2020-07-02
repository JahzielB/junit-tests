import java.util.ArrayList;

public class Student {
    private long Id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.Id = id;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        int counter = 0;
        int total = 0;
        for (Integer grade : this.grades) {
            total += grade;
            counter++;
        }
        return (double) total / counter;
    }
}
