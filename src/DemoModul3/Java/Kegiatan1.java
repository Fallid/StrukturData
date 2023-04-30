package DemoModul3.Java;

public class Kegiatan1 {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push("Struktur");
        theStack.push("Data");

        char[] reverse;
        while (!theStack.isEmpty()){
            String value = theStack.pop();
            reverse = value.toCharArray();
            for (int i = reverse.length -1; i >= 0; i--){
                System.out.print(reverse[i]);
            }
        }
        // System.out.println("");
    }
}
