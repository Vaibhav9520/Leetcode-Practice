public class ReverseStringSentence {
    public static void main(String[] args) {
        String str = " I am Vaibhav Singh ";

        String[] temp = str.split(" ");
        StringBuilder reverseStr = new StringBuilder();

        for(int i = temp.length-1;i>=0;i--){
            reverseStr.append(temp[i]);
            if(i != 0){
                reverseStr.append(" ");
            }
        }

        System.out.println(reverseStr.toString());
        
    }
}
