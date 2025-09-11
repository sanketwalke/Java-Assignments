interface Father {
    public void property();
}

interface Mother {
    public void property();
}

class Child implements Father, Mother {
    public void property() {
        System.out.println("In Property");
    }
}

class Grandchild1 extends Child {
}

class Grandchild2 extends Child {
}

public class HybridInheritance1 {
    public static void main(String args[]) {
        Child c = new Child();
        c.property();

        Grandchild1 g1 = new Grandchild1();
        g1.property();

        Grandchild2 g2 = new Grandchild2();
        g2.property();
    }
}