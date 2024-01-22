package guide13;

public class CheckDemo {
    public static void main(String[] args) {
        final OdeMiester groovy = new OdeMiester();
        groovy.breath = 5;
        groovy.gosh = new Grodie();
        groovy.gosh.cow = 10;
        OdeMiester[] arr = new OdeMiester[2];
        groovy.breath = 6;
        arr[0] = groovy;
        OdeMiester radical = new OdeMiester();
        OdeMiester lit = groovy;
        arr[0] = lit;
        groovy = radical;
        arr[1] = radical;
        arr[1] = lit;
        radical.gosh.cow = 2;
    }

}
