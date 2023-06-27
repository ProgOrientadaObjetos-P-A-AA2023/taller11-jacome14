/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

public class MenuEconomico extends Menu {

    private double porcDesc;

    public MenuEconomico(String cade, double valIni, double porcDes) {
        super(cade, valIni);
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
