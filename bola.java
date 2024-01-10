package TugasEnkapsulasi;

public class bola {
    private double jariJari;

    public bola(){
        this.jariJari = 0.0;
    }

    public void setJariJari(double jariJari){
        if (jariJari > 0) {
            this.jariJari = jariJari;
        }
        else{
            System.out.println("Jari-jari harus lebih dari 0");
        }
    }

    public double showDiameter(){
        return 2*jariJari;
    }

    public double showLuasPermukaan(){
        return 4*Math.PI*Math.pow(jariJari, 2);
    }

    public double showVolume(){
        return(4/3)*Math.PI*Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        // langkah 1 : membuat variabel jari-jari
        double jariJariVariable = 5.0;

        // langkah 2 : menciptakan objek bola
        bola bolaObjek = new bola();

        // langkah 3 :  memanggil method showDiameter(), showLuasPermukaan(), dan showVolume()
        System.out.println("Diameter : "+bolaObjek.showDiameter());
        System.out.println("Luas Permukaan : "+bolaObjek.showLuasPermukaan());
        System.out.println("Volume : "+bolaObjek.showVolume());
    }
}
