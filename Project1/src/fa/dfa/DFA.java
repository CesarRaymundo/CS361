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
		// TODO Auto-generated method stub
		
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
    
    
}
