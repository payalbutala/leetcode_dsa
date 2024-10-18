class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count=0;

        // Add all characters of jewels in HAshSet : as jewels has unique characters
        for(int i=0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }

        // Iterating through stones and checking if it exists in set -> YES increment count
        for(int j=0; j<stones.length(); j++){
            if(set.contains(stones.charAt(j))){
                count++;
            }
        }

        return count;
    }
}