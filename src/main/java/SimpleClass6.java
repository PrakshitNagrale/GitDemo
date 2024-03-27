public class SimpleClass6 {

public static void main(String [] args){

    //que--> Replace B with C only inside the brackets

    String A="a[ab]ba[bab]cz";
   // String A="e[exe]a";
    String B="a";
    String C="b";


    char[] arr =A.toCharArray();
    char b=B.charAt(0);
    char c=C.charAt(0);


    for(int i=0;i<arr.length;i++){
        if(arr[i]=='['){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==b){
                    arr[j]=c;
                }
                else if(arr[j]==']'){
                    i=j;
                    break;

                }
            }
        }
    }

    System.out.println(String.valueOf(arr));


    }




}
