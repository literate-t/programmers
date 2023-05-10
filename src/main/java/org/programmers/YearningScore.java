package org.programmers;

import java.util.*;

public class YearningScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearingMap = new HashMap<>();
        int size = name.length;
        for (int i = 0; i < size; ++i) {
            nameYearingMap.put(name[i], yearning[i]);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < photo.length; ++i) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; ++j) {
                Integer result = nameYearingMap.get(photo[i][j]);
                if (null != result) {
                    sum += nameYearingMap.get(photo[i][j]);
                }
            }
            answer.add(sum);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
