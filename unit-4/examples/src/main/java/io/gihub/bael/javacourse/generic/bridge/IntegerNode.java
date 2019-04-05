package io.gihub.bael.javacourse.generic.bridge;

public class IntegerNode extends Node<Integer> {
    public IntegerNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

