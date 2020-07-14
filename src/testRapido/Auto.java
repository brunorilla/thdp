package testRapido;



public class Auto {
	private int id;
	public Auto(int id) {
		setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + "]";
	}

	
}
