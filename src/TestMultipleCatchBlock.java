class TestMultipleCatchBlock {
    public static void main(String[] args){
        try {
            int a[] = new int[5];
            a[10] = 50;
        }
        catch(ArithmeticException e) {
            System.out.println("task 1is completed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tacompleted");
        }
        catch(Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest pof the code...");
        }
    }
