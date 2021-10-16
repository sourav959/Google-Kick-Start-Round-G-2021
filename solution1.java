import java.util.*;

class Solution{
    
    public static String solve(int n, int d,long c,int m,String str){
        int count_d=0,count_c=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='D')
                count_d++;
            else
                count_c++;
        }
        if(d<count_d)
            return "NO";
        if(c>=count_c)
            return "YES";
            
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='D'){
                count_d--;
                c+=m;
            }else{
                c--;
            }
            
            if(count_d==0)
                return "YES";
            if(c<0)
                return "NO";
            
        }
        
        return "YES";
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=1;i<=test;i++){
            int n=sc.nextInt();
            int d=sc.nextInt();
            long c=sc.nextInt();
            int m=sc.nextInt();
            String str=sc.next();
            
            
            System.out.println("Case #"+i+": "+solve(n,d,c,m,str));
        }
    }
}