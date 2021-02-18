package fa.dfa;
import java.util.HashMap;

import fa.State;

public class DFAState extends State{
	
	private String name;
	//Map of transitions on a character fir the given state
	private HashMap<Character , DFAState> transitionMap;
	
	/**
	 * Constructor
	 * 
	 * @param name - name of the state
	 */
	public DFAState(String name) {
		this.name = name;
		transitionMap = new HashMap<Character, DFAState>();
	}
	
	/**
	 * Method to add a transition to the DFA
	 * @param onSymb - symbol need to make transition to toState
	 * @param toState - state that will be transitioned to
	 */
	public void addTransition(char onSymb, DFAState toState) {
		transitionMap.put(onSymb, toState);
	}
	
	/**
	 * Returns the hashmap containing the transitions.
	 * @return
	 */
	public HashMap getMap() {
		return transitionMap;
	}

}
