package cn.newtouch.mohaijiang.design.structure.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author mohaijiang on 17-9-19
 */
public class FlywightFactory {

    private Map<String,Flywight> map;

    private FlywightFactory(){
        map = Maps.newHashMap();
    }

    public static FlywightFactory getInstance(){
        return HolderClazz.instance;
    }

    public Flywight getFlywight(String key){

        return map.computeIfAbsent(key,t -> new ConcreteFlywight(t));
    }

    private static class HolderClazz{
        private static final FlywightFactory instance = new FlywightFactory();
    }
}
