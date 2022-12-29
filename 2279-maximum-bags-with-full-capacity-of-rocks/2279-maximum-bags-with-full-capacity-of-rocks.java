class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

            int[] diffs = new int[capacity.length];
        int count = 0;
        for (int i = 0; i < capacity.length; i++) {
            diffs[i] = capacity[i] - rocks[i];
            if (diffs[i] == 0) {
                count++;
            }
        }
        Arrays.sort(diffs);
        int index = 0;
        while (additionalRocks > 0) {
            if (index >= diffs.length) {
                break;
            }
            int diff = diffs[index];
            index++;
            if (diff == 0) {
                continue;
            }
            if (additionalRocks >= diff) {
                additionalRocks = additionalRocks - diff;
                count++;
            }
        }
        return count;
        
    }
}