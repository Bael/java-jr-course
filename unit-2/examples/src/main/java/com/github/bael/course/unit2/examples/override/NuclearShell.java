package com.github.bael.course.unit2.examples.override;

public class NuclearShell extends Shell {

    private String location;

    private boolean isShieldInstalled = false;

    protected void lift() {
        if (isShieldInstalled && safeMode) {

            System.out.println("Ready to travel!");
        } else {
            System.out.println("BOOOOOOOM");
            explode();
        }

    }

    // "Переопределяем метод подготовки"
    public void prepareToTransporting(String location) {
        this.location = location;
        this.safeMode = true;
        this.isShieldInstalled = true;
    }

    protected void explode() {
        System.out.println("NUCLEAR EXPLOSION");
    }
}
