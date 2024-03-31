class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int oneLine = 0;           // X
        int twoLine = park.length; // Y

        for (int i = 0; i < twoLine; i++) {
            oneLine = park[i].length();
            if (park[i].contains("S")) {
                int x = park[i].indexOf("S");
                answer[1] = x;
                break;
            }
            answer[0]++;
        }
        loop1:
        for (String route : routes) {
            String direction = route.split(" ")[0];
            int length = Integer.parseInt(route.split(" ")[1]);
            int tmp = 0;

            switch (direction) {
                case "N":
                    tmp = answer[0];
                    for (int j = 0; j < length; j++) {
                        answer[0] -= 1;
                        if (answer[0] < 0 || park[answer[0]].charAt(answer[1]) == 'X') {
                            answer[0] = tmp;
                            continue loop1;
                        }
                    }
                    break;
                case "E":
                    tmp = answer[1];
                    for (int j = 0; j < length; j++) {
                        answer[1] = answer[1] + 1;
                        if (answer[1] > oneLine - 1 || park[answer[0]].charAt(answer[1]) == 'X') {
                            answer[1] = tmp;
                            continue loop1;
                        }
                    }
                    break;
                case "W":
                    tmp = answer[1];
                    for (int j = 0; j < length; j++) {
                        answer[1] = answer[1] - 1;
                        if (answer[1] < 0 || park[answer[0]].charAt(answer[1]) == 'X') {
                            answer[1] = tmp;
                            continue loop1;
                        }
                    }
                    break;
                case "S":
                    tmp = answer[0];
                    for (int j = 0; j < length; j++) {
                        answer[0] = answer[0] + 1;
                        if (answer[0] > twoLine - 1 || park[answer[0]].charAt(answer[1]) == 'X') {
                            answer[0] = tmp;
                            continue loop1;
                        }
                    }
                    break;
            }
        }
        return answer;
    }
}