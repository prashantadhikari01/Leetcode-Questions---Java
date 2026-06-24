class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] count = new int [5];
        for(char ch: text.toCharArray()){
            if(ch == 'b')
                count[0]++;
            else if(ch == 'a')
                count[1]++;
            else if(ch == 'l')
                count[2]++;
            else if(ch == 'o')
                count[3]++;
            else if(ch == 'n')
                count[4]++;
            else
                continue;
        }
        count[2] /= 2;
        count[3] /= 2;

        int min = count[0];

        for(int m: count){
            if(m < min)
                min = m;
        }

        return(min);
    }
}