public class Main {
    public static void main(String[] args) {
        System.out.printf("Sales tax calculator\n");

        double purchasePrice = 13.00;
        double sales_tax = 0.05;
        double totalCost = 0;

        sales_tax = purchasePrice * sales_tax;
        totalCost = purchasePrice + sales_tax;

        System.out.println("sales tax:" + sales_tax);
        System.out.println("total cost is:" + totalCost);

    }
}
