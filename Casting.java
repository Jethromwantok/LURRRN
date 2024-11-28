public class Casting {
    public static void main(String[] args) {
        //Casting is for changing the type of a variable
        //For widening cast: i.e. Making type more precise
        int myInt = 5;
        double myDouble = myInt;//widening cast can be done directly

        //For narrowing cast: i.e. making cast more general
        double newDouble = 4.06d;
        int newInt = (int) newDouble;
        System.out.println((float) newInt/myInt * 100);//Use of widening and narrowing cast
    }
}
