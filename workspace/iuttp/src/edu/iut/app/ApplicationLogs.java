package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog i : this) {
			if (i instanceof ApplicationErrorLog)
				filteredLogs.add(i);
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog i : this) {
			if (i instanceof ApplicationWarningLog)
				filteredLogs.add(i);
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog i : this) {
			if (i instanceof ApplicationInfoLog)
				filteredLogs.add(i);
		}
		return filteredLogs;
	}
	
}
