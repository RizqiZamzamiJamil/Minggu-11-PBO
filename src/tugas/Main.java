package tugas;

public class Main {
    public static void main(String[] args) {
        Keledai kd = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gr = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa sg = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        
        kd.displayMakan();
        kd.displayBinatang();
        kd.displayData();

        System.out.println();
        gr.displayMakan();
        gr.displayBinatang();
        gr.displayData();

        System.out.println();

        sg.displayMakan();
        sg.displayBinatang();
        sg.displayData();

    }
}
