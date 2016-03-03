
public class TitikTest {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.tampilPosisi();
        t1.setXY(10,20);
        t1.tampilPosisi();
        System.out.println("jarak t1 ke nol : "+t1.getJarakKeNol());
        Titik t2 = new Titik();
        t2.setXY(5,10);
        t2.tampilPosisi();
        System.out.println("jarak t2 ke nol : "+t2.getJarakKeNol());

       //System.out.println("jarak t1 ke t2 : "+t1.getJrakkeTitik());
    }
}
