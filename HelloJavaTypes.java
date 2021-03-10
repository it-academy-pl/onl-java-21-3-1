public class HelloJavaTypes {
  public static void main(String[] args) {
     int someNumber = 42;
     someNumber = 51;
     int anotherNumber = 7;
     int sumOfTwoNumbers = someNumber + anotherNumber;
     System.out.println(sumOfTwoNumbers);

     char characterZ = 177;
     System.out.println(characterZ);

     int hex = 0xA;
     int bin = 0b1001;
     System.out.println(hex);
     System.out.println(bin);

     long longNumber = 10L;
     int hugeNumber = 100_000_000;

     int a = 20;
     int b = 3;
     System.out.println(a%b);
     b++;
     b = b + 1;
     a--;
     a = a - 1;

     ++b;
     --a;
     int c = a++;
    
     boolean bb = true;
     boolean cc = !bb;
     System.out.println(cc);

     System.out.println(a==b);

     a = a + b;
     a += b;
  }
}
