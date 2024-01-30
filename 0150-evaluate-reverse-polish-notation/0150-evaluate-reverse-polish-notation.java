class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String str:tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(doMath(num1,num2,str));
                continue;
            }
            stack.push(Integer.valueOf(str));
        }
        return stack.peek();
    }
    public int doMath(int x,int y,String s){
        if(s.equals("+")){
            return x+y;
        }else if(s.equals("-")){
            return x-y;
        }else if(s.equals("*")){
            return x*y;
        }else{
            if(y==0) return 0;
            else return x/y;
        }
    }
}