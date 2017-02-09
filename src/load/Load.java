package load;

public class Load {
	public static void main(String args[]){
		 
	    int [] memory = new int [100];
	      for(int i=0;i<10;i++){
	      memory[i] = i;
	      }
	    // insert memory 
	    //int[][] i = {{1,3},{23,4},{1,4}};
	    
	    int opcode = 0;
	    int IX121 = 0;
	    int IX=0;
	    int R = 0;
	    int I = 0;
	    int address = 0;
	    int EA = 0;
	    int j = 0;
	    int r = 0;
	      if(I == 0){
	         if (IX == 0){// no indirect addressing
	             EA= memory[address];// just indexing
	         }
	             else {
	             j= memory[IX];
	             EA= memory[address]+memory[j];
	         }
	      }
	      else if(I == 1){
	          if (IX == 0){// indirect address, but no indexing
	              EA= memory[address];
	          }
	          else {
	              j= memory[IX];
	              EA= memory[memory[j]+address];
	          }   
	      }

	    // how to get EA
	        
	    if (opcode == 1){
	        r= memory[EA];
	    }
	    else if (opcode == 2){
	        memory[EA]= r;
	    }
	    else if (opcode == 3){
	        r= EA;     
	    }
	    else if (opcode == 41){
	        j= memory[EA];
	    }
	    else if (opcode == 42){
	        memory[EA]= memory[j];     
	    }
	      }
	}





