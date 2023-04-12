import java.util.*;

/**
 * @author layman
 */
public class Main {
    // 牌堆
    private static Map<Integer, String> pokerMap = new HashMap<>();
    // 花色
    private static ArrayList<String> colors = new ArrayList<>();
    // 数字
    private static ArrayList<String> numbers = new ArrayList<>();
    // 扑克牌的编号集合
    private static ArrayList<Integer> numberList = new ArrayList<>();
    // 玩家编号集合
    private static ArrayList<Integer> noP1 = new ArrayList<>();
    private static ArrayList<Integer> noP2 = new ArrayList<>();
    private static ArrayList<Integer> noP3 = new ArrayList<>();
    // 底牌编号集合
    private static ArrayList<Integer> diPaiNo = new ArrayList<>();

    // 三个玩家
    private static ArrayList<String> playerOne = new ArrayList<String>();
    private static ArrayList<String> playerTwo = new ArrayList<String>();
    private static ArrayList<String> playerThree = new ArrayList<String>();
    // 底牌
    private static ArrayList<String> diPai = new ArrayList<String>();
    /**
     * 创建扑克牌并洗牌
     */
    public static void createPoker(){
        
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        // 设置存储编号
        int count = 1;
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");
        // 创建扑克牌
        for (String number : numbers) {
            for (String color : colors) {
                String card = color + number;
                pokerMap.put(count++, card);
            }
        }
        
        // 先取编号
        Set<Integer> numberSet = pokerMap.keySet();
        numberList.addAll(numberSet);

        // 然后随机洗牌
        Collections.shuffle(numberList);
    }

    /**
     * 发牌
     */
    public static void faPai(){
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            // 留出底牌
            if (i >= 51) {
                diPaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 3 == 1) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }
    }
    /**
     * 发牌并排序
     */
    public static  void sortCards(){
        // 对编号进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(diPaiNo);
        // 进行牌面的转换
        for (Integer i : noP1) {
            // 根据编号获取牌面，并发给对应的玩家
            String card = pokerMap.get(i);
            playerOne.add(card);
        }
        for (Integer i : noP2) {
            String card = pokerMap.get(i);
            playerTwo.add(card);
        }
        for (Integer i : noP3) {
            String card = pokerMap.get(i);
            playerThree.add(card);
        }
        for (Integer i : diPaiNo) {
            String card = pokerMap.get(i);
            diPai.add(card);
        }
    }
    /**
     * 看牌
     */
    public static  void showCards(){
        System.out.println("赌圣：" + playerOne);
        System.out.println("赌侠：" + playerTwo);
        System.out.println("赌王：" + playerThree);
        System.out.println("底牌：" + diPai);
    }
    public static void main(String[] args) {
        createPoker();
        faPai();
        sortCards();
        showCards();
    }
}