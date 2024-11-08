class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        int N1 = words1.length;
        int N2 = words2.length; 
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(int i=0; i<N1; i++){
            if(map1.containsKey(words1[i])){
                map1.put(words1[i], map1.get(words1[i])+1);
            } else {
                map1.put(words1[i], 1);
            }
        }        

        for(int i=0; i<N2; i++){
            if(map2.containsKey(words2[i])){
                map2.put(words2[i], map2.get(words2[i])+1);
            } else {
                map2.put(words2[i], 1);
            }
        }

        for(String str : map1.keySet()){
            if(map1.get(str) == 1 && map2.containsKey(str) && map2.get(str)==1 ){
                count++;
            }
        }

        return count;
    }
}
/*
1st iteration ["leetcode","is","amazing","as","is"] and store in map[string, count]
"leetcode" : 1
"is": 2
"amazing" : 1
"as" : 1

Iterate ["amazing","leetcode","is"]
check count of word : "amazing" in map == 1 ansCount++



["a","ab"], words2 = ["a","a","a","ab"]
Iterate arr1 and store in map
a : -2
ab : 0

iterate in arr2 and 






 */