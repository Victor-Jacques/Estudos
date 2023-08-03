import java.util.Scanner;

/*public class HelloWorld {
    static int age = 23;
    public static void main(String[] args){
        int sumA = 25;
        double sumC = sumA;
        int sumB = 15;
        

        System.out.println(sumA + sumB);
        System.out.println(sumC);
        System.out.println(age);
    }
}*/

public class HelloWorld {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        //System.out.println("Enter a number: ");
       // int num = myObj.nextInt();
       // System.out.println("Your number: " + num);
        System.out.println("Enter temperature value in celsius(integer only): ");
        /*float fahrenheit;
        float celsius;
        double kelvin;
        celsius = myObj.nextFloat();
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = (double)celsius + 273.15;*/
        float celsius = myObj.nextFloat();
        float fahrenheit = (float)(celsius * 9 / 5) + 32;
        double kelvin = (double) celsius + 273.15;

        System.out.println("Temperature in fahrenheit is: " + fahrenheit);
        System.out.println("Temperature in kelvin is: " + kelvin);
    }
}