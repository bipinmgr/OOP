

//Task to Do:
//        1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
//        Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//        following: Percentage >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F

import javax.swing.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Physic: ");
        double p=scan.nextDouble();

        System.out.println("Chemistry : ");
        double c=scan.nextDouble();

        System.out.println("Biology : ");
        double b=scan.nextDouble();

        System.out.println("math : ");
        double m=scan.nextDouble();

        System.out.println("computer : ");
        double co=scan.nextDouble();

        double per=(p+c+b+m+co)/5;
        double total=(p+c+b+m+co);

        System.out.println("Total percentage is "+per);
        System.out.println("Total  is "+total);

        switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
        }

    }

}


//        2. JAVA Program to find the maximum between two numbers. Using the switch statement.

class Number2{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a=scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=scan.nextInt();

        switch ((a>b)?0:1){

            case 0:
                System.out.println("a is greater");
                break;

            case 1:
                System.out.println("b is greater ");
                break;
        }
    }
}




//        3. JAVA Program to find the maximum between three numbers. Using the switch statement.

class Number3{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a=scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=scan.nextInt();
        System.out.println("Enter 3rd number: ");
        int c=scan.nextInt();

        switch ((a>b && a>c)?0:(b>a && b>c)?1:2){

            case 0:
                System.out.println("a is greater");
                break;

            case 1:
                System.out.println("b is greater ");
                break;

            case 2:
                System.out.println("c is greater ");
                break;
        }
    }
}


//        4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.

class Number4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = scan.nextInt();

        switch((a%5==0 && a%11==0)?1:0){

            case 1:
                System.out.println("It is divisible by both 5 and 11");
                break;

            case 0:
                System.out.println("It is not divisible by both 5 and 11");
                break;
        }
    }
}
//        5. JAVA Program to check whether a year is a leap year or not. Using switch statement

class Number5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int a = scan.nextInt();

        switch ((a%400==0)||(a%4==0 && a%100!=0)?1:0){

            case 1:
                System.out.println("IT is a leap year");
                break;

            case 0:
                System.out.println("It is not a leap year");
                break;

        }
    }
}

//        6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class Number6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any Character:");
        char a=scan.next().charAt(0);

        switch (((a>='a' && a<='z')||(a>='A' && a<= 'Z'))?1:0){

            case 1:
                System.out.println("It IS ALPHABET");
                break;

            case 0:
                System.out.println("It IS not ALPHABET");
                break;


        }
    }
}





//        7. JAVA Program to take the value from the user as input any alphabet and check whether
//        it is vowel or consonant. Using the switch statement.

class Number7{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any Character:");
        char a=scan.next().charAt(0);

        switch ((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')?1:0){

            case 1:
                System.out.println("It IS vowel");
                break;

            case 0:
                System.out.println("It IS not vowel");
                break;


        }
    }
}



//        8. JAVA Program to take the value from the user as input any character and check whether
//        it is the alphabet, digit or special character. Using the switch statement.
class Number8{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any Character:");
        char a=scan.next().charAt(0);

        switch (((a>='a' && a<='z')||(a>='A' && a<= 'Z'))?1:(a>=0 && a<=9)?0:2){

            case 1:
                System.out.println("It IS vowel");
                break;

            case 0:
                System.out.println("It IS not vowel");
                break;


        }
    }
}




//        9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the switch statement.

class Number9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Character:");
        char a = scan.next().charAt(0);

        switch ((Character.isUpperCase(a))?1:0){

            case 1:
                System.out.println("It is Uppercase ");
                break;

            case 0:
                System.out.println("It is lowercase ");
                break;
        }
    }
}


//        10. JAVA Program to take the value from the user as an input week number and print weekday by using the switch statement.
class Number10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Character:");
        int a=scan.nextInt();

        switch (a){

            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }



    }


}

//        11. JAVA Program to take the value from the user as input the month number and print number of days
//        in that month. Using switch statement

class Number11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the month no.:");
        int a = scan.nextInt();
        System.out.println("Enter the year :");
        int b = scan.nextInt();

        switch (a){

            case 1:
                System.out.println("There are 31 days in January");
                break;

            case 2:
                System.out.println("February");

                switch (((b%400==0)||(b%4==0 && b%100!=0))?1:0){

                    case 1:
                        System.out.println("There are 29 days");
                        break;

                    case 0:
                        System.out.println("there are 28 days");

                }
                break;
            case 3:
                System.out.println("There are 31 days in March");
                break;
            case 4:
                System.out.println("There are 30 days in  april");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 30 days in June");
                break;
            case 7:
                System.out.println("There are 31 days in july");
                break;

            case 8:
                System.out.println("There are 31 days in August");
                break;
            case 9:
                System.out.println("There are 30 days in September");
                break;
            case 10:
                System.out.println("There are 31days in October");
                break;

            case 11:
                System.out.println("There are 30 days in November");
                break;
            case 12:
                System.out.println("There are 31 days in December");
                break;


        }



    }
}


//        12. JAVA Program to count the total number of notes in a given amount. Using the switch statement.
// 5 rupeese note

class Number12{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the amount :");
        int amount=scan.nextInt();

        int notes=amount/5;

        switch ((notes>0)?1:0){

            case 1:
                System.out.println("Total number of notes are "+notes);
                break;

            case 0:
                System.out.println("invalid");
                break;


        }
    }
}




//        13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
//        the triangle is valid or not. Using switch statement

class Number13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a side:");
        int a = scan.nextInt();
        System.out.println("Enter b side :");
        int b = scan.nextInt();
        System.out.println("Enter c side :");
        int c = scan.nextInt();

        switch (   ((a+b)>c)||((b+c)>a)||((a+c)>b)?1:0){

            case 1:
                System.out.println("IT is a valid triangle");
                break;

            case 0:
                System.out.println("It is not valid triangle");
                break;


        }
    }
}

//        14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//        Using switch statement
class Number14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a side:");
        int a = scan.nextInt();
        System.out.println("Enter b side :");
        int b = scan.nextInt();
        System.out.println("Enter c side :");
        int c = scan.nextInt();

        switch ((a == b && b == c) ? 1 : (a == b || b == c || c == a) && (a == b || b == c || c == a) ? 2 : 0) {

            case 1:
                System.out.println("equilateral triangle");
                break;

            case 2:
                System.out.println("Isosceles triangle");
                break;

            case 0:
                System.out.println("Scalene triangle");


        }

    }

}

//15. JAVA Program to find all the roots of a quadratic equation. Using switch statement

class  Number15{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double firstroot, secondroot;

        System.out.println("Enter coefficient of x square:");
        double a=scan.nextDouble();

        System.out.println("Enter coefficient of x :");
        double b=scan.nextDouble();

        System.out.println("Enter the value of constant:");
        double c=scan.nextDouble();

        double determinant=(b*b)-(4*a*c);
        double determinant1=Math.sqrt(determinant);

        switch ( (determinant1>0)?0:(determinant1==0)?1:2){

            case 0:
                firstroot=(-b+determinant1)/2*a;
                secondroot=(-b-determinant1)/2*a;

                System.out.println("first root is "+ firstroot);
                System.out.println("Second root is "+ secondroot);
                break;


            case 1:
                firstroot=(-b)/2*a;
                System.out.println("the first and second root is "+firstroot);
                break;

            case 2:
                double real=-b/(2*a);
                double imaginary=Math.sqrt(-determinant)/(2*a);
                System.out.println("first root :"+ real+imaginary);
                System.out.println("first root :"+ real+imaginary);
                break;

            default:
                System.out.println("invalid no");
        }


    }
}



//        16. JAVA Program to calculate profit or loss. Using switch statement.

class Number16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter expense :");
        int expense = scan.nextInt();
        System.out.println("Enter income :");
        int income = scan.nextInt();
        int a=0;

        switch (  ((income-expense)>a)?1:0){

            case 1:
                System.out.println("The profit is NRP"+(income-expense));
                break;

            case 0:
                System.out.println("It's a loss NRP"+(expense-income));
                break;
        }

    }
}

//        17. Using switch statement JAVA Program to take the value from the user as input marks of five subjects
//        Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the
//        following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C,
//        Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.

class Task17{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Physic: ");
        double p=scan.nextDouble();

        System.out.println("Chemistry : ");
        double c=scan.nextDouble();

        System.out.println("Biology : ");
        double b=scan.nextDouble();

        System.out.println("math : ");
        double m=scan.nextDouble();

        System.out.println("computer : ");
        double co=scan.nextDouble();

        double per=(p+c+b+m+co)/5;
        double total=(p+c+b+m+co);

        System.out.println("Total percentage is "+per);
        System.out.println("Total  is "+total);

        switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
        }

    }

}


//        18. JAVA Program to take the value from the user as input the basic salary of an employee
//        and calculate its Gross salary according to the following:
//        Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………
//        Basic Salary > 20000 : HRA = 30%, DA = 95%.

class Number18{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }
}





//        19. JAVA Program to take the value from the user as input electricity unit charges and calculate total
//        electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….
//        For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………
//        For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….
//        Using the switch statement.

class Number19{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");






        }





    }
}


/*
20. Write a program that determines a student’s grade. The program will read three types of scores
(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
grade=B……………………-if the average score>=50% and <70%`
=>grade=C……………………..-if the average score<50% =>grade=F
*/
class Nuber20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Number21{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Number22{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Number23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Number24{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

