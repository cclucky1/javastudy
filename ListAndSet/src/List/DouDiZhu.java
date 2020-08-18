package List;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] no = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3",};

        poker.add("大王");
        poker.add("小王");

        for (String number : no) {
            for (String color : colors) {
//                System.out.println(color+number);
                poker.add(color + number);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);

        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*
        遍历poker集合，获取每一张牌
        使用poker集合的索引%3给三个玩家轮流发牌
        剩余三张给底牌
        warning：
            先判断底牌(i>=51)，否则牌就发没了
         */

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                player01.add(p);
            } else if (i % 3 == 1) {
                player02.add(p);
            } else if (i % 3 == 2) {
                player03.add(p);
            }
        }
//
//        //看牌
//        System.out.println("Player01" + player01);
//        System.out.println("Player02" + player02);
//        System.out.println("Player03" + player03);
//        System.out.println("底牌" + dipai);
        for (int i = 0; i < player01.size(); i++) {
            System.out.println(player01.get(i));
        }
    }
}
