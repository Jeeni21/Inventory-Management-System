import java.util.*;
public class Inventory extends Item{

    Inventory(String name, double price, int quantity, int id) {
        super(name, price, quantity, id);
    }

    static List <Item> inventory = new ArrayList<>();

    public static void addItem(Item item){
        inventory.add(item);
    }

    public static Item getItemById(int id){
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).getId() == id){
                return inventory.get(i);
            }
        }
        return null;
    }

    public static void removeItem(Item item){
        inventory.remove(item);
    }

    public static void printInventory(){
        System.out.println("Name\t Id\t Price \t Quantity ");
        for (Item item : inventory) {
            System.out.println(item);
        }
    }
}
