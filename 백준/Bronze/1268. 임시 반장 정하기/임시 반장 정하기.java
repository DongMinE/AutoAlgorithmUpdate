import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	    public static void main(String[] args) throws IOException{
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st;
	    	
	    	//입력
	    	int su = Integer.parseInt(br.readLine());
	    	int ban [][] = new int [su][5];	    	
	    	for(int i = 0; i < su; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		for(int j = 0; j < 5; j++) {
	    			ban[i][j] = Integer.parseInt(st.nextToken());	    			    		
	    		}
	    	}
	    	         
	    	//값 구하기 및 출력
	    	int compare = 0;
	    	int banJang = 0;
	    	for(int i = 0; i < su; i++) { 
	    		Set<Integer> equal = new HashSet<>();
    			for(int j = 0; j < 5; j++) {	    		
    				for(int k = 0; k < su; k++) {	
		    			if(i != k && ban[i][j] == ban[k][j]) {
		    				equal.add(k);
		    			}		
    					
	    			}
	    		}
		    	if(equal.size() > compare) {
		    		banJang = i;
		    		compare = equal.size();
		    	}		    	
	    	}
	    	System.out.println(banJang+1);
	    }
}