import java.util.*;
import java.lang.*;
import java.io.*;
 
class ChefAndEquality{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        while(n-- > 0){
            int greatest = 0;
            long t = Long.parseLong(br.readLine());
            Map<Long,Integer> map = new HashMap<Long,Integer>();
            String pilesString = br.readLine();
            StringTokenizer st = new StringTokenizer(pilesString, " ");
            for(long i=0; i<t; i++){
                Integer count = 0;
                Long pile = Long.valueOf(st.nextToken());
                count = (map.get(pile)==null) ? ++count : map.get(pile)+1;
                map.put(pile,count);
                greatest = (count>greatest) ? count : greatest;
                //System.out.println(pile +"  "+ count);
            }
            //map.clear();
            System.out.println(t-greatest);
        }
    }
}