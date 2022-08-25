class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        do {
            slow = HappySq(slow);
            fast = HappySq(HappySq(fast));
        } while (slow!=fast);
        return slow == 1? true: false;
    }
    
    private int HappySq(int n) {
        int num = 0;
        while(n != 0) {
            num = num + (n%10) * (n%10);
            n= n/10;
        }
        return num;
    
    }
}