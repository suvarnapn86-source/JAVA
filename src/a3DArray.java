 class a3DArray {
    public static void main(String [] args){
        int my3DArray[][][]=new int[3][4][6];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    my3DArray[i][j][k]=i+j+k;
                }                                     //this program creates a 3D integer array of size 3*4*5and fils,each
                //each element with the sum of its indices(i+j+k),it is uses nested loops to print all the array elements ina structred format

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for (int k=0;k<5;k++){
                    System.out.print(my3DArray[i][j][k] + "");
                }
                System.out.println("");
            }
            System.out.println();
            }
    }
}
