package com.palletp.arrayloop;

public class CharacterArray {

	public static void main(String[] args) {
		
     String name = "Rangadu";
     
    char cChar[]= name.toCharArray();
     int count =0;
        for(char c:cChar) {
        	
        	if(c=='a') {
        		count++;
        	}
        }
        System.out.println(count);
        
        char ch1[]= new char[name.length()];
        
    	for(int i=0;i<name.length();i++) {
    		
    		ch1[i]=name.charAt(i);
    	}
    	
    	int res=0;
    	for(char ch:ch1) {
    		
    		if(ch=='a') {
    			res++;
    		}
    	}
    	System.out.println(res);
    	
    	for(char i=65;i<91;i++) {
    		System.out.println(i);
    		
    	}
    	
	}
	
	
	// another Way 
	
	
	
	

}
