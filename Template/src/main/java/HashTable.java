import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        // HashMap: Key와 Value를 함께 저장
        Map<String, Integer> map = new HashMap<>();

        // 추가 및 수정
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("apple", 10); // 기존 값 수정

        // 조회
        int value = map.get("apple");
        int defaultValue = map.getOrDefault("orange", 0);

        // Key 존재 여부
        boolean hasKey = map.containsKey("banana");

        // 삭제
        map.remove("banana");

        // 크기
        int mapSize = map.size();

        // Key와 Value 순회
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 단어 개수 세기
        String[] words = {"apple", "banana", "apple"};

        Map<String, Integer> countMap = new HashMap<>();

        for(String word : words) {
            int count = countMap.getOrDefault(word, 0);
            countMap.put(word, count + 1);
        }

        // HashSet: 값만 저장, 중복 허용 안 함
        Set<Integer> set = new HashSet<>();

        // 추가
        set.add(10);
        set.add(20);
        set.add(10); // 중복이라 추가되지 않음

        // 존재 여부
        boolean hasValue = set.contains(20);

        // 삭제
        set.remove(10);

        // 크기
        int setSize = set.size();

        // 전체 순회
        for(int number : set) {
            System.out.println(number);
        }
    }
}