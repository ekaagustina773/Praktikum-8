package Praktikum8;

public class Tabungan {
    int saldo;
    
    Tabungan(int initsaldo){
        this.saldo=initsaldo;
    }
    
    public void ambiluang(int jumlah){
        this.saldo=(saldo-jumlah);
    }

    void ambilUang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
