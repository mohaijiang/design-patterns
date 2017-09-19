package cn.newtouch.mohaijiang.design.action.responsibilitychain;

/**
 * @author mohaijiang on 17-9-19
 */
public class ConcreteHandler extends Handler{

    @Override
    public void handlerRequest(String request) {

        if(request.equalsIgnoreCase("some condition")){
            //do somethine
        }else {
            super.successor.handlerRequest(request);
        }
    }
}
