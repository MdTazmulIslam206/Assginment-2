import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //===============(SALES_DATA_INPUT)===============
        System.out.println("-----Sales data input-----");

        System.out.print("Potato Selling Price(per kg): ");
        double potato_Sell = sc.nextDouble();
        System.out.print("Potato Sold Quantity(kg): ");
        double potato_Sold_Qty = sc.nextDouble();

        System.out.print("\nOnion Selling Price(per kg): ");
        double Onion_Sell = sc.nextDouble();
        System.out.print("Onion Sold Quantity(kg): ");
        double nOnion_Sold_Qty = sc.nextDouble();

        System.out.print("\nOil Selling Price(per liter): ");
        double Oil_Sell = sc.nextDouble();
        System.out.print("Oil Sold Quantity(liter): ");
        double Oil_Sold_Qty = sc.nextDouble();

        //===============(CALCULATE_TOTAL_REVENUE)===============
        double potato_Revenue = potato_Sell * potato_Sold_Qty;
        double Onion_Revenue = Onion_Sell * nOnion_Sold_Qty;
        double Oil_Revenue = Oil_Sell * Oil_Sold_Qty;

        double total_sold_price = potato_Revenue + Onion_Revenue + Oil_Revenue;

        System.out.println("\n(Total Sold Price)");
        System.out.println("Potato Revenue: " + potato_Revenue + " Tk");
        System.out.println("Onion Revenue: " + Onion_Revenue + " Tk");
        System.out.println("Oil Revenue: " + Oil_Revenue + " Tk");
        System.out.println("Total Sold Price : " + total_sold_price + " Tk");


        //===============(COST DATA INPUT)===============
        System.out.println("\n-----Cost Data Input-----");

        System.out.print("poteto costing price(per kg): ");
        double potato_Cost = sc.nextDouble();
        System.out.print("poteto costing quantity(kg): ");
        double potato_cost_Qty = sc.nextDouble();

        System.out.print("\nOnion costing price(per kg): ");
        double Onion_Cost = sc.nextDouble();
        System.out.print("Onion costing quantity(kg): ");
        double Onion_cost_Qty = sc.nextDouble();

        System.out.print("\nOil costing price(per liter): ");
        double Oil_Cost = sc.nextDouble();
        System.out.print("Oil costing quantity(liter): ");
        double Oil_cost_Qty = sc.nextDouble();

        System.out.print("\nTotal Transportation Cost: ");
        double Transportation_Cost = sc.nextDouble();


        //===============(CALCULATE TOTAL COST)===============
        double potatoCost = potato_Cost * potato_cost_Qty;
        double OnionCost = Onion_Cost * Onion_cost_Qty;
        double OilCost = Oil_Cost * Oil_cost_Qty;

        double Total_Cost = potatoCost + OnionCost + OilCost;

        System.out.println("\n-----(Total Cost)-----");
        System.out.println("Potato Cost: " + potatoCost + " Tk");
        System.out.println("Onion Cost: " + OnionCost + " Tk");
        System.out.println("Oil Cost: " + OilCost + " Tk");
        System.out.println("Total Cost: " + Total_Cost + " Tk");

        //===============(NET INCOME CALCULATION)===============
        double netIncome = total_sold_price - (Total_Cost + Transportation_Cost);
        System.out.println("\n-----Net Income-----");
        System.out.println("Net Income = " + netIncome + "Tk");

        sc.close();
    }
}