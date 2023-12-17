
import java.util.Scanner;


public class Main {

    private static Main main;
    private Scanner input;
    private Shop shop;

    public Main(){this.input = new Scanner(System.in);}


    public static void main(String[] args) {
        System.out.println("welcome to kevin’s shoe shop!");
        Main.main=new Main();
        main.setup();
        main.Menu();
        }
        private int Menu(){
    System.out.println("--------"+ """
                 Kevin's Shoe Shop Menu
               -----
                  1) Add a Shoe
                  2) List All SHOEs
                  3) Find a Shoe(Name)
                  4) Find a Shoe(Brand)
                  5) Delete a Shoe
                  6)Update  shoe detail
                  0) Exit);""");
    int A=input.nextInt();
    switch (A){case 1->main.Addshoe();
        case 2->main.printall();
    case 3->main.Search();
    case 4->main.SearchBrand();
    case 5->main.Delete();
    case 6->main.Update();
    case 0->System.exit(0);
        default -> System.out.println("Invalid option entered"+A);}
            System.out.println("\nPress any key to continue...");
    input.nextLine();
    input.nextLine();
    return Menu();}


    private void SearchBrand(){input.nextLine();
        System.out.println("Enter the brand to find the shoes");
        String brand=this.input.nextLine();
        Shoes searchbrand = this.shop.find2(brand);
        if(searchbrand!=null){System.out.println("The founding things: "+searchbrand);}
        else {System.out.println("No shoes found");}



    }



    private void Search() {input.nextLine();
        System.out.println("Enter a name to find the shoe");
        String search = input.nextLine();
        Shoes found = shop.find(search);
        if(found!=null){System.out.println("the founding things:"+found);}
        else {System.out.println("No shoes found");

    }}

    private void Addshoe(){

        this.input.nextLine();
        System.out.println("Enter the name of shoes you want to sell:  ");
    String name=this.input.nextLine();
    System.out.println("Enter the price:  ");
    double price=this.input.nextDouble();
    System.out.println("Enter the brand:   ");
    this.input.nextLine();
    String brand=this.input.nextLine();
    System.out.println("Enter the colour:  ");
    String colour=this.input.nextLine();
    System.out.println("Enter the type:  ");
    String type=this.input.nextLine();
    System.out.println("Enter the size    ");
    double size=this.input.nextDouble();
    Shoes temp=new Shoes(name,price,brand,colour,type,size);
    boolean Added=shop.add(temp);
    if (Added){
        System.out.println("Shoes Added Successfully");
    }
    else {
        System.out.println("No Shoes Added");
    }
    }
    private void printall(){System.out.println("List of shoes are:  ");
    System.out.println(shop.list());}

    private void Delete(){input.nextLine();
        System.out.println("Enter the name of shoes you want to delete from store");
        String name=this.input.nextLine();
        Shoes found=shop.find(name);
        if (found!=null){
        shop.delete(name);
        System.out.println("Shoe has been deleted!");}
        else {System.out.println("No shoes found!");}
    }
    private void Update(){input.nextLine();
        System.out.println("Enter the name to update shoe details: ");
        String detail=input.nextLine();
        Shoes found=shop.find(detail);
        if(found!=null){


    System.out.println("Enter the new price");
    double newprice=this.input.nextDouble();
    System.out.println("Enter the new size");
    double newsize=this.input.nextDouble();
    input.nextLine();
    System.out.println("Enter the new colour");
    String newcolour=this.input.nextLine();
    System.out.println("Enter the new brand");
    String newbrand=this.input.nextLine();
    System.out.println("Enter the new type");
    String newtype=this.input.nextLine();
    shop.update(detail,newprice,newsize,newcolour,newbrand,newtype);}
        else {System.out.println("No shoes found!");


}}
    private void setup(){
        System.out.println("How many shoes you want to have in the store?");
        int number=input.nextInt();
        shop=new Shop((number));
    }
}

