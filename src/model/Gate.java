package model;

public class Gate {
	
	protected String type;
	protected boolean firstInput;
	protected boolean secondInput;
	protected boolean output;
	protected int delay;
	
	public Gate() {
		
	}
	
	// To be overwritten by the actual gates, AND, OR ...
	public String getType() {
		return type;
	}
	
	// To return the calculation output
	public boolean getOutput() {
		return output;
	}
	
	// Setting the input to the gate
	public void setInputs(boolean firstInput, boolean secondInput) {
		this.firstInput = firstInput;
		this.secondInput = secondInput;
	}
	
	// Setting the delay of the gate
	public void setDealy(int d) {
		this.delay = d;
	}
}
