class Box {
    int length;
    int width;
    int height;

    public void printVolume() {
        int volume = length*height*width;
        System.out.println("Volume: "+ volume);
    }
}

public class Case2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1);

        b1.length = 300;
        b1.width = 200;
        b1.height = 100;

        b1.printVolume();
    }
}
