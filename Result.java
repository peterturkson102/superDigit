class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters: 
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
         String p =n;
         
         while(p.length()*k>1){
             long sum = 0;
             for(int i = 0;i<p.length();i++){
                 sum+= Character.getNumericValue(p.charAt(i)) ;
             }
             sum = sum*k;
             p= String.valueOf(sum);
             k=1;
         }
         int superD = Integer.valueOf(p);
         
         
    return superD;
    }

}
