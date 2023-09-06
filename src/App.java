//--------------Student.java------------------

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
}


class App {
    public static void main(String[] args) {
        Student s1; // create a reference variable
        s1 = new Student(); // creating an Object "Student"

        // s1.id = "190836C";
        // s1.name = "Sujahath";
        // s1.sub1 = 98;
        // s1.sub2 = 97;

        s1.setValue("190836C", "Sujahath", 99, 98);

        Student s2 = new Student();

        // s2.id = "190836F";
        // s2.name = "Siddeek";
        // s2.sub1 = 93;
        // s2.sub2 = 91;

        s2.setValue("190836F", "Siddeek", 93, 91);

        System.out.println("Id: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Sub1: "+ s1.sub1);
        System.out.println("Sub2: "+ s1.sub2);

        System.out.println("----------------------------\n");

        System.out.println("Id: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Sub1: "+ s2.sub1);
        System.out.println("Sub2: "+ s2.sub2);
    }
}
  