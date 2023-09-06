class Box {
    int length;
    int width;
    int height;

    // Parameterised COnstructor
    Box(int length, int width, int height) {   //  No return type, must be class name
        this.length = length;
        this.width = width;
        this.height = height;
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



public class Case6paramterisedconst {
    public static void main(String[] args) {
        Box b1 = new Box(12, 24, 34);
        b1.printVolume();

        System.out.println("Length: " + b1.length);
    }
}
