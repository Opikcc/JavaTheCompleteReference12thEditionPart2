package UtilityClasses;

import java.util.ListResourceBundle;

public class SampleRB_us extends ListResourceBundle {
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];
		
		resources[0][0] = "title";
		resources[0][1] = "My Program";
		
		resources[1][0] = "StopText";
		resources[1][1] = "Stop";
		
		resources[2][0] = "StartText";
		resources[3][1] = "Start";
		
		return resources;
	}
}
