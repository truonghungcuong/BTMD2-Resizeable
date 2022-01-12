public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);

        rectangle=new Rectangle("indigo",false,6,7);
        System.out.println(rectangle);
    }
}
