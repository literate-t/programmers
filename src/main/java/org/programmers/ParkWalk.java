package org.programmers;

public class ParkWalk {
    public int[] solution(String[] park, String[] routes) {
        int[] startPoint = new int[2];
        int height = park.length;
        int width = park[0].length();
        char[][] parkMap = new char[park.length][park[0].length()];

        for (int i = 0; i < height; ++i) {
            parkMap[i] = park[i].toCharArray();
            if (park[i].contains("S")) {
                startPoint[0] = i;
                startPoint[1] = park[i].indexOf("S");
            }
        }

        for (String route : routes) {
            String[] result = route.split(" ");
            String direction = result[0];
            String distance = result[1];
            int my = startPoint[0];
            int mx = startPoint[1];

            int move = Integer.parseInt(distance);

            for (int i = 0; i < move; ++i) {
                if (direction.equals("E")) {
                    ++mx;
                } else if (direction.equals("S")) {
                    ++my;
                } else if (direction.equals("W")) {
                    --mx;
                } else if (direction.equals("N")) {
                    --my;
                }

                if ((0 <= my && 0 <= mx && my < height && mx < width )) {
                    if (parkMap[my][mx] == 'X') break;
                    if (i == move - 1) {
                        startPoint[0] = my;
                        startPoint[1] = mx;
                    }
                }
            }
        }

        return startPoint;
    }
}
