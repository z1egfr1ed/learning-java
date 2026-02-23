package anonymous_classes;

public class AnonymousClasses {
	public static void main(String[] args) {

		// Anonymous class = A class that doesn't have a name. Cannot be reused.
		//                   Add custom behavior without having to create a new class.
		//                   Often used for one time uses (TimerTask, Runnable, callbacks)

		Dog dog1 = new Dog();

		// It's a lot of work to create a whole new class for an exception or unique case
		// TalkingDog talkingDog = new TalkingDog();
		// talkingDog.speak();

		// Anonymous Class comes into play
		Dog dog2 = new Dog() {
			@Override
			public void speak() {
				System.out.println("Scooby Doo says ** Ruh Roh **");
			}
		};
		dog1.speak();
		dog2.speak();
	}
}
