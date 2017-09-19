package cn.newtouch.mohaijiang.design.structure.composite;

/**
 * @author mohaijiang on 17-9-19
 */
public abstract class Component {

    public abstract void opreation();

    public void add(Component c){
        throw new RuntimeException("不允许执行此操作");
    };

    public void remove(Component c){
        throw new RuntimeException("不允许执行此操作");
    }

    public Component getChild(int i){
        throw new RuntimeException("不允许执行此操作");
    }


}
