class Solution {
    public String multiply(String num1, String num2) {
        int a = num1.length();
        int b = num2.length();

        int[] pos = new int[a+b];
        
        for(int i = a-1; i >= 0; i-- ){
            for(int j = b-1; j>= 0; j--){
                int multi  = (Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j)));

                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = multi + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;

            }

        }

        StringBuilder sb = new StringBuilder();

        for(int p : pos){
            if(!(sb.length() == 0 && p == 0)){
                sb.append(p);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}