import java.util.ArrayList;
import java.util.HashMap;

public class fearch {

    static int[] selSort(int[] arr) {

        int minIndex, temp;
        for (int i = 0; i < arr.length; i ++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] > arr[minIndex])
                    minIndex = j;
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    static String[] nams() {
        String[] nams = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        return nams;
    }

    public static void main(String[] args) {

        String nam;
        String[] namps;
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : nams()) {
            namps = name.split(" ");
            nam = namps[0];
            map.put(nam, map.containsKey(nam) ? map.get(nam) + 1 : 1);
        }

        int[] arr = map.values().stream().mapToInt(Integer::intValue).toArray();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i > 1 && list.indexOf(i) == -1)
                list.add(i);
        }
    
        int[] artwo = list.stream().mapToInt(Integer::intValue).toArray();

        selSort(artwo);

        for (int i : artwo) {
            for (var j : map.entrySet()) {
                if (j.getValue() == i)
                    System.out.println(j.getKey()+" ("+i+")");
            }
        }
    }
}
