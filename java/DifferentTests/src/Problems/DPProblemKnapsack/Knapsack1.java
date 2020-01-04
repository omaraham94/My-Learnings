package Problems.DPProblemKnapsack;

public class Knapsack1 {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {60,60,60};
        int W = 50;
        int ans = getMaxItems(val, W, weight, 0);
        System.out.println(ans);
    }

    private static int getMaxItems(int[] val, int W, int[] weight, int i) {
        if (i>=val.length) {
            return 0;
        }
        if (W < weight[i]) {
            return (getMaxItems(val, W, weight, i+1));
        }
        return Math.max(val[i] + getMaxItems(val, W-weight[i], weight, i+1),
                getMaxItems(val, W, weight, i+1));
    }
}
