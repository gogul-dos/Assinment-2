public class Q4 {
    public static void main(String[] args) {
        int a = 5;
        /* Error
        *
           Q4.java:5: error: variable a is already defined in method main(String[])
            int a = 10;
                ^
           1 error
        */
        if(a<6){
            int a = 10;
            System.out.println(a);
        }
        System.out.println(a);
    }
}


