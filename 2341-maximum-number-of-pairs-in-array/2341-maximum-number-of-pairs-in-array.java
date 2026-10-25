class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count=0;
    HashSet<Integer>set=new HashSet<>();
    for(int i:nums){
        if(set.contains(i)){set.remove(i);
        count++;}
        else {set.add(i);}
    }
    int size=set.size();
    return new int[]{count,size};
    }
}