package cn.newtouch.mohaijiang.design.creator.builder;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author mohaijiang on 17-9-18
 */
@Data
@ToString
public class Product {

    private  String partA; //定义部件，部件可以是任意类型，包括值类型和引用类型
    private  String partB;
    private  String partC;
}
