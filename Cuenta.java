public class Cuenta{
    private int cuenta;
    private double saldo;
    public Cuenta(int cuenta, double saldo){
        this.cuenta=cuenta;
        this.saldo=saldo;
    }
    public Cuenta(int cuenta){
        this.cuenta=cuenta;
        saldo=0;
    }
    public void depositarDinero(double cantidad){
        saldo+=cantidad;
    }
    public void extraerDinero(double cantidad){
        saldo-=cantidad;
    }
    public int getCuenta(int cuenta){
        return this.cuenta;
    }
    public void double getSaldo(){
        return this.saldo;
    }
}
