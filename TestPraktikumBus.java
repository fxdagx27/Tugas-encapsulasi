package TugasEnkapsulasi;

public class TestPraktikumBus {
    public static void main(String[] args) {
        praktikumbus busMini = new praktikumbus(10);
        busMini.addPenumpang(5);
        busMini.addPenumpang(6);
        busMini.getPenumpang(10);
        busMini.getPenumpang(15);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();
    }
}
