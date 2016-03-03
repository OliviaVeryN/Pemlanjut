public class lingtest {
    public static void main(String[] args) {
   lingkaran L1 = new lingkaran();
   lingkaran L2 = new lingkaran();
   L1.setPosisi(3, 4);
   L2.setPosisi(6, 8);
   L1.setJari2(7);
   L2.setJari2(14);
    System.out.println("jarak dari kedua lingkaran : "+L1.getJarak2LIng(L2));
   L1.tampilPosisi(L2);
      
}
}
