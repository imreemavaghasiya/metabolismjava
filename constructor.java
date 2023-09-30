public class constructor {
    public static void main(String[] args) {
        InnerConstructor ic = new InnerConstructor(50, 80);
        InnerConstructor inc = new InnerConstructor();

    }
}

class InnerConstructor {
    InnerConstructor() {
        System.out.println("Default Constructor");
    }

    InnerConstructor(int a, int b) {
        System.out.println("A = " + a + "B = " + b);
    }

}