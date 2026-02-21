 public class reversearr {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        int j = 0;
        for(int i=arr1.length-1;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println(" array in reverse order:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}

