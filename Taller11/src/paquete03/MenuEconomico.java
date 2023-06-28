
package paquete03;

import paquete02.Menu;

public class MenuEconomico extends Menu {

    private double porcDesc;

    public MenuEconomico(String nompl, double vi, double porcDes) {
        super(nompl, vi);
        porcDesc = porcDes;
    }

    public void establecerDescuentoP(double n) {
        porcDesc = n;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial * porcDesc / 100);
    }

    public double obtenerDescuentoP() {
        return porcDesc;
    }
    
    public double obtenerValorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Económico:\n"
                + "\tNombre del Plato: %s\n"
                + "\tValor Inicial del menú: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerDescuentoP(),
                obtenerValorMenu());

        return cadena;
    }
}
