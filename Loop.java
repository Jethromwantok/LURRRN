public class Loop {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0){//Checks condition then executes
            System.out.println("This is at count " + i);
            i--;
        }

        do{//runs loop once then checks Conditions
            System.out.println("This is at count " + i);
            i--;
        }
        while (i > 0 );

    }
}
