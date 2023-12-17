public class Shoes {
    private String name;
    private double price;
    private String brand;
    private String colour;
    private String type;
    private double size;
    public Shoes(String name, double price, String brand, String colour, String type, double size){
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.colour=colour;
        this.type=type;
        this.size= size;
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public String getBrand(){return this.brand;}
    public void setBrand(String brand){this.brand=brand;}
    public String getColour(String colour){return this.colour;}
    public void  setColour(String colour){this.colour=colour;}
    public String getType(){return this.type;}
    public void setPrice(double price){this.price=price;}
    public double getPrice(){return this.price;}
    public double getSize(){return this.size;}
    public void setType(String type){this.type=type;}
    public void setSize(double size){this.size=size;}
    public String toString(){return "Shoe{name=" +
            ""+this.name+"  price:" +
            ""+this.price +"  brand:" +
            ""+this.brand+"  colour:" +
            ""+this.colour+"  type:" +
            ""+this.type+"  size:" +
            ""+this.size+"}";}}
