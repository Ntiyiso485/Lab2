package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================================");

        PassOrFail pass = new PassOrFail();
        pass.passOrFail();
        System.out.println("=========================================================================");
        ReverseArray rev=new ReverseArray();
        rev.reverse();
        System.out.println("=========================================================================");
        GradeCalculator grad=new GradeCalculator();
        grad.cal();
        System.out.println("=========================================================================");
        NumberAnalysis numb=new NumberAnalysis();
        numb.oddOrEven();
        System.out.println("=========================================================================");
        LoginDetails log=new LoginDetails();
        log.login();
        System.out.println("=========================================================================");
        StoreMarks marks=new StoreMarks();
        marks.display();
        System.out.println("=========================================================================");
        HighestLowest highestLowest=new HighestLowest();
        highestLowest.highLow();
        System.out.println("=========================================================================");
        ArraySearch search=new ArraySearch();
        search.search(89);
        System.out.println("=========================================================================");
        EvenOddArray evenOddArray=new EvenOddArray();
        evenOddArray.evenOdd();
        System.out.println("=========================================================================");
        Reverse reverse=new Reverse();
        reverse.reverse();
        System.out.println("");
        System.out.println("=========================================================================");

    }
}

