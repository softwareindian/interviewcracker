public class TwoDArrayPrint {
    public static void main(String args[]) {
        
        //1 2 3
        //4 5 6
        //7 8 9
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
    
        // for(int i=0; i<arr.length; i++ ){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int i=0, j=0;
        while(true){
            if(i>arr.length-1){
                break;
            }
            System.out.print(arr[i][j]+", ");
            
            if(j==arr[i].length-1){
                i++;
                j=0;
                System.out.println();
                continue;
            }
            j++;
        }
        
        
    }
}