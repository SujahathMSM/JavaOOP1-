class Student{
    String id;
    String name;
    int sub1;
    int sub2;

    Student() {
        id = "190836C";
        name = "Sujahath";
        sub1 = 98;
        sub2 = 89;
    }

    Student (String id, String name) {
        this.id = id;
        this.name = name;
        sub1 = -1;
        sub2 = -1;
    }

    Student (String id, String name, int sub1, int sub2) {
        this.id = id;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void printDetails() {
        System.out.println("Id: " + id+ "\nName: " + name+ "\nSub1: "+ sub1+"\nSub2: "+sub2);
    }

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}

public class Constructoroverload {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printDetails();
        System.out.println("----------#####----------");
        Student s2 = new Student("190836T", "Rahman");
        s2.printDetails();
        System.out.println("----------#####----------");
        Student s3 = new Student("190836F", "Siddeek", 78, 89);
        s3.printDetails();
        System.out.println("----------#####----------");
        Student s4 = new Student("190837T", "Saiyaf");
        s4.setMarks(98, 99);
        s4.printDetails();

    }
}
