public class Item {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int id;
    
    Item(String name,double price,int id){
        this.name = name;
        this.price = price;
        description = name + price;
        this.id = id;
    }
    Item(String name,double price,int quantity,int id){
                this.name = name;
                this.price = price;
                this.quantity = quantity;
                description = name + price;
                this.id = id;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return name+"\t\t"+id+"\t\t"+price+"\t\t"+quantity+"\t";
    }
}
