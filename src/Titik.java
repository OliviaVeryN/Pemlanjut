
public class Titik {
    //variabel
    private int x=0,y=0;
    //method
    public void setXY(int a, int b){
    x=a;y=b;}
    public double getJarakKeNol(){
        return Math.sqrt(x*x + y*y);
    }
    public void tampilPosisi(){
        System.out.printf("posisi titik x=%d, y=%d\n",x,y);
    }
    public double getJrakkeTitik(Titik t){
        return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(y-t.y));
    }
}
