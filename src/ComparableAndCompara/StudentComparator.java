package src.ComparableAndCompara;

public class StudentComparator {
    private int id;
    private String name;
    private int Rollno;

    public StudentComparator(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        Rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Rollno=" + Rollno +
                '}';
    }
}
