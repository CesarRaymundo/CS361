package fa.dfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
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
		//CHECK
		DFAState state = new DFAState(name);
		startState = state;
		statesSet.add(state);
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
		if(!alphabet.contains(onSymb)) {
			alphabet.add(onSymb);
		}
		//TODO
		/*
		 *  iterate through the statesSet till i get to the first state then add its trans to the next one
		 */
		//really bad way to do this but oh well
		Iterator<DFAState> toItr = statesSet.iterator();
		Iterator<DFAState> fromItr = statesSet.iterator();
		DFAState fromS = fromItr.next();
		while(fromItr.hasNext() && !fromS.getName().equals(fromState)) {
			fromS = fromItr.next();
		}

		DFAState toS = toItr.next();
		while(toItr.hasNext() && !toS.getName().equals(fromState)) {
			toS = toItr.next();
		}
		
		fromS.addTransition(onSymb, toS);
		
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

	
	
	/**
	 * Simulates a DFA on input s to determine
	 * whether the DFA accepts s.
	 * @param s - the input string
	 * @return true if s in the language of the DFA and false otherwise
	 */
	@Override
	public boolean accepts(String s) {
		
		//convert string to array list/ list
		//char[] chars = s.toCharArray();
		DFAState current = startState;
		for(char ch : s.toCharArray()) {
			if(current.transition(ch) == null)
			{
				return false;
			}
			current = current.transition(ch);
		}
		if(finalStates.contains(current)) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		return from.transition(onSymb);
	}
	
	
	/**
	 * Construct the textual representation of the DFA, for example
	 * A simple two state DFA
	 * Q = { a b }
	 * Sigma = { 0 1 }
	 * delta =
	 *		0	1	
	 *	a	a	b	
	 *	b	a	b	
	 * q0 = a
	 * F = { b }
	 * 
	 * The order of the states and the alphabet is the order
	 * in which they were instantiated in the DFA.
	 * @return String representation of the DFA
	 */
	public String toString() {
		//TODO
		return null;
	}
    
    
}
