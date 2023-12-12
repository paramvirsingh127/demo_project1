package src.ifElseCondition;

public class Aggregation {
    int id;
    String name;
    Address address;// Address is a class

    public Aggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("tundla","up","india");
        Aggregation e =new Aggregation(22,"paramvir",address1);
        e.display();
    }

}
