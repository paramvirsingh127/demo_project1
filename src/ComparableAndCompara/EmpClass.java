package src.ComparableAndCompara;

public class EmpClass implements Comparable<EmpClass>{
    private int id;
    private String name;
    private int Rollno;
    // we will sort by id than we will implement compareTo() method same class



    public EmpClass(int id, String name, int rollno) {
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
    // ToString method is used to display data of array list

    @Override
    public String toString() {
        return "EmpClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Rollno=" + Rollno +
                '}';
    }

    @Override
    public int compareTo(EmpClass name) {
        return this.getId()-name.getId() ;
    }
}
