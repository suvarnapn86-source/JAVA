class timecomplexity {
    public static void main(String[] args){
        int n=5;
        int countA=0;
        int countB=0;
        int countC=0;
        System.out.println("Operation A:Total packages="+n); //A
        countA++;
        System.out.println("Operation A ran"+countA+"time(s)");
        System.out.println("time Complexity:O(1)");
        System.out.println("------------------");
        System.out.println("Operation B:Package numbers 1 to"+n); //B
        for(int i=1;i<=n;i++) {
            System.out.println("Package" + i);
            countB++;
        }
        System.out.println("OPeration B ran"+countC+"time(s)");
        System.out.println("Time Complexity:0(n)");
        System.out.println("------------");
        System.out.println("Operation C:Every pair of packages");
        for(int i=1;i<=n;i++) {
            for (int j=1; j <= n; j++) {
                System.out.println("(" + i + "," + j + ")");
                countC++;
            }
        }
        System.out.println("Operation C ran"+countC+"time(s)");
        System.out.println("Time complexity:O(n^2)");
            }

        }


