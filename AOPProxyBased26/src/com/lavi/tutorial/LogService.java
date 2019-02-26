package com.lavi.tutorial;

public class LogService {
    public void logBefore() {
    	System.out.println("LogService::"+" method starts");
    }
    
    public void logAfter() {
    	System.out.println("LogService::"+" method ends");
    }
    
    public void logThrowing(Exception ex) {
    	System.out.println("LogService::"+"Exception occured::"+ex);
    }
}
