package com.pl10.seichiba.component;

public class PageItemComponent {

    private int numero;
    private boolean actual;

    public PageItemComponent(int numero, boolean actual) {
        this.numero = numero;
        this.actual = actual;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isActual() {
        return actual;
    }

    @Override
    public String toString() {
        return "PageItemComponent{" +
                "numero=" + numero +
                ", actual=" + actual +
                '}';
    }
}
