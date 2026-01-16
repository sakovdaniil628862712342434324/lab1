import java.util.ArrayList; // I hope we can use this
// formatting shortcut: CMD+Shift+F

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create four objects for the sample run
		Person p1 = new Person(1, "Ian", "Brooks", "Red", 30, true);
		Person p2 = new Person(2, "Gina", "James", "Green", 18, false);
		Person p3 = new Person(3, "Mike", "Briscoe", "Blue", 45, true);
		Person p4 = new Person(4, "Mary", "Beals", "Yellow", 28, true);

		// Display Gina’s information as a sentence
		p2.displayPersonInfo();

		// Display all of Mike’s information (using toString logic;
		// (yes, the one that has been overwritten)
		System.out.println(p3.toString());

		// Change Ian’s Favorite Color to white, and then print his information as a
		// sentence
		p1.changeFavoriteColor();
		p1.displayPersonInfo();

		// Display Mary’s age after ten years
		System.out.println(p4.getFirstName() + " " + "Beals's Age in 10 years is: " + p4.getAgeInTenYears());

		// Create two Relation Objects
		Relation sistersRel = new Relation("Sister");
		Relation brothersRel = new Relation("Brother");

		// Display both relationships
		sistersRel.showRelationShip(p2, p4); // Gina and Mary
		brothersRel.showRelationShip(p1, p3); // Ian and Mike

		// Add all Person objects to a list
		ArrayList<Person> peopleList = new ArrayList<>();
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);

		// The average age of the people in the list
		double totalAge = 0;

		for (Person p : peopleList) {
			totalAge += p.getAge();
		}

		double averageAge = totalAge / peopleList.size();
		System.out.println("Average age is: " + averageAge);

		// The youngest person and the oldest person
		Person youngest = peopleList.get(0);
		Person oldest = peopleList.get(0);

		for (Person p : peopleList) {
			if (p.getAge() < youngest.getAge()) {
				youngest = p;
			}
			if (p.getAge() > oldest.getAge()) {
				oldest = p;
			}
		}
		System.out.println("The youngest person is: " + youngest.getFirstName());
		System.out.println("The oldest person is: " + oldest.getFirstName());

		// The names of the people whose first names start with M
		System.out.println("People starting with M: ");
		for (Person p : peopleList) {
			if (p.getFirstName().startsWith("M")) {
				System.out.println("- " + p.getFirstName());
			}
		}

		// The person information of the person that likes the color blue
		for (Person p : peopleList) {
			if (p.getFavoriteColor().equalsIgnoreCase("Blue")) {
				System.out.println(p.toString());
			}
		}
	}
}