import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        
        for(String p: participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        
        for(String c: completion) {
            participantMap.put(c, participantMap.get(c) - 1);
            
            if(participantMap.get(c) == 0) {
                participantMap.remove(c);
            }
        }
        
        return participantMap.keySet().iterator().next();
    }
}