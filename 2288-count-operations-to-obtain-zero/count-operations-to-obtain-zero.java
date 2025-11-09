class Solution {
    static int helper(int num1, int num2,int operation){
        if(num1==0||num2==0)return operation;
        if(num1>=num2){
            return helper(num1-num2,num2,operation+1);
        }else{
            return helper(num1,num2-num1,operation+1);
        }
    }
    public int countOperations(int num1, int num2) {
        return helper(num1,num2,0);
    }
}