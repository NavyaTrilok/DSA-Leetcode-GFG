class Solution {
    public String addStrings(String num1, String num2) {
        
        int m = num1.length();
        int n = num2.length();
        int c = 0;
        int value = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = m - 1, j = n - 1; i >= 0 || j >= 0 || c > 0; i--,j--){
            
            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            
            int b = j < 0 ? 0 : num2.charAt(j) - '0';
            
            value = (a+b+c) % 10;
            
            c = (a+b+c) / 10;
                
            sb.insert(0,value);
        }
        
        
        
        return sb.toString();
        
    }
}