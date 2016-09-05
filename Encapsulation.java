public class Encapsulation {

    private int size;
    public int getSize()
    {
        return size;
    }
    public int setSize(int newSize)
    {
        size = newSize;
        return size;
    }
    public static void main(String[] args) {
        Encapsulation b = new Encapsulation();
        b.setSize(34);
        int x = b.getSize();
        System.out.println(x);
    }
    
}
