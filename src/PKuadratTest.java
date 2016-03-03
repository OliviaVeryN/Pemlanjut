public class PKuadratTest {
public static void main(String[] args) {
   PKuadrat kua = new PKuadrat();
   kua.setABC(3, 2, -5);
   kua.tampilPossi();
    System.out.println("nilai akar persamaan kuadratnya X1 adalah "+kua.getX1());
    System.out.println("nilai akar persamaan kuadratnya X2 adalah "+kua.getX2());

}   
}