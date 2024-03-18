package recursividad;

public class Prueba {

    public static void main(String[] args) {
        int res = mult(4,2);
        System.out.println("Mutiplicación de 4x2 es igual a: "+res);
        System.out.println("Factorial de 10 es: "+factorial(10));
    }


    public static int suma(int a, int b)
    {
        return a+b;
    }

    public  static int mult(int a, int b)
        {
        int r =0;

        for (int i = 0; i < a; i++)
        {
            r = suma(r,b);
        }
        return r;
    }

    public static int  factorial(int a)
    {
        if(a==1){
            return 1;
        }
        else{
            return a* factorial(a-1);
        }
    }
}
