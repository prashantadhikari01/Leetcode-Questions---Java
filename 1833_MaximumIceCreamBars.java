class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0, sum = 0;
        for(int i = 0; i < costs.length; i++){
            sum += costs[i];
            if(sum > coins)
                break;
            else 
                count++;
        }
        return count;
    }
}
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;

        for (int cost : costs) {
            if (coins < cost) break;
            coins -= cost;
            count++;
        }

        return count;
    }
}