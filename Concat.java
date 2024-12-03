public class Concat {//+ used for addition of numbers and concatenation of strings
    //+ used for addition of numbers and concatenation of strings
    public static void main(String[] args) {
        String fig ="I am ";
        String gif = "mai";
        int gig = 8;
        System.out.println(fig + gif);//normal concatenation using +
        System.out.println(fig.concat(gif));//concat method can be used to concatenate strings
        System.out.println(gif + gig);//concatenating a string and int gives string
    }
}
