class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        int open=0;
        int balance=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
                balance++;
            }else if(ch==')'){
                if(balance==0) continue;
                balance--;
            }
            sb.append(ch);
        }
        StringBuilder result=new StringBuilder();
        int count=open-balance;
        for(char ch:sb.toString().toCharArray()){
            if(ch=='('){
                if(count<=0) continue;
                count--;
            }
            result.append(ch);
        }
        return result.toString();
    }
}