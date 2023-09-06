package paquete;

public class velero extends embarcacion {

    private int cantidad_mastiles;

    public velero(capitan capitan_asociado, double precio_base, int fabricacion, double eslora, int cantidad_mastiles) {
        this.capitan_asociado = capitan_asociado;
        this.precio_base = precio_base;
        this.fabricacion = fabricacion;
        if (this.fabricacion > 2020) {
            this.valor_adicional = 20000;
        }
        this.eslora = eslora;
        this.cantidad_mastiles = cantidad_mastiles;
    }

    @Override
    public String toString() {
        return "===========================================================\n"
                + "DATOS DEL VELERO: \n"
                + "-------------------------------------------------------\n"
                + "CAPITAN ASIGNADO: \n" + capitan_asociado.toString() + "\n"
                + "-------------------------------------------------------\n"
                + "PRECIO BASE: " + precio_base + "\n"
                + "VALOR ADICIONAL: " + this.valor_adicional + "\n"
                + "AÑO DE FABRICACION: " + fabricacion + "\n"
                + "ESLORA: " + eslora + "\n"
                + "CANTIDAD DE MASTILES: " + this.cantidad_mastiles + "\n"
                + "MONTO DE ALQUILER: " + this.getMontoAlquiler() + "\n"
                + "===========================================================\n";
    }

}
