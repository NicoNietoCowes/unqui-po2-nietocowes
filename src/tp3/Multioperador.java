package tp3;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> operandos = new ArrayList<Integer>();
	
	public void setOperandos(ArrayList<Integer> operandos) {
        
		this.operandos = operandos;
    }
	
	public ArrayList<Integer> getOperandos() {
		
		return operandos;
	}

	public Integer sumaDeOperandos(ArrayList<Integer> operandos) {
		int sum = 0;
	    for(int i = 0; i<operandos.size(); i++){
	        sum+=operandos.get(i);
	   }
	    return sum;
	}

	public Integer restaDeOperandos(ArrayList<Integer> operandos) {
		int resta = operandos.get(0);
		for(int i = 1; i<operandos.size(); i++){
	        resta-=operandos.get(i);
	   }
	    return resta;
	}

	public Integer multiplicacionDeOperandos(ArrayList<Integer> operandos) {
		int multi = 1;
	    for(int i = 0; i<operandos.size(); i++){
	        multi*=operandos.get(i);
	   }
	    return multi;
	}

}
