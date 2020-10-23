public class Demo {
  public static String arrToString(int[] arr){

    String ans= "{";
   if (arr.length<1){
     return ("{}");
   }
    for (int i=0; i<arr.length-1; i++){
      ans+= arr[i] +", ";
    }

   ans += arr[arr.length-1] + "}";

   return (ans);
  }
  public static String arrayDeepToString(int[][]arr){
    String ans = "{";
    for (int i=1; i<arr.length; i++){
      ans += arrToString(arr[i-1]) +", ";
    }
    ans += arrToString(arr[arr.length-1]) + "}";
    return ans;
  }

  public static void main(String[] args){
  int n=0;
  if (args.length<1){
    n=5;
  }
  else {
    n = Integer.parseInt(args[0]);
  }
  for(int i=1; i<=n; i++){
    for(int j=0; j<=n-i; j++){
       System.out.print(i);
    }
    System.out.println();
  }
}

}
