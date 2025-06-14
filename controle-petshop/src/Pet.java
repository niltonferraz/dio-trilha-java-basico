import java.util.Scanner;

public class Pet {
	private final String name;
	
	private boolean clean;

	public Pet(String name) {
		this.name = name;
		this.clean = false;
	}	


	public boolean isClean() {
		return clean;
	}

	public void setClean(final boolean clean) {
		this.clean = clean;
	}

	public String getName() {
		return name;
	}
	
}
