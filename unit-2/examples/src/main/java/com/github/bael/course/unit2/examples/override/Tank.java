package com.github.bael.course.unit2.examples.override;

public class Tank {

    // Перегрузка
    public void shoot(Shell shell) {
        shell.explode();
    }

    // Перегрузка
    public void shoot(ArmorPierceShell shell) {
        shell.explode();
    }

    // Перегрузка
    public void shoot(ArmorPierceShell shell, String message) {
        shell.explode();
    }


}
