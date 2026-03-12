//*how to define an array,inintialize an array,how to store an element in an array

class TestArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};//initialization
        //traversing array
        for (int i = 0; i < a.length; i++) { //length is the property
            System.out.print(a[i]+" ");
        }
        System.out.println();//for space in between elements
        float sum = 0,avg; //average calculation
        for (int i = 0; i < a.length; i++) //calculating the sumof avg//
            sum += a[i];
        avg = sum / a.length;
        System.out.println("Average =" + avg);
    }
}



