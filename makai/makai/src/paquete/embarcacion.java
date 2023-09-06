package paquete;

public class embarcacion {

    public capitan capitan_asociado;
    public double precio_base;
    public double valor_adicional = 0;
    public int fabricacion;
    public double eslora;
    
    public double getMontoAlquiler() {
        return this.precio_base + this.valor_adicional;
    }
    
}
