package TugasEnkapsulasi;

public class praktikumbus {
    private double penumpang, maxpenumpang, counter, penumpangBaru;

    // Constructor
    public praktikumbus(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
    }

    // method mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if (temp>= maxpenumpang) {
            System.out.println("Overload Penumpang");
        }
        else{
            this.penumpang = temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }

    public void getPenumpang(double penumpang){
        double temp;
        temp = (double) this.penumpang - penumpang;
        if (temp < 0) {
            System.out.println("Jumlah penumpang tidak bisa kurang dari 0");
        }
        else{
            this.penumpang = temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }

    public double getAverage(){
        if (counter == 0) {
            return 0;
        }
        else{
            return penumpangBaru / counter;
        }
    }

    public void cetak(){
        System.out.println("Penumpang Sekarang = "+penumpang);
        System.out.println("Penumpang Seharusnya adalah = "+maxpenumpang);
        System.out.println("Rata-rata berat penumpang = "+getAverage());
    }
   }

