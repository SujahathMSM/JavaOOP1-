class Box {
    int length;
    int width;
    int height;

    public int getVolume() {
        int volume = length*height*width;
        return volume;
    }

    public void setVolume(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
}


public class Case4 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setVolume(10, 20, 33);
        System.out.println(b1);
        System.out.println("Volume: "+ b1.getVolume());
    }
}
