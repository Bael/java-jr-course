package com.github.bael.course.unit2.examples.override;

public class Shell {
    protected boolean safeMode = false;

    protected void explode() {
        System.out.println("Exploding regular shell!!!");
    }

    protected void lift() {
        if (safeMode) {
            System.out.println("Sucessfully lifting!!!");
        } else {
            System.out.println("BOOOOOOMMM!!!");
            explode();
        }

    }

    protected void prepareToTransporting() {
        System.out.println("Shell can be transported safe!!!");
        safeMode = true;
    }

}
