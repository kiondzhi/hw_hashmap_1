import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> regions = new TreeMap<>();
        regions.put(63, "Samara");
        regions.put(77, "Moscow");
        regions.put(78, "Saint-Petersburg");
        regions.put(64, "Saratov");
        System.out.println(regions);



        ArrayList<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: regions.entrySet()) {
            keys.add(entry.getKey());
        }
        System.out.println(keys);
    }
}