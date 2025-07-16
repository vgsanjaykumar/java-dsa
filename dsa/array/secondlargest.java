public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,15,12,17,64,84,84,84,94,89};
        //optimical method single loop
        int firstl=arr[0],secondl=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstl){
                secondl=firstl;
                firstl=arr[i];
            }else if(arr[i]>secondl&&firstl!=secondl){
                secondl=arr[i];
            }
        }
        System.out.println("secobd largest element "+secondl);

        //better method using two loop 
        int a[]={50,60,119,40,30,10,60,50,50,60,100,110,110,120,120,120,120,115};
        int fl=a[0],sl=-1;
        //largest number find pannaum
        for(int i=0;i<a.length;i++){
            if(a[i]>fl){
                fl=a[i];
            }
        }
        System.out.println("largest number in arreay"+fl);

        //secondlargest number find pannaum
        for(int j=0;j<a.length;j++){
            if(a[j]>sl&&a[j]<fl){
                sl=a[j];
            }
        }
        System.out.println("Second laragest number "+sl);
    }
}
