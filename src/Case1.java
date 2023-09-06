class Box {
    int length;
    int width;
    int height;
}
public class Case1 {
    public static void main(String[] args) {

        int[] ar = new int[3];

        ar[0] = 111;
        ar[1] = 222;
        ar[2] = 333;

        System.out.println(ar);
        Box b1 = new Box();
        System.out.println(b1);

        b1.length = 300;
        b1.width = 200;
        b1.height = 100;
    }
}
