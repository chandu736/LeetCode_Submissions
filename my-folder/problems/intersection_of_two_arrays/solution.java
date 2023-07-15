class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int a=nums2[i];
            if(set.contains(a)){
                list.add(a);
                set.remove(a);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}