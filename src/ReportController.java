import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 
public class ReportController{
    
    File myfile = new File("Inventory.txt"); 

    @FXML
    void HandleReport(ActionEvent event) {
        Report r1 = new Report(Inventory.inventory);
        r1.generateReport();
    }

    @FXML
    void HandleReportInFile(ActionEvent event) {
        try
        {
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(myfile,true)));
            double totalValue = 0;
            output.println("Inventory Reports");
            output.println("-----------------\n");
            output.printf("Total items: %d\n\n", Inventory.inventory.size());
            output.println("Item\t\tQuantity\tPrice\tID");
            output.println("----\t\t--------\t-----");
            for (int j = 0; j < Inventory.inventory.size(); j++) {
                String itemName = Inventory.inventory.get(j).getName();
                double itemPrice = Inventory.inventory.get(j).getPrice();
                int itemId = Inventory.inventory.get(j).getId();
                int quantity = Inventory.inventory.get(j).getQuantity();

                output.printf("%s\t%d\t\t%.2f\t%d\n ",itemName,quantity,itemPrice,itemId);
                totalValue += itemPrice*quantity;
            }
            
            System.out.println("File Created");
            output.close();

        }
        catch(Exception e)
        {
             System.out.println("error in the file "+e.getMessage());
        }
    }
    
}
