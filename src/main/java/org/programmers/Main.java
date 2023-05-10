package org.programmers;

public class Main {
    public static void main(String[] args) {
     DesktopClean answer = new DesktopClean();
     var result = answer.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});

      for (int item : result) {
          System.out.println("item = " + item);
      }
    }
}