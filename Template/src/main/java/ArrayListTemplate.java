import java.util.*;

public class ArrayListTemplate {
    public static void main(String[] args) {
        // 2차원 ArrayList 생성
        List<List<Integer>> doubleList = new ArrayList<>();

        for(int i=0; i<10; i++) {
            List<Integer> newRow = new ArrayList<>();

            for(int j=1; j<=10; j++) {
                newRow.add(i * 10 + j);
            }

            doubleList.add(newRow);
        }

        System.out.println(doubleList);


        // 1차원 ArrayList 복사
        List<Integer> source = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> shallowCopy1D = new ArrayList<>(source);

        shallowCopy1D.set(0, 100);

        System.out.println(source);        // [1, 2, 3]
        System.out.println(shallowCopy1D); // [100, 2, 3]


        // 2차원 ArrayList 얕은 복사
        List<List<Integer>> original = new ArrayList<>();

        original.add(new ArrayList<>(List.of(1, 2)));
        original.add(new ArrayList<>(List.of(3, 4)));

        List<List<Integer>> shallowCopy2D = new ArrayList<>(original);

        shallowCopy2D.get(0).set(0, 99);

        System.out.println(original);      // [[99, 2], [3, 4]]
        System.out.println(shallowCopy2D); // [[99, 2], [3, 4]]


        // 2차원 ArrayList 깊은 복사
        original = new ArrayList<>();

        original.add(new ArrayList<>(List.of(1, 2)));
        original.add(new ArrayList<>(List.of(3, 4)));

        List<List<Integer>> deepCopy = new ArrayList<>();

        for(List<Integer> row : original) {
            deepCopy.add(new ArrayList<>(row));
        }

        deepCopy.get(0).set(0, 55);

        System.out.println(original); // [[1, 2], [3, 4]]
        System.out.println(deepCopy); // [[55, 2], [3, 4]]
    }
}