class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        
        if(number < 0){
            return false;
        }else if(x/10 == x){
            return true;
        }


        while(x != 0){
            int digit = x % 10;
            reverse = reverse*10 + digit;
            x = x / 10;
            System.out.println(reverse);

            if(number == reverse){
                return true;
            }
        }
       

        return false;
    }
}
