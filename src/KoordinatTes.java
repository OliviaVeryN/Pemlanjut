public class KoordinatTes {
    public static void main(String[] args) {
        Koordinat x1=new Koordinat();
        x1.setXY(12, 13);
        System.out.println("Posisi titik berada "+x1.letakTitik(12,13));
        x1.tampilPosisi();
    
}
}