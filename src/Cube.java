public class Cube{
    private int side;
    private String IllegalArgumentException;
    public Cube(){
        side=1;
    }
    public Cube(int s){
        if(s<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else{
            side=s;
        }
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if(side<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side=side;
    }
    public int calculateSurfaceArea(){
        return side*side*6;
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public String toString(){
        return "Cube{side="+side+"}";
    }
}
