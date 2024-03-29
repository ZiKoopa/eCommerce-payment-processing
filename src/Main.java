import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        fillCustomerOrders("src/customer_orders.csv");
        calculate.calculateFinancials(ShirtOrder.customerOrders);
        generateReports();
    }

    private static void generateReports() {
        WriteReport revenueReport = new WriteReport("Revenue");
        WriteReport profitReport = new WriteReport("Profit");
        WriteReport profitPerShirtSizeReport = new WriteReport("ProfitPerShirtSize");

        revenueReport.start();
        profitReport.start();
        profitPerShirtSizeReport.start();

        try {
            revenueReport.join();
            profitReport.join();
            profitPerShirtSizeReport.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void fillCustomerOrders(String filePath) {
        File inputFile = new File(filePath);

        try {
            Scanner s1 = new Scanner(inputFile);

            if(s1.hasNextLine()){
                s1.nextLine();
            }

            while (s1.hasNextLine()){
                String currentLine  = s1.nextLine();
                String[] lineParts = currentLine.split(",");

                try {
                    String fullName = lineParts[0];
                    String shirtSize = lineParts[1];
                    Boolean withDesign = Boolean.parseBoolean(lineParts[2]);
                    Boolean withHoodie = Boolean.parseBoolean(lineParts[3]);
                    String payment = lineParts[4];

                    ShirtOrder.customerOrders.add(new ShirtOrder(fullName,shirtSize, withDesign, withHoodie, payment));
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            s1.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}