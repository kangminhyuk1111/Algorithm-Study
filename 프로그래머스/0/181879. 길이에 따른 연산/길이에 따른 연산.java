class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11){
            for(int num: num_list){
                answer = answer + num;
            }
        } else {
            answer = 1;
            for(int num: num_list){
                answer = answer * num;
            }   
        }
        return answer;
    }
}