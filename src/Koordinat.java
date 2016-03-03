
public class Koordinat {
    //atribut
    private int x=0,y=0;
    private int jarijari=1;
     //metode
    public void setXY(int a,int b){
        x=a;y=b;   
}
    public void setJariJariBertambah(int c){
        if(jarijari !=0)
            jarijari*=2; 
        System.out.println("nilai jari jari setelah ditambah"+jarijari);
    }
    public void setJariJariberkurang(int d){
        if(jarijari !=0)
            jarijari/=2;
        System.out.println("nilai jari jari setelah dibagi"+jarijari);
    }
    public double jarakLingkaran(Koordinat e){
        return Math.sqrt((x - e.x)*(y - e.y));
    }
    public String letakTitik(int x1, int y1){
        if(x1*x1 + y1*y1 == jarijari) return "Pada Lingkaran";
        else if (x1*x1 + y1*y1 == jarijari) return "Luar Lingkaran";
        else return "Dalam Lingkaran";
    }
    
        public void tampilPosisi(){
            System.out.printf("posisi titik x=%d,y=%d\n",x,y);
 
            
        }    
            
}
