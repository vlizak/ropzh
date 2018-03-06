package ropzh;

public class Main {
    public static void main(String[] args) {
        Tree firstTree = Tree.treeFactory();
        Tree secondTree = Tree.treeFactory();

        System.out.println(firstTree.getId() + secondTree.getId());
    }
}

class Tree {
    private static int counter = 0;
    private int id;

    private Tree() { 
        id = counter;
    }

    public static Tree treeFactory() {
        increment();
        return new Tree();
    }

    public int getId() {
        return id;
    }

    public static void increment() {
        counter++;
    }
}
