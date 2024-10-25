class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=a.length-target;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length-target;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }  
}