import java.io.File;
import java.util.List;

import food_group_fruits.storage.Storage;
import model.Fruit;

public class Main {

	public Main() {
		super();
	}

	public static void main(String[] args) {
		try {
			String slash = File.separator;
			Storage storage = new Storage("C:" + slash + "TEMP", "generic_food.csv");
			List<Fruit> fruits = storage.list();

			if (fruits.size() > 0) {
				for (Fruit fruit : fruits) {
					String output = fruit.getFOOD_NAME() + "\t" + fruit.getSCIENTIFIC_NAME() + "\t"
							+ fruit.getSUBGROUP();
					System.out.println(output);
				}
			} else {
				System.err.println("Nenhuma Fruta encontrada.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
