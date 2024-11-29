package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 5},
            {7, 3},
            {3, 5}
        };

        System.out.println(findRichest(accounts));
    }

    static int findRichest(int[][] accounts){
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        

        return maxWealth;
    }
}
