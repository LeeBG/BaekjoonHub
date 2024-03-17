import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<int[]> events = new ArrayList<>();
        for (int[] line : lines) {
            events.add(new int[]{line[0], 1}); // 시작점 이벤트
            events.add(new int[]{line[1], -1}); // 끝점 이벤트
        }

        // 이벤트를 시간 순서대로 정렬
        events.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int answer = 0;
        int count = 0; // 겹치는 선분의 수
        Integer overlapStart = null; // 겹치는 구간의 시작점

        for (int[] event : events) {
            if (event[1] == 1) { // 선분 시작
                count++;
                if (count == 2) { // 겹치는 구간 시작
                    overlapStart = event[0];
                }
            } else { // 선분 끝
                if (count == 2) { // 겹치는 구간 끝
                    answer += event[0] - overlapStart;
                }
                count--;
            }
        }

        return answer;
    }
}