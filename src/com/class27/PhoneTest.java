package com.class27;

public class PhoneTest {

		public static void main(String[] args) {
			
			//Phone obj=new Phone();ce: cannot instantiate Phone class because it is an abstract class
			Phone phone1=new iPhone();
			phone1.viewPicture();
			phone1.sendText();
		    phone1.unlockPhone();
		    phone1.makeCall();
		    
		    Phone phone2=new Samsung();
		    phone2.sendText();
		    phone2.unlockPhone();
		    phone2.viewPicture();
		    phone2.makeCall();
		}
	}
