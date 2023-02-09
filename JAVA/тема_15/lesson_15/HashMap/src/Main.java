import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Апельсин");
        hashMap.put(2, "Ананас");
        hashMap.put(3, "Груша");
        hashMap.put(4,"Апельсин");

        System.out.println(hashMap);

        System.out.println(hashMap.get(2));

        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);
        for (String val:hashMap.values()){
            System.out.println(val);
        }

    }
}