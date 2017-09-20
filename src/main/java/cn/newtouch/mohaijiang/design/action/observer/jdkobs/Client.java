package cn.newtouch.mohaijiang.design.action.observer.jdkobs;

/**
 * @author mohaijiang on 17-9-20
 */
public class Client {

    public static void main(String[] args) {

        Team team = new Team();

        Player p1 = new Player("杨过");
        Player p2 = new Player("小龙女");

        team.addObserver(p1);
        team.addObserver(p2);

        team.beAcctack();
    }
}
