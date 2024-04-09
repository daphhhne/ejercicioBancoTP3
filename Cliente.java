import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Cliente{
    private int cliente;
    private List<Cuenta> cuentas;

    public Cliente(int cliente){
        this.cliente=cliente;
        cuentas = new ArrayList<>();
    }

    public void addCuenta(Cuenta c){
        cuentas.add(c);
    }

    public void deleteCuenta(Cuenta c){
        cuentas.remove(c);
    }
    public List<Cuenta> listarCuentas(){
        return cuentas;
    }
}