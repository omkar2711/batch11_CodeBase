public class Operators{
    public static void main (String[] args){
        // Arithematic Operators
        // int a = 10;
        // int b =20;
        // int c = 20;
        // int add = a+b;
        // int sub = b-a;
        // int mul = a*b;
        // int div = b/a;
        // int mod = b%a;

        // // Relational Operators
        // boolean flag = a>b;
        // boolean flag1 = a<b;
        // boolean flag2= a>=b;
        // boolean flag3 = a<=b;
        // boolean flag4 = a==b;

        // Logical Operators;
        // if(a>b && b==c){
        //     System.out.println(true);
        // }

        // else if(a>b || b==c){
        //     System.out.println(true);
        // }

        // Assignment Operatos (+=,-+,*=,/=)
        int x = 5;
        int y = 10;
        int z = (x++ * y--)-(--x * ++y);
        System.out.println(z);
    }
}