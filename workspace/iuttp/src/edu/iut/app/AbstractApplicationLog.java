package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	protected ArrayList<IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
    /** TP1 : Fonction venant de l'interface par heritage */
	public abstract void setMessage(String message);
	
	public String getMessage(){
		return message;
	}
	
	public void addListener(IApplicationLogListener listener){
		listeners.add(listener);
	}
	
	public IApplicationLogListener[] getpplicationLogListeners(){
		return (IApplicationLogListener[])listeners.toArray();
	}

	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
	
}
