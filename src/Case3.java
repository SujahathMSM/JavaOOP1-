class Box {
    int length;
    int width;
    int height;

    public void printVolume() {
        int volume = length*height*width;
        System.out.println("Volume: "+ volume);
    }

    public void setVolume(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
}

public class Case3 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setVolume(10, 20, 33);
        System.out.println(b1);
        b1.printVolume();
        
    }
}
