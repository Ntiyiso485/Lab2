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
        StudentClass studClass=new StudentClass("Ntiyiso","220714241",85);
        studClass.displayDetails();
        if (studClass.hasPassed(studClass.mark)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        System.out.println("=========================================================================");
        BankAccount acc=new BankAccount("Chauke","1677003152",5000);
        acc.deposit(2000);
        acc.withdraw(500);
        acc.getBalance();
        System.out.println("=========================================================================");
        ProductInventory product = new ProductInventory(101, "Keyboard", 250.00, 10);

        System.out.println("=== Initial Product Details ===");
        product.displayDetails();

        System.out.println("\n=== Adding Stock ===");
        product.addStock(5);

        System.out.println("\n=== Selling Products ===");
        product.sellProduct(3);

        System.out.println("\n=== Attempting Invalid Sale ===");
        product.sellProduct(20);

        System.out.println("\n=== Updated Product Details ===");
        product.displayDetails();
        System.out.println("=========================================================================");
        Rectangle rect=new Rectangle(15,56);
        rect.displayDetails();
        System.out.println("=========================================================================");

    }
}

