public class Relation {
	// Attribute
	private String relationshipType;

	// Constructor
	public Relation(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	// This method gets two Person objects (from parameters)
	// and displays the relationship between them in the console
	public void showRelationShip(Person p1, Person p2) {
		// Formatting logic
		String outputType = relationshipType;

		if (relationshipType.equalsIgnoreCase("Sister")) {
			outputType = "Sisterhood";
		} else if (relationshipType.equalsIgnoreCase("Brother")) {
			outputType = "Brotherhood";
		} else if (relationshipType.equalsIgnoreCase("Mother")) {
			outputType = "Motherhood";
		} else if (relationshipType.equalsIgnoreCase("Father")) {
			outputType = "Fatherhood";
		}

		System.out.println(
				"Relationship between " + p1.getFirstName() + " and " + p2.getFirstName() + " is: " + outputType);
	}
}