package com.jappanigga.rest;

import java.util.ArrayList;
import java.util.List;

import com.jappanigga.dto.Match;

public class DataSingleton {
	
	private static DataSingleton instance = null;
	
	private List<Match> matchList;
	
	protected DataSingleton(){
		this.matchList=new ArrayList<Match>();
	}
	
	public static DataSingleton getInstance(){
		if (instance == null) {
			instance = new DataSingleton();
		}
		return instance;
	}
	
	public void addMatch(Match match){
		matchList.add(match);
	}
	
	public List<Match> getMatchList(){
		return matchList;
	}

}
