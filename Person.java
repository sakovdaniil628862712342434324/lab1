public class Person {
	// Define the private attributes
	private int personId;
	private String firstName;
	private String lastName;
	private String favoriteColor;
	private int age;
	private boolean isWorking; // Boolean is true/false

	// Constructor to initialize the object
	public Person(int personId, String firstName, String lastName, String favoriteColor, int age, boolean isWorking) {
		this.personId = personId;
		this.firstName = firstName; // Set parameters to private attributes
		this.lastName = lastName;
		this.favoriteColor = favoriteColor;
		this.age = age;
		this.isWorking = isWorking;
	}

	// Getters for accessing data in the Main class and Relation class,
	// cause can't do that directly
	public String getFirstName() {
		return firstName;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public int getAge() {
		return age;
	}

	// Method that prints personal information as: "personId: name’s favorite color
	// is favoriteColor"
	public void displayPersonInfo() {
		System.out.println(personId + ": " + firstName + " " + lastName + "'s favorite color is " + favoriteColor);
	}

	// Setter that changes the person’s favorite color to white
	public void changeFavoriteColor() {
		this.favoriteColor = "White";
	}

	// Returns the person’s age after 10 years
	public int getAgeInTenYears() {
		return this.age + 10;
	}

	// Displays all Person Object information as a list.
	// Overrides the default one to this!
	@Override
	public String toString() {
		return "PersonId: " + personId + "\n" + "FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n"
				+ "FavoriteColor: " + favoriteColor + "\n" + "Age: " + age + "\n" + "IsWorking: " + isWorking;
	}
}