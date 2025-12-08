package Arrays;


public class Array {

    //طباعه
    public void traversal(int[] number){
        for(int i=0;i<number.length;i++)
            System.out.println("Index["+i+"]="+number[i]);
    }

    public void R_traversal(int[]a){
        for(int i = a.length-1; i >= 0; i--)
            System.out.println("Index["+i+"]="+a[i]);
    }



    //تعديل
    public void update(int[] a, int index, int nvalue) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = nvalue;
    }


    //حذف
    public void delete(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = 0;
    }

    public void shiftLeft_Delete(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 6;
    }


    public void shiftRight_Delete(int[] a, int index) {
        for(int i = index; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = a[1] - 1;
    }


    //بحث
    public int LinearSearch(int []a, int svalue){
        for (int i=0; i<a.length;i++)
        {
            if(svalue==a[i])
                return i;
        }
        return -1;
    }

    public int BinarySearch(int []a, int svalue ,int findex ,int lindex){
        while (findex<=lindex){
            int mid=(findex+lindex)/2;
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if(svalue<a[mid])
                lindex=mid-1;
        }
        return -1;
    }

    public int binarySearch(int []a, int svalue ){
        int findex=0;
        int lindex=a.length-1;
        while (findex<=lindex){
            int mid=(findex+lindex)/2;
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if(svalue<a[mid])
                lindex=mid-1;
        }
        return -1;
    }
}