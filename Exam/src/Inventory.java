import linkedlist.DoublyLinkedList;

public class Inventory {
	
	public DoublyLinkedList<Part> inventory = new DoublyLinkedList<Part>();

	/**
	 * @param part
	 */
	public void sortedInsert(Part part) {
		inventory.resetCurrentElement();
		int location = 0;
		while (inventory.hasMoreElements()
				&& inventory.nextElement().compareTo(part) < 0) {
			location++;
		}
		inventory.insertAt(part, location);

	}

	/**
	 * @return total value
	 */
	public double totalInventoryValue() {
		double value = 0;
		inventory.resetCurrentElement();
		while (inventory.hasMoreElements()) {
			value += inventory.nextElement().getValue();
		}
		return value;
	}

	public String searchByColor(String color) {
		String partsWithColor = "";
		inventory.resetCurrentElement();
		while (inventory.hasMoreElements()) {
			Part part = inventory.nextElement();
			if (part.getColor().equals(color)) {
				partsWithColor += "\n" + part.toString();
			}
		}
		return partsWithColor;
	}

	/**
	 * @return heaviest part
	 */
	public String heaviestPart() {
		inventory.resetCurrentElement();
		Part heaviestPart = inventory.nextElement();
		while (inventory.hasMoreElements()) {
			Part part = inventory.nextElement();
			if (part.getWeight() > heaviestPart.getWeight()) {
				heaviestPart = part;
			}
		}
		return heaviestPart.toString();
	}

	/**
	 * @param partName
	 * @return num parts in stock
	 */
	public int numPartsInStock(String partName) {
		int numPartsInStock = 0;
		inventory.resetCurrentElement();
		while (inventory.hasMoreElements()) {
			Part part = inventory.nextElement();
			if (part.getName().equals(partName)) {
				numPartsInStock += part.getAmountInStock();
			}
		}
		return numPartsInStock;
	}
}
