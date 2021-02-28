package fa.dfa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Andrew Gerber, Cesar Raymundo
 */
import fa.State;

public class DFA implements DFAInterface {

	private LinkedHashSet<DFAState> statesSet; //holds all the states of the DFA
	private HashSet<Character> alphabet; //includes all letters used
	private DFAState startState; //starting state
	private LinkedHashSet<DFAState> finalStates; //holds all final states
	

public DFA(){
	//Creating new linkedhashset for stateSet and final state and creating a hashset for alphabet
	statesSet = new LinkedHashSet<>();
	finalStates = new LinkedHashSet<>();
	alphabet = new HashSet<>();
}
	@Override
	public void addStartState(String name) {
	
	}

	@Override
	public void addState(String name) {
		DFAState state = new DFAState(name);
		//checks to make sure that it is not a startState, stateSet or a finalState
		if (!(state.equals(startState) && !(finalStates.contains(state)))){ 
			statesSet.add(state);
		}
		
	}

	@Override
	public void addFinalState(String name) {
		DFAState state = new DFAState(name);
		statesSet.add(state);
		finalStates.add(state);
	}

	@Override
	public void addTransition(String fromState, char onSymb, String toState) {
		
	}

	@Override
	public Set<? extends State> getStates() {
		return statesSet;
	}

	@Override
	public Set<? extends State> getFinalStates() {
		return finalStates;
	}

	@Override
	public State getStartState() {
		return startState;
	}

	@Override
	public Set<Character> getABC() {
		return alphabet;
	}

	@Override
	public boolean accepts(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		return from.transition(onSymb);
	}
    
	/**
	 * Returns a String in the format with the following order:
	 * Q = {Whole set of States}
	 * Sigma = {alphabet}
	 * Delta = {transitions}
	 * q0 = {start state}
	 * F = {final state}a
	 * return string with specified format
	 */
	public String toString() {
		String formatedString = "";
	
		//printing the whole set of states
		formatedString += "Q = { ";
		Object[] statesArray  = statesSet.toArray();
		for (int i = 0; i < statesArray.length; i++) {
			formatedString += statesArray[i] + " ";
		}
		formatedString += "} \n";
		
		//printing alphabet
		formatedString += "Sigma = { ";
		Object[] alphabetArray = alphabet.toArray();
		for (int i = 0; i < alphabetArray.length; i++) {
			formatedString += alphabetArray[i] + " ";
		}
		formatedString += "} \n";
		
		//printing delta
		formatedString += "delta =  \n\t";
		//for every character in alphabet
		for (int i = 0; i < alphabetArray.length; i++) { 
			formatedString += alphabetArray[i] + " ";
			
		}
		formatedString += "\n\t";
		
		for (int j = 0; j < statesArray.length; j++) { //for every state
			formatedString += statesArray[j] + "\t";
			for (int i = 0; i < alphabetArray.length; i++) {
				//adds the resulting state of the transition to the output string
				formatedString += getToState((DFAState)statesArray[j], (Character)alphabetArray[i]); 
				formatedString += " ";
			}
			//get transition given state and character
			
			formatedString += "\n\t"; //go onto next state
		}
		formatedString += "\n";
		
		//printing start state
		formatedString += "q0 = " + startState + "\n";
		
		//printing final state
		formatedString += "F = { ";
		Object[] finalArray = finalStates.toArray();
		for (int i = 0; i < finalArray.length; i++) {
			formatedString += finalArray[i] + " ";
		}
		formatedString += "} \n";
		
		
		
		return formatedString;
	}
    
}
