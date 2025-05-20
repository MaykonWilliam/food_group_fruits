package food_group_fruits.storage;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import model.Fruit;

public class Storage {

	protected final String storagePath;
	protected final String fileName;
	protected final String filePath;

	public Storage(String storagePath, String fileName) throws Exception {
		this.storagePath = storagePath;
		this.fileName = fileName;
		this.filePath = this.storagePath + File.separator + this.fileName;

		this.createPathIfNotExists();
		this.checkFileExists();
	}

	protected void createPathIfNotExists() {
		try {
			File file = new File(this.storagePath);
			if (!file.exists()) {
				file.mkdirs();
			}
		} catch (Exception e) {
			System.err.println("Erro ao criar o diretório(" + this.storagePath + "): " + e.getMessage());
		}
	}

	protected void checkFileExists() throws Exception {
		try {
			File file = new File(this.filePath);
			if (!file.exists()) {
				throw new Exception("Arquivo não encontrado.");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Fruit> list() {

		List<Fruit> list = new ArrayList<Fruit>();

		try {
			FileReader fileReader = new FileReader(this.filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();
			while (line != null) {

				String[] data = line.split(",");

				if (data[2].equals("Fruits")) {

					Fruit fruit = new Fruit(data[0], data[1], data[2], data[3]);

					list.add(fruit);
				}

				line = bufferedReader.readLine();
			}

			bufferedReader.close();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return list;
	}

}
