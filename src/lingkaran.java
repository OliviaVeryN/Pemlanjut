public class lingkaran {
  //variabel
    private int x=0,y=0,r=0;
    //method
    public void setPosisi(int a, int b){
        x=a;y=b;
    }
    public void setJari2(int c){
       if (c!=0){
           r =c;r *=2;r /=2;
           
       }
    }
    public double getJarak2LIng(lingkaran l){
         return Math.sqrt(Math.pow((x-l.x),2)+(Math.pow((y-l.y),2)));
    }
    
    public void tampilPosisi(lingkaran q){
            System.out.printf("titik lingkaran x=%d,y=%d,r=%d\n",x,y,r);
            double z = r + q.r;
            double j = getJarak2LIng(q);
            if (j==z){
                System.out.println("Bersinggungan");
            }
            else if (j>z){
                System.out.println("Berpisah");
            }
            else System.out.println("berpotongan");
            
    }
}