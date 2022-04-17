import java.sql.SQLOutput;
import java.util.Scanner;

// Write a program to take student details as input and display the result.
public class Task1 {
    public static void main(String[] args) {
        Scanner detail= new Scanner(System.in);

        System.out.println("Fill the detail");
        System.out.println("Name");

        String name=detail.nextLine();
        System.out.print("age");
        int age=detail.nextInt();
        System.out.println("gender");
        String gender=detail.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}

//Write a program to calculate sum of four numbers taking user input.
class sum1{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);

        System.out.println("Enter 1st number");
        int n1= user.nextInt();
        System.out.println("Enter 2st number");
        int n2= user.nextInt();
        System.out.println("Enter 3st number");
        int n3= user.nextInt();
        System.out.println("Enter 4st number");
        int n4= user.nextInt();

        int sum=n1+n2+n3+n4;

        System.out.println("TOtal sum is "+sum);
    }
}

//Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class per{
    public static void main(String[] args) {
        Scanner her=new Scanner(System.in);
        System.out.print("math percentage");
        int math= her.nextInt();
        System.out.print("health percentage");
        int health= her.nextInt();
        System.out.print("science percentage");
        int science= her.nextInt();
        System.out.print("social percentage");
        int social= her.nextInt();

        double p=(math+health+science+social)/4;
        System.out.println("Total percentage is "+p);

        double sum=(math+health+science+social);
        System.out.println("Total sum is "+sum);

        if(p>=70 && p<100){
            System.out.println("First class");
        }
        else if (p>59 && p<70){
            System.out.println("Upper second class");

        }
        else if (p>49 && p<59) {
            System.out.println("third class");
        }
        else{
            System.out.println("Fail");}

    }
}

//Write a program to take two integer inputs from user and print sum and product of them.

class sumandmul{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);

        System.out.println("Enter 1st number");
        int n1= user.nextInt();
        System.out.println("Enter 2st number");
        int n2= user.nextInt();

        int sum=n1+n2;
        int mul=n1*n2;

        System.out.println("TOtal sum is "+sum);
        System.out.println("Product is "+mul);
    }
}

//Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.

class div5{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);

        System.out.println("Enter 1st number");
        int n1= user.nextInt();
        System.out.println("Enter 2st number");
        int n2= user.nextInt();

        int sum=n1+n2;
        int mul=n1*n2;
        double div=mul/sum;

        System.out.println("TOtal sum is "+sum);
        System.out.println("Product is "+mul);
        System.out.println("result is "+div);

    }
}

//Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.

class rectangle {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("length");
        Double length = user.nextDouble();
        System.out.println("breadth");
        Double breadth = user.nextDouble();

        Double area=length*breadth;

        Double rect = new Double(area);
        int areaa=rect.intValue();

        System.out.println("Area of rectangle is"+ areaa);

    }
}

//Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.

class format {
    public static void main(String[] args) {
        Scanner detail = new Scanner(System.in);

        System.out.println("Name");
        String name = detail.nextLine();
        System.out.println("Rol number");
        String roll = detail.nextLine();
        System.out.println("field of interest");
        String interest = detail.nextLine();

        System.out.println("Hey my name is " + name + "and my roll no is " + roll + ".My field of interest is " + interest);
    }
}

//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

class Perimeter{
    public static void main(String[] args) {
        Scanner meter=new Scanner(System.in);

        System.out.println("Enter a side of square;");
        float l=meter.nextFloat();
        float area=l*l;
        float perimeter=4l;

        System.out.println("the area of square is"+area);
        System.out.println("the perimeter of square is"+perimeter);
    }
}
class SI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amt");
        double principal =scan.nextDouble();
        System.out.println("Enter the rate");
        double rate =scan.nextDouble();
        System.out.println("Enter the time");
        double time =scan.nextDouble();

        double interest=(principal*time*rate)/100;
        System.out.println("the simple interest is "+interest);
    }
}
class Triangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height of triangle");
        double h=scan.nextDouble();
        System.out.println("Enter the base of triangle");
        double b=scan.nextDouble();

        double area=(h*b)/2;
        System.out.println("Area of tringle is"+area);
    }
}
class Vloume_of_cube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of cube");
        double l=scan.nextDouble();
        double volume=l*l*l;
        System.out.println("The volume of cube is"+volume);

    }
}
class Cuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of cuboid");
        double l=scan.nextDouble();
        System.out.println("Enter the breadth of cuboid");
        double b=scan.nextDouble();
        System.out.println("Enter the height of cuboid");
        double h=scan.nextDouble();
        double volume=l*b*h;
        System.out.println("the voulume of cuboiod is "+volume);
    }
}

//9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25

class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no to find square");
        double n1=scan.nextDouble();

//        double square=a*a;
        double square=Math.pow(n1,2);
        System.out.println("The square of given no is "+square);

    }
}

//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
class Ten{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String a=scan.nextLine();

        System.out.println("Enter the second string: ");
        String b=scan.nextLine();

        System.out.println(a+b);

    }
}
//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
class Check {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int a=scan.nextInt();
        System.out.println("Enter the second no: ");
        int b=scan.nextInt();
        System.out.println("Enter the third no: ");
        int c=scan.nextInt();

        String check;

        check=(a==b && a==c)?"all are equal":(a==c || a==b)?"Two no are equal":"None of them are equal";
        System.out.println(check);
    }
}
/*12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.*/
class Check1{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the first no");
        double f_num=scan.nextDouble();
        System.out.println("Enter the second no");
        double s_num=scan.nextDouble();

        String result;
        result=(f_num<50 && f_num<s_num)?"the condition is true": "the condition is not true.";
        System.out.println(result);
    }
}

/*13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
write a program to calculate his total marks and percentage marks.*/
class Robert{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the marks of first sub");
        double M=scan.nextDouble();
        System.out.println("Enter the marks of second sub");
        double s=scan.nextDouble();
        System.out.println("Enter the marks of third sub");
        double H=scan.nextDouble();

        double t_marks=M+s+H;
        double percent=(M+s+H)/3;
        System.out.println("your total marks is"+t_marks);
        System.out.println("your total percent is"+percent);

    }
}

