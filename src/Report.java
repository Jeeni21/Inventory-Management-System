import java.util.List;

public class Report {
    private List<Item> inventory;

    public Report(List<Item> inventory2) {
        this.inventory = inventory2;
    }
    public void generateReport() {
        System.out.println("Inventory Report");
        System.out.println("-----------------\n");
        System.out.printf("Total items: %d\n\n", inventory.size());
        System.out.println("Item\t\tQuantity\tPrice\tID");
        System.out.println("----\t\t--------\t-----");
        double totalValue = 0;
        for (int i=0; i<inventory.size(); i++){
            System.out.printf("%s\t\t%d\t\t%.2f\t%d\n", inventory.get(i).getName(), inventory.get(i).getQuantity(), inventory.get(i).getPrice(),inventory.get(i).getId());
            totalValue += inventory.get(i).getPrice()*inventory.get(i).getQuantity();
        }
        System.out.printf("\nTotal value: %.2f\n", totalValue);
    }
}
