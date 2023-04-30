package DemoModul3.Java;

public class Kegiatan1 {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(9);
        theStack.push(30);
        theStack.push(10);
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
