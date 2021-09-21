package Animals;

public abstract class Animal {
	private String name = "";
	
	/* CONSTRUCTOR */
	
	public Animal(String name) {
		setName(name);
	}
	
	/* GETTER & SETTER */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* METHODS */
	
	//Greet
	
	public abstract void greet();
}
