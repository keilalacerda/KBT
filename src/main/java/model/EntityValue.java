package model;

import java.util.List;

/**
 * @author Keila Lacerda
 *
 */
public class EntityValue implements Comparable<EntityValue> {
	private String name;
	private List<String> synonyms;
	private boolean main;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}
	public boolean isMain() {
		return main;
	}
	public void setMain(boolean main) {
		this.main = main;
	}
	
	public int compareTo(EntityValue entityValue) {
		return this.name.compareTo(entityValue.getName());
	}
}
