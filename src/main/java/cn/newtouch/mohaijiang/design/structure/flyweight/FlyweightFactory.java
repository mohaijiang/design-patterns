package cn.newtouch.mohaijiang.design.structure.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author mohaijiang on 17-9-19
 */
public class FlyweightFactory {

    private Map<String,Flyweight> map;

    private FlyweightFactory(){
        map = Maps.newHashMap();
    }

    public static FlyweightFactory getInstance(){
        return HolderClazz.instance;
    }

    public Flyweight getFlywight(String key){

        return map.computeIfAbsent(key,t -> new ConcreteFlyweight(t));
    }

    private static class HolderClazz{
        private static final FlyweightFactory instance = new FlyweightFactory();
    }
}
