package paquete02;

import java.util.List;

public class Cuenta {

    private String nombre;
    private double valorIva;
    private List<Menu> menu;
    private double subtotal;
    private double valorTotal;

    public Cuenta(String nom, List<Menu> men, double iva) {
        nombre = nom;
        menu = men;
        valorIva = iva;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerMenu(List<Menu> men) {
        menu = men;
    }

    public void calcularValorTotal() {
        double valorTot = (subtotal * valorIva) / 100;
        valorTotal = subtotal + valorTot;

    }

    public void CalcularSubtotal() {
        double suma = 0;
        for (int i = 0; i < menu.size(); i++) {
            suma += menu.get(i).obtenerValorMenu();
        }
        subtotal = suma;
    }

    public void  establecervalorIva(double iva) {
        valorIva = iva;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public List<Menu> obtenerMenu() {
        return menu;
    }

    public double obtenerValorCancelar() {
        
        return valorTotal;
        
    }
     public double obtenerValorSubtotal() {
        return subtotal;
    }

    public double obtenerValorIva() {
        return valorIva;
        
    }
    @Override
    public String toString() {
        String cadena = String.format("Factura \n"
                + "Cliente: %s\n",
                obtenerNombre());

        for (int i = 0; i < menu.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }

        cadena = String.format("%sSubtotal: %.2f\n"
                + "Iva: %.2f \n"
                + "Total a Pagar: %.2f\n\n",
                cadena,
                subtotal,
                 valorIva,
                valorTotal);
        return cadena;
    }
}
