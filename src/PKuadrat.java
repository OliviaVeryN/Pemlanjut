public class PKuadrat {
 //variabel
    private int a=0,b=0,c=0;
 // method
    public void setABC(int x,int y, int z){
        a=x; b=y; c=z;
    }
    //method cari nilai persamaan kuadratnya
    public double getX1(){
        return (-b + (Math.sqrt((b*b)-4*a*c)))/(2*a);
    }
    public double getX2(){
        return (-b - (Math.sqrt((b*b)-4*a*c)))/(2*a);
    }
    public void tampilPossi(){
        System.out.println("persamaan kuadrat dari "+a+"x2 +" +b+ "x + ("+c+")");
    }    
}