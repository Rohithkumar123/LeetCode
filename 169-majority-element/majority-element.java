class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
            map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int n=nums.length;
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }

        }
        return -1;
    
        
    }
}