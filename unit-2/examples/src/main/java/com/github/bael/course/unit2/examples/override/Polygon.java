package com.github.bael.course.unit2.examples.override;

/** Пример обычной перегрузки */
public class Polygon {


    public static void main(String[] args) {

        Polygon p = new Polygon();
//        Shell shell = new Shell();
//        p.disarm(shell);
//
//        Shell shell2 = new ArmorPierceShell();
//        p.disarm(shell2);

        NuclearShell shell3 = new NuclearShell();
        p.disarm(shell3);

    }

    private void transportToPolygon(Shell shell) {
        shell.prepareToTransporting();
        System.out.println("Deliver to safe place.");
    }
    private void transportToPolygon(NuclearShell shell) {
        shell.prepareToTransporting();
        System.out.println("Deliver to safe place.");
    }

    public void disarm(Shell shell) {
        transportToPolygon(shell);
        System.out.println("Explode regular shell!");
        shell.explode();
    }

    public void disarm(NuclearShell shell) {
        transportToPolygon(shell);
        System.out.println("Explode regular shell!");
        shell.explode();
    }

    public void disarm(Shell shell, String stellar) {
        transportToPolygon(shell);
        System.out.println("Explode regular shell on site №" + stellar );
        shell.explode();
    }

    public void disarm(ArmorPierceShell shell) {
        transportToPolygon(shell);
        System.out.println("Explode ARMOR PIERCING SHELL");
        shell.explode();
    }

}
