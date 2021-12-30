package consAmbguity;

public class AddCons {
    private int a;
    private int b;

    public AddCons(double a, double b) {
        System.out.println("FROM DOUBLE");
        this.a = (int)a;
        this.b = (int)b;
    }

    //CONS OVERLOADING
    public AddCons(int a, int b) {
        System.out.println("FRoM INTEGER");
        this.a = a;
        this.b = b;
    }

    public AddCons(String a, String b) {
        System.out.println("FRoM STRING");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }


    public void sum(){
        int c = this.a + this.b;
        System.out.println("Calling SUM METHOD");
        System.out.println("Sum is : " + c);
    }
}
