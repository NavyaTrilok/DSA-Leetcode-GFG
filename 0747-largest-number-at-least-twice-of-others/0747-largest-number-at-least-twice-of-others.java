class Solution {
    public int dominantIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int index = 0;
        int flag = 0;
        int n = arr.length;
        //int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            //arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        
       for(int i = 0; i < n ; i++){
           if(arr[i] == max) continue;
           else if(2*arr[i] > max){
               flag = 1;
               break;
           }
       }
        
        if(flag == 1){
           return -1;
        }else{
            return index;
        }
    }
}