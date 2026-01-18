class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0 ;
        for(int i = 0 ;i <s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                v++;
            }else if(ch == 'b' || ch =='c'||ch == 'd' || ch =='f'|| ch =='g'||ch == 'h' || ch =='j'||ch == 'k' || ch =='l'||ch == 'm' || ch =='n'||ch == 'p' || ch =='q'||ch == 'r' || ch =='s'||ch == 't' ||ch == 'v' || ch =='w'||ch == 'x' || ch =='y'||ch == 'z' ){
                c++;
            }
        }
        if( c == 0){
            return 0 ;
        }else{
            return (int) Math.floor(v/c);
        }
    }
}