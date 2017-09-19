package cn.newtouch.mohaijiang.design.structure.composite;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        Component root = new Composite();

        Component f1 = new Composite();

        Component l1 = new Leaf();

        Component l2 = new Leaf();


        f1.add(l1);

        root.add(f1);
        root.add(l2);

        root.opreation();

    }
}
