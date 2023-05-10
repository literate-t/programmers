package org.programmers;

public class DesktopClean {
    public int[] solution(String[] wallpaper) {
        int minHeight = Integer.MAX_VALUE, minWidth = Integer.MAX_VALUE, maxHeight = Integer.MIN_VALUE, maxWidth = Integer.MIN_VALUE;
        for (int i = 0; i < wallpaper.length; ++i) {
            for (int j = 0; j < wallpaper[i].length(); ++j) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (i < minHeight) minHeight = i;
                    if (j < minWidth) minWidth = j;
                    if (maxHeight < i) maxHeight = i;
                    if (maxWidth < j) maxWidth = j;
                }
            }
        }
        return new int[]{minHeight, minWidth, maxHeight + 1, maxWidth + 1};
    }
}
