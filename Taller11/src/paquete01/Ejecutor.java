package paquete01;

import java.util.ArrayList;
import java.util.List;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete03.MenuCarta;
import paquete03.MenuDelDia;
import paquete03.MenuEconomico;
import paquete03.MenuNinos;

public class Ejecutor {

    public static void main(String[] args) {

        List<Menu> lista = new ArrayList<>();

        MenuNinos Ninos1 = new MenuNinos("Niños 01", 2.00, 1.00, 1.50);
        MenuNinos Ninos2 = new MenuNinos("Niños 02 ", 3.00, 1.00, 1.50);

        MenuEconomico Economico1 = new MenuEconomico("Econo 001 ", 4.00, 25.00);

        MenuDelDia DiaMenu = new MenuDelDia("DIA 001", 5.00, 1.00, 1.00);

        MenuCarta CartaMenu = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10);

        lista.add(Ninos1);
        lista.add(Ninos2);
        lista.add(Economico1);
        lista.add(DiaMenu);
        lista.add(CartaMenu);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta("René Elizalde", lista, 10);
        cuenta.CalcularSubtotal();
        cuenta.calcularValorTotal();

        System.out.println(cuenta);

    }

}

// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
