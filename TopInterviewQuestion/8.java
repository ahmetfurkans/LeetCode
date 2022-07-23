// https://leetcode.com/problems/string-to-integer-atoi/
class Solution {
    public int myAtoi(String s){
        long sum = 0;
        int flag = 1;
        int n = -1;
        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                n++;
            }else if((temp == '+' || temp == '-') && i == 0){
                flag = temp == '-'? -1 : 1;
            }else{
                break;
            }
        }
        String temp2 = flag == -1 ? "-" : "+";
        s = s.replace(temp2, "");
        for(int i= 0 ; i < s.length();i++){
            char temp = s.charAt(i);
            if(!Character.isDigit(temp)){
                return (int) sum * flag;
            }else if(flag * sum > Integer.MAX_VALUE || flag * sum < Integer.MIN_VALUE){
                return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }else{
                sum += ( temp - 48) * Math.pow(10., n);
                n--;
            }
        }

        if(flag * sum > Integer.MAX_VALUE || flag * sum < Integer.MIN_VALUE) {
            return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return  (int) (flag * sum);
    }
}