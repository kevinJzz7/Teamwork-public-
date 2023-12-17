public class Shop {
private Shoes[] shoes;
private int total=0;
public Shop(int numbers){shoes= new Shoes[numbers];}

private boolean Full(){return total==shoes.length;}
    private boolean Empty(){return this.total==0;}
    public boolean add(Shoes ashoe){if (this.Full()){
return false;}else {
        this.shoes[total]=ashoe;
        total++;
        return true;}}

    public String list(){
        if (this.Empty()) {return "no shoes in store";
        } else {
            String listofshoes="";
            for(int i = 0;i<total;i++) {
                listofshoes  += i + ":" + shoes[i] + "\n";
            }
            return listofshoes;
        }
    }
    public Shoes find(String name)
    {Shoes found=null;
    if (!this.Empty()) {
        for (int i = 0; i < this.total; i++) {
            if (this.shoes[i].getName().equals(name)) {
                found = shoes[i];
            }
        }
        return found;
    }else {return null;}}
public Shoes find2(String brand ) {
     
        for (Shoes  shoes:shoes) {
            if (shoes != null && shoes.getBrand().equals(brand)) {
                return shoes;

            }

        }
    return null;
    }




public void delete(String name){for (int i=0;i<shoes.length;i++){
    if(shoes[i]!=null&&shoes[i].getName().equals(name))
    { shoes[i]=null;

    break;}






    }
}

public void update(String name, double newprice, double newsize, String newcolour,String newbrand,String newtype) {
    for(Shoes shoes:shoes){
        if (shoes != null && shoes.getName().equals(name)) {
            shoes.setName(name);
            shoes.setBrand(newbrand);
            shoes.setSize(newsize);
            shoes.setColour(newcolour);
            shoes.setPrice(newprice);
            shoes.setType(newtype);
        }

}}}



