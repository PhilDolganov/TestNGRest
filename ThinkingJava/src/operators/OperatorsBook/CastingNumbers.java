package operators.OperatorsBook;
// What happens when you cast a float
// or double to an integer value?
public class CastingNumbers {
    public static void main (String[] args){
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(fint)above: " + (int)fabove);
        System.out.println("(fint)below: " + (int)fbelow);
    }

}
