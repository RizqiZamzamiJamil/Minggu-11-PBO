package tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }

    public void displayData(){
        System.out.println("Suara : " + suara);
        System.out.println("warna Bulu : " + warnaBulu);
    }
}
