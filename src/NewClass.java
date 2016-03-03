import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = 0;
        do {
            System.out.print("Masukkan nilai : "); nilai = in.nextInt();
            hasil(nilai);
            System.out.println("");
        } while (nilai != 0);
        System.out.println("Keluar :)");
    }
    static void hasil(int angka){
        String asd = angka+"";
        for (int i = 0; i < asd.length(); i++){
            if ((8-asd.length()+i%3)-1 == 0 &&  asd.charAt(i-1)=='1'){
                angka(asd.charAt(i));System.out.print("belas ");
            }
            else if(8-asd.length()+i%3 == 0 &&  asd.charAt(i)=='1'){
            }else{
                if (i == asd.length()-1 && asd.charAt(i)=='1' || i == 6 && asd.charAt(i)=='1') System.out.print("satu ");
                else angka(asd.charAt(i));
                puluhan(8-asd.length()+i);
            }
        }
    }
    static void puluhan(int angka){
        String hasil = "";
        switch(angka){
            case 1:hasil = "juta ";break;
            case 2:hasil = "ratus ";break;
            case 3:hasil = "puluh ";break;
            case 4:hasil = "ribu ";break;
            case 5:hasil = "ratus ";break;
            case 6:hasil = "puluh ";break;
            case 7:hasil = " ";break;
        }
        System.out.print(hasil);
    }
    static void angka(char angka){
        String hasil = "";
        switch(angka){
            case '1':hasil = "se";break;
            case '2':hasil = "dua ";break;
            case '3':hasil = "tiga ";break;
            case '4':hasil = "empat ";break;
            case '5':hasil = "lima ";break;
            case '6':hasil = "enam ";break;
            case '7':hasil = "tujuh ";break;
            case '8':hasil = "delapan ";break;
            case '9':hasil = "sembilan ";break;
        }
        System.out.print(hasil);
    }
}
