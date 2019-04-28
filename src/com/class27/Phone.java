package com.class27;

public abstract class Phone {// abstract class

	public void makeCall() {
		System.out.println("Phone can make call");
	}
	public void sendText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone();
	public abstract void viewPicture();	
}
class iPhone extends Phone{
	public void viewPicture() {
		System.out.println("To view picture in iPhone can go to the Image");
	}

	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone we need to use your face Id or fingerprint");
	}
}
class Samsung extends Phone{
	public void unlockPhone() {
		System.out.println("To unlock Samsung we need to inter password");
	}

	@Override
	public void viewPicture() {
		System.out.println("To view we have to go to the gallary");
		
	}
}