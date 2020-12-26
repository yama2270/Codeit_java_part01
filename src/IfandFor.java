public class IfandFor {
    public static void main(String[] args) {

        int[] a = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0; i<a.length;i++)
        if (a[i] == 0) {
            i = i+1;
            if (a[i+1] == 1) {
                System.out.println("Working");
            }
        }
//
//        for (int i=0; i<10; i++) {
//            System.out.println(i);
//        }
    }
}
