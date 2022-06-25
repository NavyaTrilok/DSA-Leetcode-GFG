class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Scanner scn = new Scanner(System.in);

    HashMap<Integer, Integer> map = new HashMap<>();


    for(int i=0;i<nums1.length;i++){
        int key=nums1[i];
        if(map.containsKey(key)){
            int old_fre=map.get(key);
            map.put(key,old_fre+1);
        }else {
            map.put(key,1);
        }

    }
        
        ArrayList<Integer> al = new ArrayList<>();
        
    for(int i=0;i<nums2.length;i++){
        int key=nums2[i];
        
        if(map.containsKey(key)){
          
            al.add(key);
            map.remove(key);
        }
    }
        
        int k=0;
        int[] nums3 = new int[al.size()];

        for(int i=al.size()-1;i>=0;i--){
            nums3[k]=al.remove(i);
            k++;
        }
            
    
      return nums3;

 }

    }
