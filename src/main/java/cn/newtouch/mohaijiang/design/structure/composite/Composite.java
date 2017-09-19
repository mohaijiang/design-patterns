package cn.newtouch.mohaijiang.design.structure.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author mohaijiang on 17-9-19
 */
public class Composite extends Component{

    private List<Component> list = Lists.newArrayList();

    @Override
    public void opreation() {
        for(Component c : list){
            c.opreation();
        }
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }
}
