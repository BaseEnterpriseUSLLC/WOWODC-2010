package com.wowodc2010.helloD2W;

import er.corebusinesslogic.ERCoreBusinessLogic;
import er.extensions.appserver.ERXApplication;
import er.extensions.appserver.navigation.ERXNavigationManager;

public class Application extends ERXApplication {
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
		setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));
	}
	
    @Override
    public void finishInitialization() {
    	super.finishInitialization();
    	
    	// Setup main navigation
    	ERXNavigationManager.manager().configureNavigation();
    }
    
    public void didFinishLaunching() {
    	super.didFinishLaunching();
    	//Setup preferences for User
    	ERCoreBusinessLogic.sharedInstance().addPreferenceRelationshipToActorEntity("User");
    }
}
