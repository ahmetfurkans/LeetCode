// https://leetcode.com/problems/reverse-integer/

class Solution {
    int reverse(int x) {
        if(x == -2147483648){
            return 0;
        }
        boolean flag = false;
        
        if(x < 0){
            flag = true;
            x = -x;
        }

        int sum = 0;
        int digit = 1;
        int temp = x;

        while (x / 10 > 0){
            digit++;
            x = x / 10;
        }

        digit--;

        while (temp / 10 > 0){
            double curr = (temp % 10 * Math.pow(10. , (double) digit));
            if(sum + curr > 2147483647){
                return 0;
            }
            sum += (int) curr;
            temp = temp / 10;
            digit--;
        }

        sum += (int) (temp % 10 * Math.pow(10. , (double) digit));

        return flag?-sum:sum;
    }

}