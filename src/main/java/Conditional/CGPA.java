package Conditional;
import java.awt.*;
import java.util.Scanner;

public class CGPA
{
    public static void main(String args[])
    {
        double count;
        int i;
        double totalMarks=0;
        double cgpa;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Grades of Subjects");
        count = input.nextDouble();

        System.out.println("Enter Grades of " + count + " Subject");
        for (i=0;i<count;i++){
            totalMarks+= input.nextDouble();
        }

//        System.out.println("Total Marks:" + totalMarks);
        cgpa = (totalMarks/count);
        System.out.println(("CGPA is: "+cgpa));

        if (cgpa<0.7) {
            System.out.println("Grade is: F");
        }
        else if(cgpa>=0.7 && cgpa<1)
        {
            System.out.println(("Grade is: D-"));
        }
        else if(cgpa>=1 && cgpa<1.3)
        {
            System.out.println(("Grade is: D"));
        }
        else if(cgpa>=1.3 && cgpa<1.7)
        {
            System.out.println(("Grade is: D+"));
        }
        else if(cgpa>=1.7 && cgpa<2)
        {
            System.out.println(("Grade is: C-"));
        }
        else if(cgpa>=2&& cgpa<2.3)
        {
            System.out.println(("Grade is: C"));
        }
        else if(cgpa>=2.3 && cgpa<2.7)
        {
            System.out.println(("Grade is: C+"));
        }
        else if(cgpa>=2.7 && cgpa<3)
        {
            System.out.println(("Grade is: B-"));
        }
        else if(cgpa>=3 && cgpa<3.3)
        {
            System.out.println(("Grade is: B"));
        }
        else if(cgpa>=3.3 && cgpa<3.7)
        {
            System.out.println(("Grade is: B+"));
        }
        else if(cgpa>=3.7 && cgpa<4)
        {
            System.out.println(("Grade is: A-"));
        }
        else if(cgpa>=4)
        {
            System.out.println(("Grade is: A"));
        }

    }


    }
