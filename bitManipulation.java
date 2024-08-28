// import java.util.Scanner;
// public class bitManipulation {
//     public static void main(String[] args) {
//         System.out.print("Enter a number : ");
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("n = "+n);
//         System.out.println("(n<<1) : "+(n<<1));
//         System.out.println("(n>>1) : "+(n>>1));
//     }
// }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class bitManipulation {

//     public static void main(String[] args) {
//         System.out.print("Enter a number : ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int ans=countSetBits(n);
//         System.out.println("Number of Set Bits in the given number are : "+ans);
//     }
//     public static int countSetBits(int n)
//     {
//         int count=0;
//         while(n!=0)
//         {
//             count=count+(n&1);
//             n=n>>1;
//         }
//         return count;
//     }
// }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class bitManipulation {

//     public static void main(String[] args) {
//         int n=5;
//         int m=10;
//         System.out.println("Before Swapping : ");
//         System.out.println(n);
//         System.out.println(m);
//         n=n^m;
//         m=n^m;
//         n=n^m;
//         System.out.println("After Swapping : ");
//         System.out.println(n);
//         System.out.println(m);
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class bitManipulation {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,3,4,5,6};
//         int xorAll=0;
//         int xorNum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             xorNum^=arr[i];
//         }
//         for(int i=0;i<=arr.length+1;i++)
//         {
//             xorAll^=i;
//         }
//         System.out.println("Missing number is : "+(xorAll^xorNum));
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
