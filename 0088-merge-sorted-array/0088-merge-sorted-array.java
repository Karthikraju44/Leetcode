class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0;
        int j=0;
        int k=0;
        int s=m+n;
        int[] res=new int[s];
        while(i<m || j<n){
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    res[k]=nums1[i];
                    i++;
                    k++;
                }
                else{
                    res[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            else if(i<m){
                res[k]=nums1[i];
                i++;
                k++;
            }
            else{
                res[k]=nums2[j];
                j++;
                k++;
            }

        }
        for(int z=0;z<s;z++){
            nums1[z]=res[z];
        }
    }
}