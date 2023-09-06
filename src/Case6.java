class Box {
    int length;
    int width;
    int height;

    // Default COnstructor
    Box() {   //  No return type, must be class name
        length = 10;
        width = 34;
        height = 45;
    }

    public int getVolume() {
        int volume = length*height*width; // local Variable
        return volume;
    }

    public void printVolume() {
        int volume = length*height*width;
        System.out.println("Volumee: "+ volume);
    }
}


public class Case6 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1);
        System.out.println("Volume: "+ b1.getVolume());
        b1.printVolume();

        System.out.println("Length: " + b1.length);
        System.out.println("Width: " + b1.width);
        System.out.println("Heith: " + b1.height);
    }
}
