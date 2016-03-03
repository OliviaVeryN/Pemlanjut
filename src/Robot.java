public class Robot {
    //atribut
    private int kecepatan;
    private int arah;
    //method
    public void tambahKecepatan(int k){
        kecepatan +=k;
    }
    public void setArah(int a){
        if (a != arah) {
            kecepatan = 0; 
            arah = a;
        }
    }
    public String hasilTerjemaharah(int a){
        String terjemahArah = "berhenti";
        switch(a){
            case 1:terjemahArah = "depan";break;
            case 2:terjemahArah = "kanan";break;
            case 3:terjemahArah = "belakang";break;
            case 4:terjemahArah = "kiri";break;
            default:;
        }
        return terjemahArah;
    }
    public void tampilRobot(){
        System.out.println("Robot berjalan ke arah "+hasilTerjemaharah(arah)+" dengan kecepatan "+kecepatan);
    }
}
