class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        int N = arr.length;

        for(int i=0; i<N; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(int j=0; j<N; j++){
            if(map.get(arr[j]) == 1){
                count++;
                if(count == k){
                    return arr[j];
                }
            }
        }

        return "";
    }
}
/*
a : [2,0]
b : [1,1] // count, index
c : [1,3] // count, index
e : [1,2] // count, index
t : [1,5] // count, index

[string, index]
b, 1
e, 2
c, 3
t, 5

["d","b","c","b","c","a"]

map
string, count
d : 1
b : 2
c : 2
a : 1

["d","b","c","b","c","a"]
d : 1 count++; 1 count==k?
a : 1 count++; 2 count==k return a



 */