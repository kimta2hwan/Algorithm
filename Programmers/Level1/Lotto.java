class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] score = {6, 6, 5, 4, 3, 2, 1};
        int count = 0; int zero = 0;
    
        for (int lotto : lottos) {
            if (lotto == 0) zero++;
            else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) count++;
                }
            }
        }
    
        int[] answer = {score[count + zero], score[count]};
    
        return answer;
    }
}