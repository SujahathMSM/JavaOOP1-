class Student {
    String id;
    String name;
    int sub1;
    int sub2;

    public void setValue(String stId, String stName, int stSUb1, int stSub2) {
        id = stId;
        name = stName;
        sub1 = stSUb1;
        sub2 = stSub2;
    }

    public void printStudent() {
        System.out.println("Id: "+ id+ "\n" + "Name: "+ name +"\n"+ "Sub1: " + sub1 + "\n" +"Sub2: "+ sub2 );
    }

    public int total() {
        return sub1+sub2;
    }

    public double avg() {
        return (double) (sub1+sub2) /2 ;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValue("190836C", "Sujahath", 99, 98);

        Student s2 = new Student();
        s2.setValue("190836F", "Siddeek", 93, 91);

        s1.printStudent();
        System.out.println("-----------------");
        s2.printStudent();


        System.out.println("Total S1: " + s1.total());
        System.out.println("Average S1: " +s1.avg() );
        System.out.println("-------------------------");
        System.out.println("Total S2: " + s2.total());
        System.out.println("Average S2: " +s2.avg() );
    }
}
