import java.util.*;
public class histogram{
    public static void maxarea(int arr[]){
        int area=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        Stack<Integer>  s=new Stack<>();
        //for next smaller right..
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
    // for next smaller left..
    for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }
        else{
            nsl[i]=s.peek();
        }
        s.push(i);
        
    }   
    // area calculation
       // width= nsr - nsl - 1
       for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width= nsr[i]-nsl[i]-1;
        int curr = height*width;
        area=Math.max(area, curr);
        
       }
       System.out.println(area); 
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,5,6,3};
       maxarea(arr);
    }
}