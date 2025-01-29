import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
            List<String> aList = new ArrayList<>();
            for (int i = 0; i < args.length; i++)
                aList.add(args[i]);
            System.out.println(aList +" : Defult args");
            Collections.shuffle(aList, new Random());
            System.out.println(aList +" : Random args");

            Set<String> hSet = new HashSet<>();
            hSet.add("OOP");
            hSet.add("GG");
            hSet.add("EZ");
            hSet.add("F");
            hSet.add("not");
            hSet.add("drop");
            hSet.add("GG");
            hSet.add("GG");
            hSet.add("GG");
            hSet.add("GG");
            hSet.add("GG");
            hSet.remove("GG");
            System.out.println(hSet + " : HashSet");

            SortedSet<String> sSet = new TreeSet<>();
            sSet.add("OOP");
            sSet.add("GG");
            sSet.add("EZ");
            sSet.add("F");
            sSet.add("not");
            sSet.add("drop");
            sSet.add("GG");
            sSet.add("ZZZ");
            sSet.add("123");
            System.out.println(sSet + " : TreeSet");

            Stack<String> stacko = new Stack<>();
            stacko.push("a");
            stacko.push("b");
            stacko.push("c");
            System.out.println(stacko);
            System.out.println(stacko.pop());
            System.out.println(stacko);

            Map<String, Color> favoriteColors = new HashMap<String, Color>();
            favoriteColors.put("Robert", Color.BLACK);
            favoriteColors.put("Mark", Color.WHITE);
            favoriteColors.put("Pedro", Color.YELLOW);
            favoriteColors.put("Cole", Color.BLUE);
            Set<String> keySet = favoriteColors.keySet();
            for (String key : keySet) {
                    Color value = favoriteColors.get(key);
                    System.out.println(key + ":" + value);
            }

            Map<String, Color> favColors = new TreeMap<>();
            favColors.put("Robert", Color.BLACK);
            favColors.put("Mark", Color.WHITE);
            favColors.put("Pedro", Color.YELLOW);
            favColors.put("Cole", Color.BLUE);
            Set<String> keySet2 = favColors.keySet();
            for (String key : keySet2) {
                    Color value = favColors.get(key);
                    System.out.println(key + ":" + value);
            }
    }
}
