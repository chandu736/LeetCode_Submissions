/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0,h=n;
        while(l<=h){
        int mid=l+(h-l)/2;
        if(isBadVersion(mid)==true && isBadVersion(mid-1)==false) return mid;
        else if(isBadVersion(mid)==false) l=mid+1;
        else h=mid;
    }
        return -1;
    }
}