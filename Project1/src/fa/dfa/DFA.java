package fa.dfa;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Andrew Gerber, Cesar Raymundo
 */
import fa.State;

public class DFA implements DFAInterface {

private Set<DFAState> allStates;
private Set<Character> alphabet;
private DFAState startState;

public DFA(){
	//Creating new linkedhashset for states and alphabet
	allStates = new LinkedHashSet<DFAState>();
	alphabet = new LinkedHashSet<Character>();
}
	@Override
	public void addStartState(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addState(String name) {
		// TODO Auto-generated meth
		
	}

	@Override
	public void addFinalState(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTransition(String fromState, char onSymb, String toState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<? extends State> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<? extends State> getFinalStates() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
