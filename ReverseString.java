public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'H', 'E', 'L', 'L', 'O'};
        int n = arr.length;
        char[] brr = new char[n]; 

        
        
        
        
]
        // Reverse the array
        for (int i = 0; i < n; i++) {
            brr[i] = arr[n - i - 1]; 
        }

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " "); 
        }
    }
}
