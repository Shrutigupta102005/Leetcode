class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int [] rel = new int[accounts.length];
        for(int i =0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length ;j++){
                sum = sum + accounts[i][j];
                            
                   }
            rel[i]=sum;
        }
        int largest = rel[0];
            for(int i =0;i<rel.length;i++){
                if(largest<rel[i]){
                    largest = rel[i];
                }
            }
            
return largest;   
        
    }
}

