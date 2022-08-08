import java.util.Scanner;

public class WageCalc {

    public static void main(String[] args){
        int sun,mon,tue,wed,thu,fri,sat;
        int sunrate,satrate,monrate = 0,tuerate = 0,wedrate = 0,thurate = 0;
        int frirate = 0,extrahour,bonus, totalhours,overtime,overrate;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours worked on Monday ");
        mon=sc.nextInt();
        System.out.println("Enter the hours worked on Tuesday ");
        tue=sc.nextInt();
        System.out.println("Enter the hours worked on Wednesday ");
        wed=sc.nextInt();
        System.out.println("Enter the hours worked on Thursday ");
        thu=sc.nextInt();
        System.out.println("Enter the hours worked on Friday ");
        fri=sc.nextInt();
        System.out.println("Enter the hours worked on Saturday ");
        sat=sc.nextInt();
        System.out.println("Enter the hours worked on Sunday ");
        sun=sc.nextInt();

        satrate = sat*125;
        sunrate = sun*150;

        if(mon <= 8)
        {
            monrate = mon * 100;
        }
        else if(mon > 8)
        {
            extrahour = mon - 8;
            bonus = extrahour * 115;
            monrate = bonus + 800;
        }
        if(tue <= 8)
        {
            tuerate = tue * 100;
        }
        else if(tue > 8)
        {
            extrahour = tue - 8;
            bonus = extrahour * 115;
            tuerate = bonus + 800;
        }
        if(wed <= 8)
        {
            wedrate = wed * 100;
        }
        else if(wed > 8)
        {
            extrahour = wed - 8;
            bonus = extrahour * 115;
            wedrate = bonus + 800;
        }
        if(thu <= 8)
        {
            thurate = thu * 100;
        }
        else if(thu > 8)
        {
            extrahour = thu - 8;
            bonus = extrahour * 115;
            thurate = bonus + 800;
        }
        if(fri <= 8)
        {
            frirate = fri * 100;
        }
        else if(fri > 8)
        {
            extrahour = fri - 8;
            bonus = extrahour * 115;
            frirate = bonus + 800;
        }


        totalhours = mon + tue + wed + thu + fri;
        if(totalhours > 40) {
            overtime = totalhours - 40;
            overrate = overtime * 25;
        }

        int income=monrate+tuerate+wedrate+thurate+frirate+satrate+sunrate;
        System.out.println("Total income for the week is : Rs." +income);
    }


}
