package demo03.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例:有序版本
    author:CCCChen
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //创建一个Map集合,存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合,存储花色和牌的序号
        List<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");

        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //把大王和小王存储到集合中
        //定义一个牌的索引
        int index = 0;
        poker.put(index, "Red_Joker");
        pokerIndex.add(index);
        index++;
        poker.put(index, "Black_Joker");
        pokerIndex.add(index);
        index++;

        //循环嵌套遍历两个集合组装52张牌,存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }

        //洗牌    使用Collections中的shuffle(list)
        Collections.shuffle(pokerIndex);

        //发牌    定义四个集合,存储玩家牌的索引和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历存储牌索引的List集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }

        //排序    使用Collections中的sort(list)   默认升序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        lookPoker("张三",poker,player01);
        lookPoker("李四",poker,player02);
        lookPoker("王五",poker,player03);
        lookPoker("底牌",poker,diPai);
    }

    /*
         定义一个看牌的方法提高代码复用性
            参数:
                String name:玩家名称
                HashMap<Integer,String> poker:存储牌的poker集合
                ArrayList<Integer> list:存储玩家和底牌的list集合
            查表法:
                遍历玩家或者底牌集合,获取牌的索引
                使用牌的索引,去poker集合中,找到对应的值
         */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.println(name+": ");
        for (Integer key:list){
            String value = poker.get(key);
            System.out.println(value+" ");
        }
        System.out.println();
    }
}
