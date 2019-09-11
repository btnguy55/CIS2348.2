public class DataTypes {

    public static void main(String[] args) {

        int i = 5;
        double d = 34.0;
        d = i; // implicit type conversion.
        // i = d; // Error! Loss of precision! d = 4.7;
        i = (int)d; // explicit type conversion.
        System.out.println(i);


        // Primitive Arrays
        int[] y = {1,2,3,4,5};
        char a = 'a';
        char ch2[] = new char[4];
        ch2[1] = 'b';


        System.out.println(y);
        System.out.println(y[1]);
        System.out.println(y[0]);
        System.out.println(y[4]);
        System.out.println(ch2[0]);
        System.out.println(ch2[1]);


    }
}