class A {
    int a;
    public void print() {
        System.out.println(this);
    }
}

public class Excase5 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
        a1.print();

        A b1 = new A();
        System.out.println(b1);
        b1.print();

    }
}
