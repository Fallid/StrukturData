package DemoModul1;

public class Segitiga<T extends Number>{
    private T alas;
    private T tinggi;
    Segitiga(T alasSegtiga, T tinggiSegitiga){alas = alasSegtiga ; tinggi = tinggiSegitiga;}

    public int getResultInt(){
        return (int) (0.5*alas.intValue() * tinggi.intValue());
    }

    public double getResultDouble(){
        return 0.5*alas.doubleValue() * tinggi.doubleValue();
    }
}
