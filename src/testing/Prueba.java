package testing;

import java.util.ArrayList;
import java.util.Random;

public class Prueba {
	private ArrayList<String> list;
	private String[] array;
	
	Prueba(){
		list = new ArrayList<String>();
		array = new String[20];
	}
	
	public void startup() {
		for (int i = 0; i < 20; i++) {
			getList().add(generateRandomWords(1));
			getArray()[i] = generateRandomWords(1);
		}
	}
	
	public String generateRandomWords(int numberOfWords)
	{
	    String randomStrings = null;
	    Random random = new Random();
	    for(int i = 0; i < numberOfWords; i++)
	    {
	        char[] word = new char[random.nextInt(8)+3]; 
	        for(int j = 0; j < word.length; j++)
	        {
	            word[j] = (char)('a' + random.nextInt(26));
	        }
	        randomStrings = new String(word);
	    }
	    return randomStrings;
	}
	
	
	public void mostrarDatos() {
		for(int i = 0; i < getList().size(); i++) {
			System.out.println("ArrayList value " + i + "\n" + getList().get(i));
		}
		for(int i = 0; i < getArray().length; i++) {
			System.out.println("Array value " + i + "\n" + getArray()[i]);
		}
	}
	
	public void eliminarDeList(int cantidad) {
		
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	
}
