class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())return false;
                
                if(Check(st.peek(), ch)){
                        st.pop();
                    }
                else{
                        return false;
                    }
                
            }
        }
        if(st.isEmpty())return true;
        return false;
    }
    public boolean Check(char open, char closed){
        if(open == '{' && closed == '}')return true;
        if(open == '[' && closed == ']') return true;
        if(open == '(' && closed == ')') return true;
        return false;
    }
}
