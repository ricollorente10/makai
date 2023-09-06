package paquete;

public class yate extends embarcacion {

    private int cantidad_camarotes;

    public yate(capitan capitan_asociado, double precio_base, int fabricacion, double eslora, int cantidad_camarotes) {
        this.capitan_asociado = capitan_asociado;
        this.precio_base = precio_base;
        this.fabricacion = fabricacion;
        if (this.fabricacion > 2020) {
            this.valor_adicional = 20000;
        }
        this.eslora = eslora;
        this.cantidad_camarotes = cantidad_camarotes;
    }

    @Override
    public String toString() {
        return "===========================================================\n"
                + "DATOS DEL YATE: \n"
                + "-------------------------------------------------------\n"
                + "CAPITAN ASIGNADO: \n" + capitan_asociado.toString() + "\n"
                + "-------------------------------------------------------\n"
                + "PRECIO BASE: " + precio_base + "\n"
                + "VALOR ADICIONAL: " + this.valor_adicional + "\n"
                + "AÑO DE FABRICACION: " + fabricacion + "\n"
                + "ESLORA: " + eslora + "\n"
                + "CANTIDAD DE CAMAROTES: " + this.cantidad_camarotes + "\n"
                + "MONTO DE ALQUILER: " + this.getMontoAlquiler() + "\n"
                + "===========================================================\n";
    }

}
