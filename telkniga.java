import java.util.HashMap;
import java.util.Map;

public class telkniga {

    static Map<Integer, String> phonmp() {
        Map<Integer, String> nums = new HashMap<>(Map.of(
            1, "111",
            2, "321",
            3, "165",
            4, "426"
            // 5, "364",
            // 6, "762",
            // 7, "264"
        ));
        return nums;
    }

    static Map<Integer, String> calmp() {
        Map<Integer, String> nams = new HashMap<>(Map.of(
            1, "Иван Иванов",
            2, "Светлана Петрова",
            3, "Кристина Белова",
            4, "Анна Мусина"
            // 5, "Анна Крутова",
            // 6, "Иван Юрин",
            // 7, "Петр Лыков",
            // 8, "Павел Чернов",
            // 9, "Петр Чернышев",
            // 10, "Мария Федорова",
            // 11, "Марина Светлова",
            // 12, "Мария Савина",
            // 13, "Мария Рыкова",
            // 14, "Марина Лугова",
            // 15, "Анна Владимировна",
            // 16, "Иван Мечников",
            // 17, "Петр Петин",
            // 18, "Иван Ежов"
        ));
        return nams;
    }

    static Map<Integer, Integer> sharmp() {
        Map<Integer, Integer> phon_colmp = new HashMap<>(Map.of(
            1, 1,
            2, 3,
            3, 4,
            4, 1
        ));
        return phon_colmp;
    }

    public static void main(String[] args) {
        Integer choose = 1;
        System.out.println(calmp().get(choose)+':');
        int tel_id;
        int user_id;
        for (var item : sharmp().entrySet()) {
            tel_id = item.getKey();
            user_id = item.getValue();
            if (user_id == choose)
                System.out.println(phonmp().get(tel_id));
        }
}}
