package net.mikemarshall.examples;

public class InventoryItem {
	private String label;
	private String value;
	
	public InventoryItem(String l, String v)
	{
		label = l;
		value= v;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
